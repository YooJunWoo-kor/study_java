package agree_game;
import java.awt.Color;
import java.awt.Frame;
import java.util.Random;
import javax.swing.*;


public class JButtonFunction {

    Color[] color;
    Random rd = new Random();
    Frame f;
    Move move[] = null;
    private ImageIcon agree_Img;
    private ImageIcon disagree_Img;


    ImageIcon questionbtn = new ImageIcon("src/images/물음표버튼.png");

    public JButtonFunction( Frame f, ImageIcon agree_Img, ImageIcon disagree_Img){
        this.f = f;
        this.agree_Img = agree_Img;
        this.disagree_Img = disagree_Img;
    }

    public void hide(JButton[] buttonlist) {
        buttonClose(buttonlist);
        for (int i = 0; i < buttonlist.length; i++) {
            buttonlist[i].setIcon(questionbtn); //치트키
            buttonlist[i].setActionCommand("???");
        }
    }

    public void appear(JButton[] buttonlist) {
        for (int i = 0; i < buttonlist.length; i++) {

            if (buttonlist[i].getText().equals("동의한다")) {
                buttonlist[i].setIcon(agree_Img);
                buttonlist[i].setActionCommand("동의한다");
            }

            else {
                buttonlist[i].setIcon(disagree_Img);
                buttonlist[i].setActionCommand("동의안함");
            }

            f.repaint();
        }
    }

    public void shuffle(JButton[] buttonlist){
        int[] xa = new int[buttonlist.length];
        int[] ya = new int[buttonlist.length];
        for (int i = 0; i < buttonlist.length; i++) {
            xa[i] = buttonlist[i].getX();
            ya[i] = buttonlist[i].getY();
        }

        shuffle(xa, ya);

        int[] xb = xa.clone();
        int[] yb = ya.clone();
        shuffle(xb, yb);

        int[] xc = xb.clone();
        int[] yc = yb.clone();
        shuffle(xc, yc);

        for (int i = 0; i < buttonlist.length; i++) {
            Move move = new Move(buttonlist[i], buttonlist,  xa[i], ya[i], xb[i], yb[i], xc[i], yc[i]);
            move.start();
        }  
    }

    public void shuffle(int[] xa, int[] ya) {

        java.util.Random rd = new java.util.Random();

        for (int i = xa.length - 1; i > 0; i--) {
            int r = rd.nextInt(i + 1);
            int tx = xa[i]; 
            xa[i] = xa[r]; 
            xa[r] = tx;

            int ty = ya[i]; 
            ya[i] = ya[r];
            ya[r] = ty;
        }
    }

    public void buttonClose(JButton[] buttonlist){
        for(int i = 0; i < buttonlist.length; i++){
            buttonlist[i].setEnabled(false);
        }
    }

}
