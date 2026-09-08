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

        Label title = new Label("이용약관에 동의하십니까?");
        title.setForeground(Color.WHITE);
        title.setFont(font);
        title.setAlignment(Label.CENTER);
        title.setBounds(0, 5, 700, 35);
        titleBar.add(title);
        title.setFont(new Font("굴림", Font.BOLD, 18));
        // 여기까지 창에 윈도우스킨 입히는 코드

        ImageIcon disagree_img = new ImageIcon("src/images/동의안함.png");
        ImageIcon agree_img = new ImageIcon("src/images/동의한다.png");
        
        String s = "권리 귀속에 대하여\n\n이 게임 및 이 게임을 제공하는 웹사이트에 관한 이미지, 영상, 음성, 로고, 문장, 프로그램, 개발자의 피와 땀과 눈물 등의 저작권 등 제반\n권리는 권리 표시 유무와 관계없이 개발자에게 귀속됩니다";
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
                buttonlist[i].setVisible(true);
                buttonlist[i].setContentAreaFilled(false);
                buttonlist[i].setBorderPainted(false);
                buttonlist[i].setText("동의한다");
                buttonlist[i].setFocusPainted(false);
            }
            else {
                buttonlist[i] = new JButton(disagree_img);
                buttonlist[i].setVisible(true);
                buttonlist[i].setContentAreaFilled(false);
                buttonlist[i].setBorderPainted(false);
                buttonlist[i].setText("동의안함");
                buttonlist[i].setFocusPainted(false);
            }
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