package ui1_main;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartFrame extends Frame { //시작화면

    private Image bg =
        Toolkit.getDefaultToolkit().getImage("src/image/동의게임배경.png");

        private ImageButton2 startBtn;
        private ImageButton2 exBtn;

    public StartFrame() {

        setUndecorated(true);

        setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("【동의하기】 게임");
        setLayout(null);

        //x누르면 종료
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //게임시작 버튼
        startBtn = new ImageButton2("src/image/시작.png");

        startBtn.setBounds(850, 700, 200, 100);

        //게임종료 버튼
        exBtn = new ImageButton2("src/image/종료.png");

        exBtn.setBounds(850, 850, 200, 100);

        //게임시작버튼 리스너
        startBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(true);
                startBtn.setVisible(false);
                exBtn.setVisible(false);
                
                new TermsFrame(StartFrame.this);
            }
        });

        //게임종료버튼 리스너
        exBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        add(startBtn);
        add(exBtn);

        setVisible(true);
    }//StartFrame

    //이용약관 창이 닫혔을 때 호출
    public void showMainButtons(){

        startBtn.setVisible(true);
        exBtn.setVisible(true);

    }

    //배경화면
    @Override
    public void paint(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);

        // ImageButton2 같은 자식 컴포넌트를 그리기 위해 필요
        super.paint(g);

    }

}