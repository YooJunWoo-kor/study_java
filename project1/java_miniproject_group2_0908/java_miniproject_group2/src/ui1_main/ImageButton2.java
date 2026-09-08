package ui1_main;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageButton2 extends Component{
    
    private Image img;

    public ImageButton2(String path){
        img = Toolkit.getDefaultToolkit().getImage(path);
    }

    @Override
    public void paint(Graphics g){
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

}
