package agree_game;
import javax.swing.*;

public class Move extends Thread {
    private JButton button;
    private JButton[] buttonlist;
    private int[] x;
    private int[] y; 

    public Move(JButton button, JButton[] buttonlist, int[] x, int[] y) {
        this.button = button;
        this.buttonlist = buttonlist;
        this.x = x;
        this.y = y;

    }

    public void run() {
        try {
            for(int i = 0; i < x.length; i++){
                moveTo(x[i], y[i]);
            }
            sleep(2000);
        } catch (Exception e) {
        }
        for(int i = 0; i < buttonlist.length; i++){
            buttonlist[i].setEnabled(true);
        }
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
                sleep(8);
            } catch (Exception e) {
            }
            button.setLocation(cur_x, cur_y);
        }
    }
}
    
