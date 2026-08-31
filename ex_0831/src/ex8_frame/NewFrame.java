package ex8_frame;

import java.awt.event.*;
import java.awt.*;

public class NewFrame extends Frame{

    public NewFrame(Frame f){

        setBounds(550, 160, 300, 180);
        setLayout(null);
        Label q1 = new Label("종료할까요 ? ");
        Font font = new Font("궁서체", Font.BOLD, 30);
        q1.setFont(font);
        q1.setBounds(60, 30, 250, 45);

        Button btn1 = new Button("네");
        btn1.setBounds(80, 95, 60, 35);

        Button btn2 = new Button("아니오");
        btn2.setBounds(160, 95, 60, 35);

        //프레임에 버튼 추가


        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(e.getActionCommand()){
                    case "네":
                        System.exit(0);
                        break;

                    case "아니오":
                        dispose();
                }
                
            }

        };
        add(btn1); add(q1);
        add(btn2);
        setVisible(true);
        btn1.addActionListener(action);
        btn2.addActionListener(action);
        
    }
}
