package src.agree_game;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonListener implements ActionListener{
    private JButton[] buttonlist;
    private Frame f;
    private JButtonFunction jbf;

    public ButtonListener(Frame f, JButton[] buttonlist, ImageIcon agree_Img, ImageIcon disagree_Img){
        this.buttonlist = buttonlist;
        this.f = f;
        this.jbf = new JButtonFunction(f, agree_Img, disagree_Img);
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "동의한다":              
                jbf.hide(buttonlist);

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
                    Move move = new Move(buttonlist[i], xa[i], ya[i], xb[i], yb[i], xc[i], yc[i]);
                    move.start();
                }
                break;

            case "동의안함":              
                new Disagree();
                break;

            case "???":              
                JButton clicked = (JButton) e.getSource();
                jbf.appear(buttonlist);   
                if (clicked.getText().equals("동의한다")) {
                    new Success();       
                }
                else {  
                    new Disagree();  
                }

                break;
        }
    }
    private void shuffle(int[] xa, int[] ya) {

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
}
