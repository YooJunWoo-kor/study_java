package ex2_choice;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class ChoiceListener implements ItemListener{
    private Label label;

    public ChoiceListener( Label label ){
        this.label = label;
    }

    public void itemStateChanged(ItemEvent e){
        label.setText(e.getItem() + "을(를) 선택");
    }
    

}
