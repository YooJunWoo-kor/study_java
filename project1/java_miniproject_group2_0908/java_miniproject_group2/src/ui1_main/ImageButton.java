package ui1_main;

import java.awt.*;

public class ImageButton extends Button {

    private Image img;

    public ImageButton(String path){
        img = Toolkit.getDefaultToolkit().getImage(path);
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

}
