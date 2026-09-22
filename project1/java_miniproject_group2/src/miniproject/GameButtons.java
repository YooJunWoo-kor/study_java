package miniproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui1_main.StartFrame;
import ui1_main.TermsFrame;

public class GameButtons {

    private TermsFrame terms;
    private boolean[] gameOver;

    public void start(TermsFrame t, boolean[] gameOver) {
        terms = t;
        this.gameOver = gameOver;

    }

    Button left, right, up, down;
    Button no, yes, ex;

    public GameButtons() {

        left = new Button("←") {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/왼쪽.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        left.setBounds(277, 646, 81, 81);

        right = new Button("→") {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/오른쪽.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        right.setBounds(415, 646, 81, 81);

        up = new Button("↑") {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/위.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        up.setBounds(548, 646, 81, 81);

        down = new Button("↓") {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/아래.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        down.setBounds(681, 646, 81, 81);

        no = new Button("동의안함") {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/동의안함.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        no.setBounds(23, 646, 196, 81);

        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (terms == null) {
                    System.out.println("terms가 null입니다.");
                    return;
                }

                // 타이머 스레드 종료
                if (gameOver != null) {
                    gameOver[0] = true;
                }

                // 시작화면과 이용약관을 제외한 게임 프레임 종료
                Frame[] frames = Frame.getFrames();

                for (int i = 0; i < frames.length; i++) {

                    if (frames[i] != terms.getStart() && frames[i] != terms) {

                        frames[i].dispose();

                    }

                }

                //이용약관 초기화
                terms.resetterms();
                
                // 이용약관 다시 표시
                terms.setVisible(true);

            }
        });

        yes = new Button("동의한다") {
            Image lockimg = Toolkit.getDefaultToolkit().getImage("src/image/잠긴동의.png");
            Image openimg = Toolkit.getDefaultToolkit().getImage("src/image/동의함.png");

            @Override
            public void paint(Graphics g) {
                if (isEnabled()) {
                    g.drawImage(openimg, 0, 0, getWidth(), getHeight(), this);
                } else {
                    g.drawImage(lockimg, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        yes.setBounds(808, 646, 196, 81);
        yes.setEnabled(false); //치트키

        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (terms == null) {
                    System.out.println("terms가 null입니다. Minipro를 직접 실행하지 말고 Main에서 실행하세요.");
                    return;
                }

                // 게임 클리어 -> 타이머 스레드 종료
                if (gameOver != null) {
                    gameOver[0] = true;
                }

                Frame[] frames = Frame.getFrames();
                for (int i = 0; i < frames.length; i++) {
                    if (frames[i] != terms.getStart() && frames[i] != terms) {
                        frames[i].dispose();
                    }
                }

                terms.secondAgree();
                terms.setVisible(true);

            }
        });

        ex = new Button("X") {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/X.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        ex.setBounds(1015, 6, 29, 29); // 창 모서리 곡선에서 살짝 안쪽으로

        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameOver != null) {
                    gameOver[0] = true;
                }

                Frame[] frames = Frame.getFrames();

                for (int i = 0; i < frames.length; i++) {

                    if (frames[i] != terms.getStart() && frames[i] != terms) {

                        frames[i].dispose();
                    }

                }

                //이용약관 초기화
                terms.resetterms();

                //이용약관 다시 표시
                terms.setVisible(true);
                terms.toFront();

            }
        });
    }

    // 버튼 7개를 한 번에 f에 붙이기
    public void addAllTo(Frame f) {
        f.add(left);
        f.add(right);
        f.add(up);
        f.add(down);
        f.add(no);
        f.add(yes);
        f.add(ex);
    }
}
