package find;

import java.util.Random;
import javax.swing.*;

public class FindThread extends Thread {

    Random rnd = new Random();
    private AgreeButton[] buttons;
    private int[] picks = new int[2];

    public FindThread( AgreeButton[] buttons, int pick0, int pick1) {

        this.buttons = buttons;
        picks[0] = pick0;
        picks[1] = pick1;

    }

    @Override
    public void run() {

        int count = 0;

        AgreeButton but0 = buttons[picks[0]];
        AgreeButton but1 = buttons[picks[1]];

        but0.setNx(but1.getPx());
        but0.setNy(but1.getPy());

        but1.setNx(but0.getPx());
        but1.setNy(but0.getPy());

        while (count < 50) {

            try {

                Thread.sleep(30);

            } catch (Exception e) {

            }

            for (int i = 0; i < picks.length; i++) {

                AgreeButton ab = buttons[picks[i]];

                int px = ab.getPx();
                int py = ab.getPy();
                int nx = ab.getNx();
                int ny = ab.getNy();

                JButton b = ab.getBtn();

                if (nx > px) {
                    px += (nx - px) / 5;
                    if (nx - px <= 4)
                        px = nx;
                } else {
                    px -= (px - nx) / 5;
                    if (px - nx <= 4)
                        px = nx;
                }

                if (ny > py) {
                    py += (ny - py) / 5;
                    if (ny - py <= 4)
                        py = ny;
                } else {
                    py -= (py - ny) / 5;
                    if (py - ny <= 4)
                        py = ny;
                }

                b.setLocation(px, py);
                ab.setPx(px);
                ab.setPy(py);

            }

            but0.setMoveCount(but0.getMoveCount() - 1);
            but1.setMoveCount(but1.getMoveCount() - 1);
            count++;

        }

    }

}
