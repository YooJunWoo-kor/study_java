package src.agree_game;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Restart extends Frame {

    public Restart(JButton[] buttonlist, JButtonFunction jbf) {
        setBounds(650, 250, 400, 220);
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
        background.setBounds(0, 0, 400, 220);
        background.setLayout(null);
        add(background);

        Font font = new Font("굴림", Font.PLAIN, 18);
        Panel titleBar = new Panel();
        titleBar.setBackground(new Color(40, 100, 220));
        titleBar.setBounds(0, 0, 400, 45);
        titleBar.setLayout(null);
        background.add(titleBar);

        Label title = new Label("다시 하시겠습니까?", Label.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(font);
        title.setBounds(0, 5, 400, 35);
        titleBar.add(title);

        ImageIcon close_img = new ImageIcon("src/images/닫기버튼.png");
        JButton closeButton = new JButton(close_img);
        closeButton.setContentAreaFilled(false);
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.setBounds(400 - 40, 5, 35, 35);
        closeButton.addActionListener(e -> dispose());
        titleBar.add(closeButton);

        Label label = new Label("게임을 다시 하시겠습니까?", Label.CENTER);
        label.setBounds(50, 85, 300, 40);
        label.setFont(font);

        Button restart = new Button("재시작");
        restart.setBounds(60, 150, 120, 45);
        restart.setFont(new Font("맑은 고딕", Font.BOLD, 16));

        Button exit = new Button("종료");
        exit.setBounds(220, 150, 120, 45);
        exit.setFont(new Font("맑은 고딕", Font.BOLD, 16));

        restart.addActionListener(e -> {
            jbf.appear(buttonlist);
            dispose();
        });

        exit.addActionListener(e -> System.exit(0));

        background.add(label);
        background.add(restart);
        background.add(exit);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
