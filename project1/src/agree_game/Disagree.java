package src.agree_game;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class Disagree extends Frame {

    public Disagree() {
        setBounds(600, 250, 500, 300);
        setUndecorated(true);
        setLayout(null);

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
        background.setBounds(0, 0, 500, 300);
        background.setLayout(null);
        add(background);

        Panel titleBar = new Panel();
        titleBar.setBackground(new Color(40, 100, 220));
        titleBar.setBounds(0, 0, 500, 45);
        titleBar.setLayout(null);
        background.add(titleBar);

        Label title = new Label("주의", Label.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        title.setBounds(0, 5, 500, 35);
        titleBar.add(title);

        ImageIcon close_img = new ImageIcon("src/images/닫기버튼.png");
        JButton closeButton = new JButton(close_img);
        closeButton.setContentAreaFilled(false);
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.setBounds(500 - 40, 5, 35, 35);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        titleBar.add(closeButton);

        Font font = new Font("굴림", Font.PLAIN, 18);

        Label label1 = new Label("게임을 플레이하려면", Label.CENTER);
        label1.setBounds(60, 90, 380, 30);
        label1.setFont(font);

        Label label2 = new Label("이용약관에 동의해야합니다", Label.CENTER);
        label2.setBounds(60, 122, 380, 30);
        label2.setFont(font);

        Button btn = new Button("타이틀로 돌아가기");
        btn.setBounds(150, 200, 180, 50);
        btn.setFont(font);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(btn.getLabel()))
                    System.exit(0);
            }
        });

        background.add(btn);
        background.add(label1);
        background.add(label2);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}