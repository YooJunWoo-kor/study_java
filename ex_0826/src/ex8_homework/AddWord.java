package ex8_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AddWord extends Thread{
    String[] data;
    List<String> flist = new ArrayList<String>();
    Boolean filled;
    

    public AddWord(List<String> flist, String[] data){
        this.flist = flist;
        this.data = data;
        this.filled = true;
    }
    
    @Override
    public void run() {

        while(filled){
            try{
                Thread.sleep(3000);
                flist.add(data[new Random().nextInt(data.length)]);
            }catch(Exception e){

            }
        }   
    }

}
