package ui1_main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class ClearFrame extends Frame {

    private CreditsCanvas creditsCanvas;
    private StartFrame start;

    private Image bg =
        Toolkit.getDefaultToolkit().getImage("src/image/크레딧배경.png");

    public ClearFrame(StartFrame start) {

        this.start = start;

        setTitle("GAME CLEAR");

        //전체화면
        setUndecorated(true);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        
        //Canvas가 화면 전체를 채우게
        setLayout(new BorderLayout());

        creditsCanvas = new CreditsCanvas();

        add(creditsCanvas, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                creditsCanvas.stopCredits();
                dispose();
                start.showMainButtons();
            }
        });

        setVisible(true);

        creditsCanvas.startCredits();

    }

    class CreditsCanvas extends Canvas {

        private int creditY = 750;
        private Timer timer;
        private String[] credits = {

                "GAME CLEAR",
                "",
                "동의하시겠습니까?",
                "",
                "===제작===",
                "",
                "박경윤",
                "이창민",
                "유준우",
                "허우진",
                "홍준우",
                "",
                "=== 제 1조 ===",
                "제작자 : 박경윤",
                "",
                "=== 제 2조 ===",
                "제작자 : 허우진, 홍준우",
                "",
                "=== 제 3조 ===",
                "제작자 : 이창민",
                "",
                "=== 제 4조 ===",
                "제작자 : 유준우",
                "",
                "=== 제 5조 ===",
                "제작자 : 이창민",
                "",
                "=== 제 6조 ===",
                "제작자 : 이창민",
                "",
                "",
                "Thank You For Playing",
                "",
                "THE END"
        };

        public CreditsCanvas() {
            setBackground(Color.BLACK);
        }

        public void startCredits() {

            // 30ms마다 실행
            timer = new Timer(30, new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    // 위쪽으로 이동
                    creditY -= 3;

                    repaint();

                    // 모든 크레딧이 위로 올라간 뒤 종료
                    int totalHeight = credits.length * 45;

                    if (creditY + totalHeight < 0) {
                        timer.stop();

                        //엔딩크레딧 창 자동 종료
                        ClearFrame.this.dispose();

                        //시작 화면 버튼 다시 표시
                        start.showMainButtons();
                    }

                }

            });

            timer.start();

        }

        public void stopCredits() {
            if (timer != null) {
                timer.stop();
            }
        }

        @Override
        public void paint(Graphics g){
            
            //배경 이미지
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);

            g.setColor(Color.BLACK);

            int y = creditY;

            for(String text : credits){

                if(text.equals("GAME CLEAR")){

                    g.setFont(new Font("맑은 고딕", Font.BOLD, 55));

                } else if(text.equals("THE END")){

                    g.setFont(new Font("맑은 고딕", Font.BOLD, 50));

                } else if(text.startsWith("===")){
                    
                    g.setFont(new Font("맑은 고딕", Font.BOLD, 35));

                } else {

                    g.setFont(new Font("맑은 고딕", Font.BOLD, 30));

                }

                FontMetrics fm = g.getFontMetrics();

                //글자를 가운제 정렬
                int x = (getWidth() - fm.stringWidth(text)) / 2;

                g.drawString(text, x, y);

                y += 45;

            }

        }

    }

}
