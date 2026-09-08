package forge;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.*;
import ui1_main.TermsFrame;

public class MainFrame {

    Random rnd = new Random();
    private Frame f;
    private Panel pf;
    private JLabel weaponImage;
    private Label weaponLabel;
    private ImageIcon[] weaponIcon;
    private int plus;
    private int life;
    private List<Weapon> weaponList;
    private JButton[] upBtn; 
    private JButton agreeBtn;

    private ImageIcon lockIcon = new ImageIcon("src/images/잠긴동의.png");
    private ImageIcon openIcon = new ImageIcon("src/images/동의함.png");
    private ImageIcon disAgreeIcon = new ImageIcon("src/images/동의안함.png");
    private ImageIcon xIcon = new ImageIcon("src/images/X.png");

    private Font font2 = new Font("", Font.PLAIN, 20);

    public void setPlus(int plus) {
        this.plus = plus;
    }

    private TermsFrame terms;

    public MainFrame(List<Weapon> weaponList, TermsFrame terms) {

        this.terms = terms;

        this.weaponList = weaponList;
        plus = 0;
        life = 2; //치트키

        f = new Frame();
        f.setLayout(null);
        f.setUndecorated(true);
        f.setBackground(Color.BLUE);
        f.setBounds(350, 100, 1000, 700);

        Font titleFont = new Font("", Font.BOLD, 25);
        Label name = new Label("검 강화하기");
        name.setBounds(30, 15, 400, 30);
        name.setFont(titleFont);
        name.setForeground(Color.WHITE);

        pf = new Panel();
        pf.setLayout(null);
        pf.setBackground(Color.WHITE);
        pf.setBounds(5, 60, 990, 635);

        weaponIcon = new ImageIcon[weaponList.size()];
        for (int i = 0; i < weaponIcon.length; i++) {
            weaponIcon[i] = new ImageIcon("src/weaponimage/" + i + ".png");
        }
        weaponImage = new JLabel(weaponIcon[plus]);
        weaponImage.setBounds(200, 50, 300, 300);
        pf.add(weaponImage);

        Font font = new Font("", Font.BOLD, 40);
        weaponLabel = new Label("+0 낡은검");
        weaponLabel.setBounds(420, 420, 400, 60);
        weaponLabel.setFont(font);
        pf.add(weaponLabel);

        JButton disAgreeBtn = new JButton(disAgreeIcon);
        disAgreeBtn.setBounds(320, 540, 111, 42);
        disAgreeBtn.setContentAreaFilled(false);
        disAgreeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                terms.resetterms();
                terms.setVisible(true);

                f.dispose();
            }
        });

        agreeBtn = new JButton(lockIcon); // 초기에는 잠긴 이미지
        agreeBtn.setBounds(610, 540, 111, 42);
        agreeBtn.setBorderPainted(false);
        agreeBtn.setContentAreaFilled(false);

        pf.add(disAgreeBtn);
        pf.add(agreeBtn);

        makeButton(plus);

        f.add(name);
        f.add(pf);

        f.setVisible(true);
        
    }

    public void upgradeWeapon(int plus) {
        this.plus++;
        if (this.plus == weaponList.size()) {
            agree(f);
            return;
        }
        weaponImage.setIcon(weaponIcon[this.plus]);
        weaponLabel.setText(weaponList.get(this.plus).getName());

        makeButton(this.plus);
    }

    public void makeButton(int plus) {
        if (upBtn != null) {
            for (int i = 0; i < upBtn.length; i++) {
                if (upBtn[i] != null)
                    pf.remove(upBtn[i]);
            }
        }

        upBtn = new JButton[plus + 1];
        int suc = rnd.nextInt(plus + 1);

        for (int i = 0; i < upBtn.length; i++) {
            final int index = i;

            upBtn[i] = new JButton("강화!");
            upBtn[i].setFont(font2);

            if (i <= 1)
                upBtn[i].setBounds(550, (i + 1) * 110, 100, 100);
            else
                upBtn[i].setBounds(700, (i - 1) * 110, 100, 100);

            upBtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {                    
                    JButton b = (JButton)e.getSource();
                    if (index == suc) {
                        upgradeWeapon(plus);
                    } else {
                        b.setEnabled(false);
                        disAgree(f);
                    }
                }
            });

            pf.add(upBtn[i]);
        }

        pf.repaint();
    }

    public void agree(Frame f) {
        agreeBtn.setIcon(openIcon);
        agreeBtn.setEnabled(true);
        agreeBtn.setBorderPainted(true);
        agreeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();

                terms.thirdAgree();
                terms.setVisible(true);
            }
        });

        Dialog agree = new Dialog(f, true);
        agree.setLayout(null);
        agree.setUndecorated(true);
        agree.setBackground(Color.BLUE);
        agree.setBounds(f.getX() + 300, f.getY() + 250, 400, 200);

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

        Label failed;
        Label failed2;

        Dialog disAgree = new Dialog(f, true);
        disAgree.setLayout(null);
        disAgree.setUndecorated(true);
        disAgree.setBackground(Color.BLUE);
        disAgree.setBounds(f.getX() + 300, f.getY() + 200, 400, 250);

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

        if (life > 0) {
            life--;
            failed = new Label("강화 실패!");
            failed2 = new Label("남은 기회 " + life +"번");
        } else {
            failed = new Label("동의할 방법이");
            failed2 = new Label("없어졌습니다");
            if (upBtn != null) {
                for (int i = 0; i < upBtn.length; i++) {
                    if (upBtn[i] != null)
                        pf.remove(upBtn[i]);
                }
                pf.repaint();
            }
        }

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
    }
}