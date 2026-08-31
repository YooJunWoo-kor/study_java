package ex6_Button;

import java.awt.*;
import java.awt.event.*;

public class FrameMain {
    public static void main(String[] args) {
        
        Frame f = new Frame();
        
        f.setBounds(500,200,400,400);
        f.setLayout(null); // 자동배치를 끈다

        Button btn1 = new Button("확인");
        btn1.setBounds(50,100,100,150);

        Button btn2 = new Button("취소");
        btn2.setBounds(200,100,100,100);

        //프레임에 버튼 추가
        f.add(btn1);
        f.add(btn2);

        //버튼에 이벤트 감지자 추가
        ActionListener act = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("확인버튼 클릭함");
            }

        };

        

        btn1.addActionListener(act);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("취소버튼 클릭함");
            }
        });

        f.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
        
    }
}
