package agree_game;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import ui1_main.TermsFrame;


public class Success extends Frame {
    private TermsFrame terms;
    private Frame f;
    public Success(Frame f, TermsFrame terms) {
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

        Label title = new Label("스테이지 클리어!!", Label.CENTER);
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
        closeButton.addActionListener(e -> dispose());
        titleBar.add(closeButton);

        Label label1 = new Label("스테이지 클리어", Label.CENTER);
        label1.setBounds(65, 100, 370, 50);
        label1.setFont(new Font("맑은 고딕", Font.BOLD, 24));

        Button btn = new Button("타이틀로 돌아가기");
        btn.setBounds(150, 190, 200, 50);
        btn.setFont(new Font("맑은 고딕", Font.BOLD, 16));

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(btn.getLabel()))
                    dispose();
                    f.dispose();
                    terms.fourthAgree();
                    terms.setVisible(true);
                    Timer.flag = false;
            }
        });

        background.add(btn);
        background.add(label1);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
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



