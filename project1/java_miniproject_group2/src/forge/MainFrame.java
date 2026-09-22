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
        life = 3; // 치트키

        f = new Frame();
        f.setLayout(null);
        f.setUndecorated(true);
        f.setBackground(Color.BLUE);
        f.setBounds(350, 100, 800, 900); // 350,100,1000,700

        String str = "제3조 손해배상에 대하여 \n\n(1)이용자가 본 약관을 위반하거나 기타 이용자 본인의 책임으로 개발자에게 손해를 입힌 경우, 개발자는 엄청 화를 냅니다. 개발자는 해당 손해가 발생했거나 발생할 우려가 있는 경우, 이용자에게 그 원인이 되는 행위를 중단하도록 요구하고 싶은 마음으로 가득 차게 됩니다. 하지만 그럴 용기는 없기 때문에 아마 실제로 하지는 않을 것입니다.\n\n(2)개발자의 책임으로 인해 이용자에게 손해가 발생한 경우, 개발자는 이용자에게 ​온 힘을 다해 성심성의껏, 엄청나고 초절정 압도적인 얼티메이트 엎드려 사과하기를 실시하는 것으로 합니다.";
        TextArea text = new TextArea(str, 0, 0, TextArea.SCROLLBARS_NONE);
        text.setEditable(false);
        text.setBounds(20, 50, 760, 180);
        text.setFont(new Font("", Font.PLAIN, 23));

        Font titleFont = new Font("", Font.BOLD, 22);
        Label name = new Label("이용약관 【제3조】에 동의하십니까?");
        name.setBounds(30, 10, 400, 25);
        name.setFont(titleFont);
        name.setForeground(Color.WHITE);

        pf = new Panel();
        pf.setLayout(null);
        pf.setBackground(Color.WHITE);
        pf.setBounds(5, 40, 790, 855);

        weaponIcon = new ImageIcon[weaponList.size()];
        for (int i = 0; i < weaponIcon.length; i++) {
            weaponIcon[i] = new ImageIcon("src/weaponimage/" + i + ".png");
        }
        weaponImage = new JLabel(weaponIcon[plus]);
        weaponImage.setBounds(100, 300, 300, 300);
        pf.add(weaponImage);

        Font font = new Font("", Font.BOLD, 40);
        weaponLabel = new Label("+0 낡은검");
        weaponLabel.setBounds(300, 640, 400, 60);
        weaponLabel.setFont(font);
        pf.add(weaponLabel);

        JButton disAgreeBtn = new JButton(disAgreeIcon);
        disAgreeBtn.setBounds(200, 740, 111, 42);
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
        agreeBtn.setBounds(500, 740, 111, 42);
        agreeBtn.setBorderPainted(false);
        agreeBtn.setContentAreaFilled(false);

        pf.add(text);
        pf.add(disAgreeBtn);
        pf.add(agreeBtn);

        makeButton(plus);

        f.add(name);
        f.add(pf);

        f.setVisible(true);

    }

    public void upgradeWeapon(int plus) {
        // 강화에 성공하면 강화도 +1
        this.plus++;
        // 최대 강화에 성공하면 동의하기 활성
        if (this.plus == weaponList.size()) {
            agree(f);
            return;
        }
        // 아직 더 강화해야 하면 다음 무기의 정보 보여줌
        weaponImage.setIcon(weaponIcon[this.plus]);
        weaponLabel.setText(weaponList.get(this.plus).getName());
        // 버튼 갯수를 늘리는 메서드
        makeButton(this.plus);
    }

    public void makeButton(int plus) {
        // 이전 무기의 버튼 지우기
        if (upBtn != null) {
            for (int i = 0; i < upBtn.length; i++) {
                if (upBtn[i] != null)
                    pf.remove(upBtn[i]);
            }
        }

        upBtn = new JButton[plus + 1];
        // 랜덤 하나만 성공 버튼
        int suc = rnd.nextInt(plus + 1);

        for (int i = 0; i < upBtn.length; i++) {

            int index = i;

            upBtn[i] = new JButton("강화!");
            upBtn[i].setFont(font2);

            if (i <= 1)
                upBtn[i].setBounds(450, 200 + (i + 1) * 110, 100, 100);
            else
                upBtn[i].setBounds(600, 200 + (i - 1) * 110, 100, 100);

            upBtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // 누른 버튼이 성공버튼이면 강화
                    if (index == suc) {
                        upgradeWeapon(plus);
                        // 실패 했으면 해당버튼 비활성화 하고 후처리
                    } else {
                        upBtn[index].setEnabled(false);
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

        Label pass = new Label("동의할 수 있게 되었습니다!");
        Font font = new Font("", Font.BOLD, 22);
        pass.setFont(font);
        pass.setBounds(50, 50, 310, 40);

        innerPf.add(pass);
        agree.add(innerPf);
        agree.add(ex);

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

        // life가 남아있으면 하나 차감하고 다시 기회를 줌
        if (life > 0) {
            life--;
            failed = new Label("강화 실패!");
            failed2 = new Label("남은 기회 " + life + "번");
        // life가 0이면 강화 버튼 전부 비활성화
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