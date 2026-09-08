package agree_game;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ui1_main.TermsFrame;

public class ButtonListener implements ActionListener{
    private JButton[] buttonlist;
    private JButtonFunction jbf;
    private Frame f;
    private TermsFrame terms;

    public ButtonListener(Frame f, JButton[] buttonlist, ImageIcon agree_Img, ImageIcon disagree_Img, TermsFrame terms){
        this.buttonlist = buttonlist;
        this.jbf = new JButtonFunction(f, agree_Img, disagree_Img);
        this.f = f;
        this.terms = terms;
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "동의한다":              
                jbf.hide(buttonlist);
                jbf.shuffle(buttonlist);
                break;

            case "동의안함":              
                new Disagree(f, terms);
                break;

            case "???":              
                JButton clicked = (JButton) e.getSource();
                jbf.appear(buttonlist);
                if (clicked.getText().equals("동의한다")) 
                    new Success(f, terms); 
                else 
                    new Disagree(f, terms);
                break;

        }
    }
 
}
