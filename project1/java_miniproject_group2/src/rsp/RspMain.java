package rsp;

import ui1_main.TermsFrame;

public class RspMain {

    public static void start(TermsFrame terms) {
        
        RspFrame rf = new RspFrame(terms);
        PlayGame pg = new PlayGame(rf);
        pg.setDaemon(true);
        pg.start();

    }
    
}
