package find;

import javax.swing.*;
import java.util.Random;

public class AgreeButton {

    Random r = new Random();
    private int[] position = new int[2];
    private int px;
    private int py;
    private int nx;
    private int ny;
    private int moveCount = 0;

    private String msg;
    private JButton btn;

    private ImageIcon agrIcon = new ImageIcon("src/images/작은동의한다.png");
    private ImageIcon disIcon = new ImageIcon("src/images/작은동의안함.png");

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public int getNx() {
        return nx;
    }

    public void setNx(int nx) {
        this.nx = nx;
    }

    public int getNy() {
        return ny;
    }

    public void setNy(int ny) {
        this.ny = ny;
    }

    public JButton getBtn() {
        return btn;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public AgreeButton( int cnt, String msg ){

        this.msg = msg;
        makePosition(cnt);
        px = position[0];
        py = position[1];

        if( msg.equals("동의한다"))
            btn = new JButton(agrIcon);
        else
            btn = new JButton(disIcon);

        btn.setBorderPainted(false);
        btn.setActionCommand(msg);
        btn.setBounds(px, py, 100, 40);


    }

    public int[] makePosition( int i ){

        position[0] = 100 * (i % 12) + 10;
        position[1] = 40 * (i / 12) + 50;

        return position;

    }

    

}
