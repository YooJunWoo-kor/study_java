package find;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import ui1_main.TermsFrame;

public class MainFrame {

    private AgreeButton[] buttons;
    private JFrame f;
    private String msg;
    private JButton btn;
    private TermsFrame terms;
    private FindThread2 ft2;
    

    private ImageIcon xIcon = new ImageIcon("src/images/X.png");
    private ImageIcon agrIcon = new ImageIcon("src/images/동의한다.png");

    public MainFrame(TermsFrame terms) {

        this.terms = terms;

        f = new JFrame();
        f.setLayout(null);
        f.setUndecorated(true);
        f.setBackground(new Color(0,0,0,0));
        f.setBounds(100, 30, 1270, 900);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                terms.resetterms();
                terms.setVisible(true);
            }
        });

        buttons = new AgreeButton[240];

        int r = new Random().nextInt(buttons.length);

        for (int i = 0; i < buttons.length; i++) {

            if (i == r) {
                msg = "동의한다";
            } else {
                msg = "동의안함";
            }

            buttons[i] = new AgreeButton(i, msg);

            btn = buttons[i].getBtn();

            btn.addActionListener(al);

            f.add(btn);

        }

        f.setVisible(true);

        //MainFrame에서 전체 시간이 흐르는 thread 호출
        ft2 = new FindThread2(terms, buttons, f);

        ft2.setDaemon(true);
        ft2.start();

    }

    ActionListener al = new ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {

            switch (e.getActionCommand()) {
                case "동의안함":
                    disAgree(f);
                    f.dispose();
                    ft2.setIsRun(false);
                    break;

                case "동의한다":
                    agree(f);
                    f.dispose();
                    ft2.setIsRun(false);
                    break;

            }
        };
    };

    public void disAgree(Frame f) {

        Frame disAgree = new Frame();
        disAgree.setLayout(null);
        disAgree.setUndecorated(true);
        disAgree.setBackground(Color.BLUE);
        disAgree.setBounds(f.getX() + 400, f.getY() + 400, 400, 200);

        JButton ex = new JButton(xIcon);
        ex.setBounds(360, 5, 35, 35);
        ex.setBorderPainted(false);
        ex.setContentAreaFilled(false);
        ex.setFocusPainted(false);
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disAgree.dispose();
            }
        });

        Panel innerPf = new Panel();
        innerPf.setLayout(null);
        innerPf.setBackground(Color.WHITE);
        innerPf.setBounds(5, 45, 390, 150);

        Label pass = new Label("동의실패!");
        Font font = new Font("", Font.BOLD, 22);
        pass.setFont(font);
        pass.setBounds(150, 50, 180, 40);

        terms.resetterms();
        terms.setVisible(true);

        innerPf.add(pass);
        disAgree.add(ex);
        disAgree.add(innerPf);

        disAgree.setVisible(true);

    }

    public void agree(Frame f) {

        Frame agree = new Frame();

        agree.setLayout(null);
        agree.setUndecorated(true);
        agree.setBackground(Color.BLUE);
        agree.setBounds(f.getX() + 400, f.getY() + 400, 600, 400);

        Panel innerPf = new Panel();
        innerPf.setLayout(null);
        innerPf.setBackground(Color.WHITE);
        innerPf.setBounds(5, 45, 590, 350);

        JButton agrBtn = new JButton(agrIcon);
        agrBtn.setBounds(225, 250, 152, 57);
        agrBtn.setBorderPainted(false);
        agrBtn.setContentAreaFilled(false);
        agrBtn.setFocusPainted(false);
        agrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agree.dispose();
                terms.lastAgree();
            }
        });

        Font titleFont = new Font("", Font.BOLD, 22);
        Label name = new Label("이용약관 【제6조】에 동의하십니까?");
        name.setBounds(30, 10, 400, 25);
        name.setFont(titleFont);
        name.setForeground(Color.WHITE);

        String str = "6조 당신의 인생에 대하여\n\n(1) 당신의 인생에서 본 게임은 그저 ​아주 작은 시간 때우기에 불과하다는 것을 이해하는 것으로 합니다.\n\n(2) 본 게임의 이용약관에 동의할 수 없다는 이유로 진심으로 화를 낼 만큼, 인생은 길지 않습니다.\n\n(3) 그리고 지금, 당신이 이 조항을 여기까지 읽고 있다는 것만으로도 당신은 세계에서도 몇 안 되는 「이용약관을 진지하게 읽는 플레이어」 중 한 명이 됩니다.\n\n(4) 앞으로 당신은 이용약관을 건너뛰지 않고 읽을 것을 맹세하는 것으로 합니다.단, 개발자는 앞으로도 이용약관을 제대로 읽을 계획이 전혀 없습니다.";
        TextArea text = new TextArea(str, 0, 0, TextArea.SCROLLBARS_NONE);
        text.setEditable(false);
        text.setBounds(20, 20, 550, 200);
        text.setFont(new Font("", Font.PLAIN, 18));

        agree.add(name);
        innerPf.add(text);
        innerPf.add(agrBtn);
        agree.add(innerPf);

        agree.setVisible(true);

    }

}
