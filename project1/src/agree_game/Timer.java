package src.agree_game;
import java.awt.*;
import java.sql.Time;

public class Timer extends  Thread{
    static int second = 50;
    private Label time;

    
    public Timer(Label time){
        this.time = time;
    }

    @Override
    public void run() {
        while(second > 0){
        try {
            sleep(1000);
            second--;
            time.setText("" + second);
        } catch (Exception e) {

        }
        }
        if(second == 0){
            new Timeout();
        }

    }
    
}
