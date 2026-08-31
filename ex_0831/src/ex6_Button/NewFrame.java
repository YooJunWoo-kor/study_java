package ex6_Button;

import java.awt.*;
import java.awt.event.*;

public class NewFrame extends Frame {
   
    public NewFrame(Frame f){

        setBounds(f.getX() + 100, f.getY() + 100, 200, 100);
        setBackground(Color.YELLOW);

        addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //열려있는 모든 프레임을 종료
                //System.exit(0);

                //현재 프레임만 단독으로 종료
                dispose();
            }
        });
        
        //새로 생성되는 현재 프레임의 크기를 고정
        setResizable(false);

        setVisible(true);
    }    

    
}
