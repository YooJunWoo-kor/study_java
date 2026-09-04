package src.agree_game;
import javax.swing.*;

public class Move extends Thread {
    private JButton button;
    private int x1, y1, x2, y2, x3, y3;

    public Move(JButton button, int x1, int y1, int x2, int y2, int x3, int y3) {
        this.button = button;
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
    }

    public void run() {
        moveTo(x1, y1);
        moveTo(x2, y2);
        moveTo(x3, y3);
        button.setEnabled(true);
    }

    private void moveTo(int x, int y) {
        int cur_x = button.getX();
        int cur_y = button.getY();

        while (button.getX() != x || button.getY() != y) {
            if (cur_x < x) {
                cur_x += 3;
                if (cur_x > x) cur_x = x;
            } 
            else if (cur_x > x) {
                cur_x -= 3;
                if (cur_x < x) 
                    cur_x = x;
            }

            if (cur_y < y) {
                cur_y += 2;
                if (cur_y > y) 
                    cur_y = y;
            } 
            else if (cur_y > y) {
                cur_y -= 2;
                if (cur_y < y) 
                    cur_y = y;
            }

            try {
                sleep(4);
            } catch (Exception e) {
            }
            button.setLocation(cur_x, cur_y);
        }
    }
}
    
