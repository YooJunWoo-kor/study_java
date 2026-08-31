package ex7_frame;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameMain {
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(500, 100, 700, 300);
        Font font = new Font("궁서체", Font.BOLD, 30);
        
        //질문1
        Label q1 = new Label("1.관심 분야는 무엇입니까?");
        q1.setFont(font);
        q1.setBackground(Color.YELLOW);
        q1.setBounds(50, 30, 400, 30);

        //checkbox생성
        Checkbox news = new Checkbox("뉴스");
        news.setBounds(50, 65, 100, 30);

        Checkbox sports = new Checkbox("운동");
        sports.setBounds(160, 65, 100, 30);

        //체크박스의 선택 여부 판단
        ItemListener item = new ItemListener() {

            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                
                String cb = (String)e.getItem();
                String res = "";
                
                switch(cb){
                    case "뉴스" : 
                        res = e.getStateChange() == 1 ? "뉴스 선택" : "뉴스 선택해제";
                        break;
                    
                    case "운동" :
                        res = e.getStateChange() == 1 ? "스포츠 선택" : "스포츠 선택해제";
                        break;
                }

                System.out.println(res);

            }

        };

        news.addItemListener(item);
        sports.addItemListener(item);

        Label q2 = new Label("2. 메일 수신 여부");
        q2.setFont(font);
        q2.setBounds(50, 100, 400, 30);

        //라디오버튼
        CheckboxGroup group = new CheckboxGroup();
        Checkbox yes = new Checkbox("y", group, true);
        Checkbox no = new Checkbox("n", group, false);
        yes.setBounds(50,135,100,30);
        no.setBounds(160,135,100,30);

        //라디오버튼에 이벤트 감지자
        ItemListener itemRadio = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                //System.out.println((String)e.getItem());

                switch ((String)e.getItem()) {
                    case "y":
                        System.out.println("메일수신 함");
                        break;
                
                    case "n":
                        System.out.println("메일수신 안함");
                        break;
                }

            }
        };

        yes.addItemListener(itemRadio);
        no.addItemListener(itemRadio);

        yes.setVisible(true);
        no.setVisible(true);

        //프레임에 추가
        f.add(q1);
        f.add(news); f.add(sports);
        f.add(q2); 
        f.add(yes); f.add(no);

        f.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
        
    }
}
