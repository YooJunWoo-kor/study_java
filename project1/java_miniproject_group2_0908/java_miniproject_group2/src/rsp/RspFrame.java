package rsp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import ui1_main.TermsFrame;

import javax.swing.*;

public class RspFrame {

    private JFrame f;
    private JPanel pf;
    private Dialog agree;
    private Dialog disAgree;

    private JLabel com;
    private JLabel myLabel;
    private JLabel count;
    private JButton agreeBtn;
    private JButton replay;
    private ImageIcon[] coms;
    private ImageIcon[] my;
    private JButton[] rsp;
    private boolean isRot = true;
    private int win, draw, lose, myRsp, comRsp;
    private ImageIcon lockIcon = new ImageIcon("src/images/잠긴동의.png");
    private ImageIcon openIcon = new ImageIcon("src/images/동의함.png");
    private ImageIcon disAgreeIcon = new ImageIcon("src/images/동의안함.png");
    private ImageIcon xIcon = new ImageIcon("src/images/X.png");

    public int getComRsp() {
        return comRsp;
    }

    public void setComRsp(int comRsp) {
        this.comRsp = comRsp;
    }

    public int getWin() {
        return win;
    }

    public int getDraw() {
        return draw;
    }

    public int getLose() {
        return lose;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public boolean isRot() {
        return isRot;
    }

    public void setRot(boolean isRot) {
        this.isRot = isRot;
    }

    private TermsFrame terms;

    public RspFrame( TermsFrame terms ) {

        win = 0;
        draw = 0;
        lose = 0;
        comRsp = 0;

        f = new JFrame();
        f.setLayout(null);
        f.setUndecorated(true);
        f.getContentPane().setBackground(Color.BLUE);
        f.setBounds(500, 200, 650, 500);

        Font titleFont = new Font("", Font.BOLD, 25);
        Label name = new Label("가위바위보");
        name.setBounds(30, 15, 300, 30);
        name.setFont(titleFont);
        name.setForeground(Color.WHITE);

        pf = new JPanel();
        pf.setLayout(null);
        pf.setBackground(Color.WHITE);
        pf.setBounds(5, 60, 640, 435);

        coms = new ImageIcon[3];
        String[] rspS = { "p", "r", "s" };
        for (int i = 0; i < coms.length; i++) {
            coms[i] = new ImageIcon("src/images/c" + rspS[i] + ".png");
        }

        com = new JLabel(coms[0]);
        com.setBounds(50, 20, 175, 157);

        ImageIcon vsI = new ImageIcon("src/images/vs.jpg");
        JLabel vs = new JLabel(vsI);
        vs.setBounds(245, 20, 150, 150);

        my = new ImageIcon[3];
        for (int i = 0; i < my.length; i++) {
            my[i] = new ImageIcon("src/images/u" + rspS[i] + ".png");
        }

        myLabel = new JLabel(my[0]);
        myLabel.setBounds(415, 20, 175, 157);

        Font font = new Font("", Font.BOLD, 15);
        count = new JLabel(win + " win " + draw + " draw " + lose + " lose");
        count.setBounds(260, 210, 300, 30);
        count.setFont(font);

        JButton disAgreeBtn = new JButton(disAgreeIcon);
        disAgreeBtn.setBounds(65, 360, 111, 42);
        disAgreeBtn.setContentAreaFilled(false);
        disAgreeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                if( agree != null ){
                    agree.dispose();
                    agree = null;
                }
                if( disAgree != null){
                    disAgree.dispose();
                    disAgree = null;
                }
                terms.resetterms();
                terms.setVisible(true);
            }
        });

        agreeBtn = new JButton(lockIcon); 
        agreeBtn.setBounds(465, 360, 111, 42);
        agreeBtn.setBorderPainted(false);
        agreeBtn.setContentAreaFilled(false);
        agreeBtn.setEnabled(false);
        agreeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();

                terms.fifthAgree();
                terms.setVisible(true);
            }
        });

        pf.add(disAgreeBtn);
        pf.add(agreeBtn);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isRot = false;
                switch (e.getActionCommand()) {
                    case "가위":
                        myLabel.setIcon(my[2]);
                        myRsp = 2;
                        break;

                    case "바위":
                        myLabel.setIcon(my[1]);
                        myRsp = 1;
                        break;

                    case "보":
                        myLabel.setIcon(my[0]);
                        myRsp = 0;
                        break;
                }

                playRsp(myRsp, comRsp % 3);

                if (win == 3) {
                    agree(f);
                } else if (lose == 10) {
                    disAgree(f);
                }

            }

        };

        rsp = new JButton[3];
        String[] rspStr = { "가위", "바위", "보" };
        for (int i = 0; i < rsp.length; i++) {
            rsp[i] = new JButton(rspStr[i]);
            rsp[i].setBounds(200 * i + 70, 250, 100, 70);
            rsp[i].addActionListener(al);
            pf.add(rsp[i]); 
        }

        replay = new JButton("다시하기");
        replay.setBounds(270, 360, 100, 42);
        replay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isRot = true;
                comRsp = 0;
                for (int i = 0; i < rsp.length; i++) {
                    rsp[i].setEnabled(true);
                }
            }
        });

        pf.add(vs);
        pf.add(com);
        pf.add(myLabel);
        pf.add(count);
        pf.add(replay);

        f.add(name);
        f.add(pf);

        f.setVisible(true);

    }

    public void setLabel() {
        count.setText(win + " win " + draw + " draw " + lose + " lose");
    }

    public void setComI(int i, boolean isRot) {
        if (isRot)
            com.setIcon(coms[i]);
    }

    public void setMyI(int i, boolean isRot) {
        if (isRot)
            myLabel.setIcon(my[i]);
    }

    public int getMyRsp() {
        return myRsp;
    }

    public void playRsp(int myRsp, int comRsp) {
        switch (myRsp - comRsp) { // 0 : 보, 1 : 바위, 2 : 가위
            case 0:
                draw++;
                break; // 비김

            case -1:
            case 2:
                win++;
                break; // 이김

            case -2:
            case 1:
                lose++;
                break; // 짐

        }

        setLabel();

        for (int i = 0; i < rsp.length; i++)
            rsp[i].setEnabled(false);

    }

    public void agree(Frame f) {

        if( agree != null )
            agree.dispose();

        agreeBtn.setIcon(openIcon);
        agreeBtn.setEnabled(true);
        agreeBtn.setBorderPainted(true);
        
        agree = new Dialog(f, true);
        agree.setLayout(null);
        agree.setUndecorated(true);
        agree.setBackground(Color.BLUE);
        agree.setBounds(f.getX() + 125, f.getY() + 150, 400, 200);

        Panel innerPf = new Panel();
        innerPf.setLayout(null);
        innerPf.setBackground(Color.WHITE);
        innerPf.setBounds(5, 45, 390, 150);

        JButton ex = new JButton(xIcon);
        ex.setBounds(360, 5, 35, 35);
        ex.setBorderPainted(false);
        ex.setContentAreaFilled(false);
        ex.setFocusPainted(false);
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agree.dispose();
            }
        });
        agree.add(ex);

        Label pass = new Label("동의할 수 있게 되었습니다!");
        Font font = new Font("", Font.BOLD, 22);
        pass.setFont(font);
        pass.setBounds(50, 50, 310, 40);

        innerPf.add(pass);
        agree.add(innerPf);

        agree.setAlwaysOnTop(true);
        agree.setVisible(true);
    }

    public void disAgree(Frame f) { 

        if( disAgree != null )
            disAgree.dispose();

        replay.setEnabled(false);

        disAgree = new Dialog(f, true);
        disAgree.setLayout(null);
        disAgree.setUndecorated(true);
        disAgree.setBackground(Color.BLUE);
        disAgree.setBounds(f.getX() + 125, f.getY() + 125, 400, 250);

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
        disAgree.add(ex);

        Panel innerPf = new Panel();
        innerPf.setLayout(null);
        innerPf.setBackground(Color.WHITE);
        innerPf.setBounds(5, 45, 390, 200);

        Label failed = new Label("동의할 방법이");
        Label failed2 = new Label("없어졌습니다");

        Font font = new Font("", Font.BOLD, 28);
        failed.setFont(font);
        failed2.setFont(font);
        failed.setBounds(100, 40, 250, 40);
        failed2.setBounds(100, 90, 250, 40);

        innerPf.add(failed);
        innerPf.add(failed2);
        disAgree.add(innerPf);

        disAgree.setAlwaysOnTop(true);
        disAgree.setVisible(true);
        disAgree.addWindowListener(new WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent e) {
                disAgree.dispose();
            }

        });

    }

}
