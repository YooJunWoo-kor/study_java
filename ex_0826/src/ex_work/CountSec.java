package ex_work;

public class CountSec extends Thread{
    private int count;
    private boolean running;

    public CountSec(){
        running  = true;
    }

    @Override
    public void run() {
        try{
            while(running && Quiz.answerC != 5){
                Thread.sleep(1000); count++;
            }
        }catch(Exception e){
    
        }
    }

    public int getCount() {
        return count;
    }

    public void stopCount(){
        running = false;
    }
    

}
