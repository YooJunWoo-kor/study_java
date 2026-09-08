package find;

import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ui1_main.TermsFrame;

import javax.swing.*;

public class FindThread2 extends Thread {

    Random rnd = new Random();
    private AgreeButton[] buttons;
    private Frame f;
    private FindThread ft;
    private int[] picks = new int[20];
    private TermsFrame terms;
    private boolean isRun;

    public boolean isRun() {
        return isRun;
    }

    public void setIsRun(boolean isRun) {
        this.isRun = isRun;
    }

    private ImageIcon disAgreeIcon = new ImageIcon("src/images/동의안함.png");

    public FindThread2( TermsFrame terms, AgreeButton[] buttons, Frame f ) {

        this.terms = terms;
        this.f = f;
        this.buttons = buttons;

        isRun = true;

    }

    @Override
    public void run() {

        firstPick();

        int count = 200;

        while (count >= 0) {

            AgreeButton but0 = buttons[picks[0]];
            AgreeButton but1 = buttons[picks[1]];

            if (but0.getMoveCount() == 0 && but1.getMoveCount() == 0) {

                but0.setMoveCount(50);
                but1.setMoveCount(50);

                f.repaint();

                ft = new FindThread(buttons, picks[0], picks[1]);
                
                ft.setDaemon(true);

                ft.start();

            }

            try {

                Thread.sleep(250);

            } catch (Exception e) {

            }

            swap();

            count--;

        }

        if(isRun)   disAgree(f);
            
        f.dispose();

    }

    public void disAgree(Frame f) {

        Frame disAgree = new Frame();
        disAgree.setLayout(null);
        disAgree.setUndecorated(true);
        disAgree.setBackground(Color.BLUE);
        disAgree.setBounds(f.getX() + 400, f.getY() + 400, 400, 200);

        Panel innerPf = new Panel();
        innerPf.setLayout(null);
        innerPf.setBackground(Color.WHITE);
        innerPf.setBounds(5, 5, 390, 190);

        JButton disBtn = new JButton(disAgreeIcon);
        disBtn.setBounds(140, 80, 111, 42);
        disBtn.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disAgree.dispose();
            }
        });

        terms.resetterms();
        terms.setVisible(true);

        Label pass = new Label("시간초과!");
        Font font = new Font("", Font.BOLD, 22);
        pass.setFont(font);
        pass.setBounds(150, 20, 180, 30);

        innerPf.add(pass);
        innerPf.add(disBtn);
        disAgree.add(innerPf);

        disAgree.setVisible(true);

    }

    public void firstPick() {

        outer: for (int i = 0; i < picks.length;) {

            picks[i] = rnd.nextInt(buttons.length);

            for (int j = 0; j < i; j++) {

                if (picks[j] == picks[i])
                    continue outer;

            }

            i++;

        }

    }

    public void swap() {

        for (int i = 0; i < picks.length - 2; i++) {

            picks[i] = picks[i + 2];

        }

        outer: for (int i = picks.length - 2; i < picks.length;) {

            picks[i] = rnd.nextInt(buttons.length);

            for (int j = 0; j < i; j++) {

                if (picks[i] == picks[j])
                    continue outer;

            }

            if (buttons[picks[i]].getMoveCount() > 0)
                continue outer;

            i++;

        }

    }

}
