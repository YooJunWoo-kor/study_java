package miniproject;

public class TimerThread extends Thread{

    TimerFrame tf;
    boolean[] gameOver;
    Runnable onTimeUp; // 시간이 다 됐을 때 실행할 동작 (게임 재시작)

    public TimerThread(TimerFrame tf, boolean[] gameOver, Runnable onTimeUp){
        this.tf = tf;
        this.gameOver = gameOver;
        this.onTimeUp = onTimeUp;
    }

    @Override
    public void run() {

        while(!gameOver[0]){

            try {

                Thread.sleep(1000);

                if(gameOver[0]){
                    break;
                }

                tf.setTime(tf.getTime() - 1);
                tf.setLabel(tf.getTime());

                if(tf.getTime() == 0){
                    onTimeUp.run();
                    tf.resetTime();
                }

            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        }

    }

}
