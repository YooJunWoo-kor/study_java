package miniproject;

import java.awt.*;

public class TimerFrame extends Frame {

    private int startTime = 40; // 시작 시간(초) - 이 숫자만 바꾸면 전체가 자동으로 맞춰짐
    private int time = startTime;
    Label timer;
    Label reset;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setLabel(int time) {
        timer.setText(String.valueOf(time));
    }

    // 시간을 시작 시간으로 되돌리고 화면 숫자도 같이 갱신
    public void resetTime() {
        time = startTime;
        setLabel(time);
    }

    public TimerFrame() {

        setLayout(null);
        setUndecorated(true);
        setBackground(Color.BLUE);
        setBounds(1360, 600, 400, 200);

        timer = new Label(String.valueOf(time));
        timer.setBounds(170, 100, 60, 50);
        timer.setFont(new Font("", Font.BOLD, 40));
        timer.setAlignment(Label.CENTER);
        timer.setForeground(Color.RED);
        timer.setBackground(Color.WHITE);

        reset = new Label("리셋까지");
        reset.setBounds(135, 15, 120, 30);
        reset.setFont(new Font("", Font.BOLD, 30));
        reset.setForeground(Color.WHITE);
        reset.setBackground(Color.BLUE);

        Panel p2 = new Panel();
        p2.setBackground(Color.WHITE);
        p2.setBounds(5, 60, 390, 135);

        add(reset);
        add(timer);
        add(p2);

        //1360, 600, 400, 200

    }

}
