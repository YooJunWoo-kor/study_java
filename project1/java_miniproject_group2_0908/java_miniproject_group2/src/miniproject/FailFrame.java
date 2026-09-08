package miniproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FailFrame {

    public void show() {

        Frame failFrame = new Frame();

        failFrame.setLayout(null);
        failFrame.setUndecorated(true);
        failFrame.setBackground(Color.BLUE);
        failFrame.setBounds(600, 300, 400, 200);

        Panel panel = new Panel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(5, 60, 390, 135);

        Label msg = new Label("동의할 수 없습니다");
        msg.setBounds(80, 10, 250, 40);
        msg.setFont(new Font("", Font.BOLD, 25));
        msg.setForeground(Color.WHITE);

        Button no = new Button("동의안함") {

            Image img = Toolkit.getDefaultToolkit().getImage("src/image/동의안함.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };

        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        no.setBounds(120, 100, 160, 70);

        failFrame.add(no);
        failFrame.add(msg);
        failFrame.add(panel);

        failFrame.setAlwaysOnTop(true);
        failFrame.setVisible(true);
        failFrame.toFront();

    }

}
