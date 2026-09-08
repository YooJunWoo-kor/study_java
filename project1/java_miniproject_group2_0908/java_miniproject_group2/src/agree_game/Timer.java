package agree_game;
import java.awt.*;
import ui1_main.TermsFrame;

public class Timer extends  Thread{
    int second = 50;
    private Label time;
    private TermsFrame terms;
    private Frame f;
    static boolean flag = true;
 

    public Timer(Label time, Frame f, TermsFrame terms){
        flag = true;
        this.time = time;
        this.f = f;
        this.terms = terms;
    }

    @Override
    public void run() {
        while(second > 0 && flag){
        try {
            sleep(1000);
            second--;
            time.setText("" + second);

        } catch (Exception e) {
        }

        if(second == 0){
            new Timeout(f, terms);
        }

        }


    }
    
}
