package rsp;

public class PlayGame extends Thread {

    private RspFrame f;

    public PlayGame(RspFrame f) {
        this.f = f;
    }

    @Override
    public void run() {
            try {

                while(true) {

                    f.setComI(f.getComRsp() % 3, f.isRot());
                    f.setMyI(f.getComRsp() % 3, f.isRot());
                    Thread.sleep(100);
                    f.setComRsp(f.getComRsp() + 1);
                    
                }

            } catch (Exception e) {
                // TODO: handle exception
            }

            

    }

}
