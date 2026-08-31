package ex9_frame_calc;
import java.awt.*;
import java.awt.event.*;

public class CalcFrame extends Frame {

    String s = "";
    int num1 = 0;
    int num2 = 0;

    public CalcFrame(){
        setLayout(null);
        setBounds(500, 100, 400, 350);
        String[] sign = {"+", "-", "*", "/", "=" };
        int x = 20;
        int y = 40;
        int i = 0;



        Label q1 = new Label();
        Font font = new Font("궁서체", Font.BOLD, 30);
        q1.setFont(font);
        q1.setBounds(20, 200, 250, 50);
        add(q1);
        q1.setVisible(true);
    
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                s += e.getActionCommand();
                try {
                    num1 = Integer.parseInt(s);
                } catch (Exception ex) {
                    System.out.println("숫자를 입력해주세요");
                }

                

                q1.setText(s);
                
            }

        };


        for(i = 0; i < 10; i++){
            Button btn = new Button("" + i);
            btn.setBounds(x, y, 60, 40);
            x += 70;
            if((i == 4 || i == 9) && i != 0){
                x = 20;
                y += 50;
            }
            add(btn);
            btn.setVisible(true);
            btn.addActionListener(action);
        }


        for(i = 0; i < sign.length; i++){
            System.out.println(x);
            Button btn = new Button(sign[i]);
            btn.setBounds(x, y, 60,40);
            if(i != sign.length - 1)
                x += 70;
            add(btn);
            btn.setVisible(true);
            btn.addActionListener(action);
        }




        Button btn = new Button("C");
        btn.setBounds(x, y + 50,60,60);
        System.out.println(y);
        add(btn);
        btn.setVisible(true);
        btn.addActionListener(action);





        addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });




    }
}
