package src.agree_game;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.util.Random;

import javax.swing.*;
import javax.swing.text.Position;


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

        for (int i = 0; i < buttonlist.length; i++) {
            if(buttonlist[i].getIcon() == agree_Img){
                buttonlist[i].setIcon(questionbtn);
                buttonlist[i].setActionCommand("???");
            }
            else{
                buttonlist[i].setIcon(questionbtn);
                buttonlist[i].setActionCommand("???");
            }
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



}
