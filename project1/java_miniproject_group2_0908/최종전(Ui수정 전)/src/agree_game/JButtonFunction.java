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
        int n = buttonlist.length;
        int rounds = 3;
    
        int[] curX = new int[n];
        int[] curY = new int[n];
    
        for(int i = 0; i < n; i++){
            curX[i] = buttonlist[i].getX();
            curY[i] = buttonlist[i].getY();
        }
    
        int[][] x = new int[rounds][n];
        int[][] y = new int[rounds][n];
    
        for(int r = 0; r < rounds; r++){
            shuffle(curX, curY);
            x[r] = curX.clone();
            y[r] = curY.clone();
        }
    
        for(int i = 0; i < n; i++){
            int[] bx = new int[rounds];
            int[] by = new int[rounds];
    
            for(int r = 0; r < rounds; r++){
                bx[r] = x[r][i];
                by[r] = y[r][i];
            }
    
            Move move = new Move(buttonlist[i], buttonlist, bx, by);
            move.start();
        }
    }
    
    public void shuffle(int[] x, int[] y) {
        Random rd = new Random();
    
        for (int i = x.length - 1; i > 0; i--) {
            int r = rd.nextInt(i + 1);
            int tx = x[i];
            x[i] = x[r];
            x[r] = tx;
    
            int ty = y[i];
            y[i] = y[r];
            y[r] = ty;
        }
    }

    public void buttonClose(JButton[] buttonlist){
        for(int i = 0; i < buttonlist.length; i++){
            buttonlist[i].setEnabled(false);
        }
    }

}
