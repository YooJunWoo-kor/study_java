package ex1_choice;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceMain {
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.setBounds(500, 100,400, 300);
        f.setLayout(null);

        Choice day = new Choice();
        day.add("일요일");
        day.add("월요일");
        day.add("화요일");
        day.add("수요일");

        

        day.setBounds(50, 50, 120, 0); 
        //Choice 높이는 font 영역인 글자크기에 따라서 결정되기 때문에 따로 설정 안해도됨 그래서 0임

        //Choice객체에 감지자 등록
        day.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(java.awt.event.ItemEvent e) {
            System.out.println(day.getSelectedItem());
            //어떤 메뉴를 택했는지 보여주는 getSelectedItem
        }
        });

        //프레임에 Choice객체 추가
        f.add(day);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }
}
