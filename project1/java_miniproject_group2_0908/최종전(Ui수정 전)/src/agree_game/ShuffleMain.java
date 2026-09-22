package agree_game;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import ui1_main.TermsFrame;

public class ShuffleMain {

    public static void start(TermsFrame terms) {

        int x = 40;
        int y = 260;

        Frame f = new Frame();
        f.setUndecorated(true);
        f.setBounds(500, 100, 700, 500);
        f.setLayout(null);

        JButton[] buttonlist = new JButton[12];

        // 아래 코드들은 닫기버튼 구현
        ImageIcon close_img = new ImageIcon("src/images/닫기버튼.png");
        JButton closeButton = new JButton(close_img);
        closeButton.setContentAreaFilled(false);
        closeButton.setBorderPainted(false);
        closeButton.setBounds(660, 5, 35, 35);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                terms.setVisible(true);
                Timer.flag = false;
                terms.resetterms();
            }
        });
        
        f.add(closeButton);


        
        Font font = new Font("굴림", Font.PLAIN, 18);

        Label time = new Label("50");
        time.setBounds(10,5,35,35);
        time.setFont(font);
        time.setBackground(new Color(40, 100, 220));
        time.setForeground(Color.WHITE);
        
        f.add(time);

        Timer timer = new Timer(time, f, terms);
        timer.start();

        
        //여기부터
        Panel background = new Panel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(new Color(235, 235, 235));
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                g.setColor(new Color(30, 100, 220));
                g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
                super.paint(g);
            }
        };

        background.setBounds(0, 0, 700, 500);
        background.setLayout(null);
        f.add(background);

        Panel titleBar = new Panel();
        titleBar.setBackground(new Color(40, 100, 220));
        titleBar.setBounds(0, 0, 700, 45);
        titleBar.setLayout(null);
        background.add(titleBar);

        Label title = new Label("이용약관【제4조】에 동의하십니까?");
        title.setForeground(Color.WHITE);
        title.setFont(font);
        title.setAlignment(Label.CENTER);
        title.setBounds(0, 5, 700, 35); 
        titleBar.add(title);
        title.setFont(new Font("굴림", Font.BOLD, 18));
        // 여기까지 창에 윈도우스킨 입히는 코드

        ImageIcon disagree_img = new ImageIcon("src/images/동의안함.png");
        ImageIcon agree_img = new ImageIcon("src/images/동의한다.png");
        
        String s = "제4조 개인정보 취급에 대하여\n\n"+
        "(1) 이용자가 입력한 사용자 이름은 게임 내 랭킹 등에 공개됩니다. 장난으로 지은 이름이다, 별다른 의미는 없다와 같은 변명은 받아들이지 않습니다. 성인으로서 누구에게 보여도 당당할 수 있는 이름을 설정하는 것으로 합니다.\n\n"+
        "(2) 이용자는 게임 종료 시 「개인정보 삭제 주문」​을 외치는 것으로 자신의 데이터를 디지털 우주의 저편으로 날려 보낼 수 있습니다. 단, 이 주문은 달빛 아래에서 컴퓨터 앞에 서서 왼발을 세 번, 오른발을 두 번 구르면서 정확하게 외쳐야 합니다. 잘못된 방식으로 외칠 경우 예상하지 못한 결과가 발생할 수 있으므로 충분히 주의하시기 바랍니다.\n\n"+
        "(3) 또한 위의 「개인정보 삭제 주문」을 외치는 모습을 가족이나 친구에게 들켜 그 결과 관계가 심각하게 악화되더라도, 개발자는 이에 대해 어떠한 책임도 지지 않습니다.";
        JTextArea ta = new JTextArea(s);
        ta.setFont(font);
        ta.setBounds(40, 60, 620, 180);
        ta.setEditable(false);
        ta.setLineWrap(true);       
        ta.setFocusable(false);      
        background.add(ta);

        int r = new Random().nextInt(buttonlist.length);

        for (int i = 0; i < buttonlist.length; i++) {
            if (i == r) {
                buttonlist[i] = new JButton(agree_img);         
                buttonlist[i].setText("동의한다");
            }
            else {
                buttonlist[i] = new JButton(disagree_img);               
                buttonlist[i].setText("동의안함");
            }
                buttonlist[i].setVisible(true);
                buttonlist[i].setContentAreaFilled(false);
                buttonlist[i].setBorderPainted(false);                
                buttonlist[i].setFocusPainted(false);
        }

        ButtonListener listener = new ButtonListener(f, buttonlist, agree_img, disagree_img, terms);

        for (int i = 0; i < buttonlist.length; i++) {
            if (i % 4 != 0) {
                x += 160;
            }
            else {
                if (i != 0) {
                    x = 40;
                    y += 75;
                }
            }
            if(buttonlist[i].getIcon() == agree_img){
                buttonlist[i].setBounds(x + 5, y, 153, 57);
            }
            else{
                buttonlist[i].setBounds(x, y, 152, 57);
            }
            buttonlist[i].addActionListener(listener);
            background.add(buttonlist[i]);
        }

        f.setVisible(true);

        

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                terms.setVisible(true);
                Timer.flag = false;
                terms.resetterms();
            }
        });
    }
}