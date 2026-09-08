package miniproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ui1_main.TermsFrame;

public class GameOverFrame {

    private TermsFrame terms;

    public GameOverFrame (TermsFrame terms){

        this.terms = terms;

    }

    public void show(Frame f, Frame infoFrame, Frame timerFrame) {

        //게임오버가 되는 순간 게임 관련 창 전부 닫기
        if(f != null){
            f.dispose();
        }

        if(infoFrame != null){
            infoFrame.dispose();
        }

        if(timerFrame != null){
            timerFrame.dispose();
        }

        Frame overFrame = new Frame();

        overFrame.setLayout(null);
        overFrame.setUndecorated(true);
        overFrame.setBackground(Color.BLUE);
        overFrame.setBounds(625, 375, 400, 300);

        Button title = new Button("타이틀로 돌아가기") {

            Image img = Toolkit.getDefaultToolkit().getImage("src/image/타이틀로 돌아가기.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };

        title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //게임오버 창 닫기
                overFrame.dispose();
                
                if(terms != null){
                    terms.resetterms();
                    terms.setVisible(true);
                }

            }
        });

        title.setBounds(0, 0, 400, 300);

        overFrame.add(title);

        overFrame.setAlwaysOnTop(true);
        overFrame.setVisible(true);
        overFrame.toFront();

    }

}
