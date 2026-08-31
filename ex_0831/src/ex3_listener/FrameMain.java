package ex3_listener;
import java.awt.*;
import java.awt.event.WindowListener;

public class FrameMain {
    
    public static void main(String[] args) {
        Frame f = new Frame();
        //f.setSize(300, 300);
        //f.setLocation(500, 200);
        f.setBounds(500, 200, 300,300); // location 정보와 size 정보를 한번에 만들 수 있는 메서드
        
        //우상단 x버튼 클릭 감지
        f.addWindowListener( new MyEvent() );

        f.setVisible(true);
    }
}
