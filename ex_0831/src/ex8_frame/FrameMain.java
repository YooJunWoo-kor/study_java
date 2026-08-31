package ex8_frame;

import java.awt.*;
import java.awt.event.*;

public class FrameMain {
    //x누르면 새 frame창 종료할까요?
    // 네 아니오
    // 네 누르면 다 종료
    // 아니요 누르면 해당 창만 종료
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 100, 400, 300);
        f.setLayout(null);
        Label q = new Label("main 프레임");
        q.setBounds(100,100,200,150);
        Font font = new Font("궁서체", Font.BOLD, 30);
        q.setFont(font);

        f.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                NewFrame nf = new NewFrame(f);
            }
        });
        f.add(q);

        f.setVisible(true);


    }
}

