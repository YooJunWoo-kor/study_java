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

    public MainFrame(TermsFrame terms) {

        this.terms = terms;

        f = new JFrame();
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(100, 30, 1300, 1000);

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

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                terms.resetterms();
                terms.setVisible(true);
                f.dispose();
            }
        });

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
        agree.setBounds(f.getX() + 400, f.getY() + 400, 400, 200);

        JButton ex = new JButton(xIcon);
        ex.setBounds(350, 5, 35, 35);
        ex.setBorderPainted(false);
        ex.setContentAreaFilled(false);
        ex.setFocusPainted(false);
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agree.dispose();
                terms.lastAgree();
            }
        });

        Panel innerPf = new Panel();
        innerPf.setLayout(null);
        innerPf.setBackground(Color.WHITE);
        innerPf.setBounds(5, 5, 390, 190);

        Label pass = new Label("동의성공!");
        Font font = new Font("", Font.BOLD, 22);
        pass.setFont(font);
        pass.setBounds(150, 70, 180, 40);

        innerPf.add(pass);
        innerPf.add(ex);
        agree.add(innerPf);

        agree.setVisible(true);

    }

}
