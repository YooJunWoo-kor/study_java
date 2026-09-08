package miniproject;

import java.awt.BasicStroke;
import java.awt.geom.RoundRectangle2D;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import ui1_main.TermsFrame;

public class MiniPro {

    private static TermsFrame terms;

    public static void start(TermsFrame t) {

        terms = t;

        main(null);

    }// start메서드

    public static void main(String[] arge) {

        int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                         { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
                         { 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1 },
                         { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 2, 1, 0, 1 },
                         { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                         { 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };
        Frame f = new Frame();

        f.setBounds(300, 150, 1050, 750);
        f.setLayout(null);
        f.setUndecorated(true);
        f.setBackground(Color.BLUE);

        boolean[] gameOver = { false };

        // 오른쪽에 띄울 설명서 창
        InfoWindow infoWindow = new InfoWindow();
        Frame infoFrame = infoWindow.build();

        // 설명서 창 아래에 띄울 타이머 창 (시간이 다 되면 처음 위치로 돌아가서 다시 시작해요)
        TimerFrame tf = new TimerFrame();
        tf.setBounds(1470, 570, 400, 200);

        Panel pf = new Panel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(new Color(250, 250, 250));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 23, 23);

                // 미로를 감싸는 남색 테두리 (pf 자기 좌표 기준: f좌표에서 -6, -40 만큼 당김)
                g2.setStroke(new BasicStroke(4));
                g2.setColor(new Color(30, 40, 90));
                g2.drawRoundRect(5, 248, 1033, 345, 23, 23);
            }
        };
        pf.setBounds(6, 40, 1038, 704);

        Font font = new Font("굴림", Font.BOLD, 23);

        Label lb1 = new Label("미로를 탈출하세요!");
        lb1.setBounds(404, 5, 404, 35);
        lb1.setFont(font);
        lb1.setForeground(Color.WHITE);

        TextArea text = new TextArea(
                "이 게임의 변경, 종료, 중단에 대하여\n\n(1) 개발자는 이용자에게 사전 통지를 하지않고 이 게임내용의 전부 또는 일부를 슬쩍 변경할 수 있습니다.\n\n(2) 개발자는 개발자의 판단에 따라 이 게임의 전부 또는 일부의제공을 종료할 수 있습니다",
                0, 0, TextArea.SCROLLBARS_NONE);
        text.setBounds(23, 92, 1004, 138);
        text.setFont(new Font("", Font.BOLD, 23));

        GameButtons buttons = new GameButtons();
        buttons.start(terms, gameOver);// 추가

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                // 타이머 스레드 종료
                gameOver[0] = true;

                // 미로 관련 창 종료
                f.dispose();
                infoFrame.dispose();
                tf.dispose();

                // 이용약관 다시 표시
                if(terms != null){
                    terms.setVisible(true);
                }
            }
        });

        MazePanel mazePanel = new MazePanel(maze, f);
        Label player = mazePanel.buildPlayer();

        MazeButtonListener listener = new MazeButtonListener(maze, mazePanel.user, player, buttons.yes, buttons.no,
                buttons.ex, gameOver, f, infoFrame, tf, terms);
        buttons.left.addActionListener(listener);
        buttons.right.addActionListener(listener);
        buttons.up.addActionListener(listener);
        buttons.down.addActionListener(listener);

        // 화살표 버튼 4개 중 2~4개가 랜덤한 시간마다 자리를 부드럽게 바꾸는 쓰레드
        DirectionThread dt = new DirectionThread(buttons.left, buttons.up,
        buttons.right, buttons.down, gameOver, f);
        dt.start();

        // 타이머가 다 됐을 때 할 일: 플레이어를 시작 위치로 되돌리고, 동의하기 버튼도 다시 잠그기
        Runnable restartGame = new Runnable() {
            @Override
            public void run() {
                mazePanel.user.reset();
                player.setBounds(mazePanel.user.playCol * 44 + 23, mazePanel.user.playRow * 46 + 288, 44, 44);
                buttons.yes.setEnabled(false);
                buttons.yes.repaint();
            }
        };

        TimerThread tt = new TimerThread(tf, gameOver, restartGame);
        tt.start();

        f.setFocusable(true);
        f.requestFocus();

        f.add(lb1);
        f.add(text);
        buttons.addAllTo(f);
        f.add(player);

        mazePanel.buildMaze();

        f.add(pf);
        f.setShape(new RoundRectangle2D.Double(0, 0, f.getWidth(), f.getHeight(), 23, 23));
        f.setVisible(true);

        infoFrame.setVisible(true);
        tf.setVisible(true);

    }// main
}
