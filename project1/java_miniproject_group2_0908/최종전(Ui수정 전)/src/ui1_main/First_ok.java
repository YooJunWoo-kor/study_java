package ui1_main;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class First_ok extends Frame {

    private TermsFrame terms;

    public First_ok (TermsFrame terms){

        this.terms = terms;

        setTitle("이용약관 【제1조】에 동의하십니까?");
        setBounds(400 , 150, 500, 300);
        setVisible(true);
        setLayout(null);

        addWindowListener(new WindowAdapter(){ // x버튼 종료
            @Override
            public void windowClosing(WindowEvent e) {
                terms.resetterms();
                terms.setVisible(true);
                dispose();
            }
        });

        TextArea area = new TextArea(
            "이용자의 자세에 대하여\n\n\n" +
            "(1) 이용자는 이 게임에 대해 온 힘을 다하고 적극적이며 열정적으로 즐기는 자세로 임해야 합니다.\n\n" +
            "(2) 이용자는 게임을 즐긴다는 본연의 마음을 잊었을 경우에 자동으로 이 게임을 이용할 자격을 상실합니다.\n\n" +
            "(3) 이용자가 경쟁이나 성과 추구에 있어 게임을 즐기는 방법을 잃어버린다면 그것은 이 게임의 목적에서 벗어난 것으로 간주됩니다. 이러한 상황에 빠진 이용자는 일시적으로라도 게임에서 벗어나 마음의 평온을 되찾을 것을 강력히 권장합니다."
        ,0,0,TextArea.SCROLLBARS_NONE);

        area.setBounds(20, 50, 450, 150);
        area.setEditable(false);

        ImageButton agree = new ImageButton("src/images/동의함.png");
        ImageButton nogree = new ImageButton("src/images/동의안함.png");

        agree.setBounds(70, 210, 150, 50);
        nogree.setBounds(270, 210, 150, 50);

        agree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                terms.setVisible(true);

                terms.firstAgree();

            }
        });

        nogree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                terms.setVisible(true);
                setVisible(false);
            }
        });
            



        add(area);
        add(agree);
        add(nogree);

    }//First_ok
    
}
