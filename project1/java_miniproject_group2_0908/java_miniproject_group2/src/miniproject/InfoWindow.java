package miniproject;

import java.awt.*;

public class InfoWindow {

    Frame frame;

    // 옆에 뜨는 설명서 창(Locked 라벨 + 설명서 이미지) 생성
    public Frame build() {
        frame = new Frame();
        frame.setLayout(null);
        frame.setUndecorated(true);
        frame.setBackground(Color.BLUE);
        frame.setBounds(1470, 150, 400, 400);

        Label lo = new Label("Locked");
        lo.setBounds(140, 15, 120, 30);
        lo.setFont(new Font("", Font.BOLD, 30));
        lo.setForeground(Color.WHITE);
        lo.setBackground(Color.BLUE);

        Panel p1 = new Panel() {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/설명서.png");

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        p1.setBounds(5, 60, 390, 335);

        frame.add(lo);
        frame.add(p1);

        return frame;
    }
}
