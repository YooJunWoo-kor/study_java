package ex8_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    /*
* [strawberry]
* >> strawberry
* [orange, grape, apple]
* >> orange
* [grape, apple]
* >> grape
* [apple, apple]
* >> apple
* [apple]
* >> apple
* [strawberry]
* >> strawberry
* 클리어!!!
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = {"apple", "banana", "orange", "grape", "strawberry", "pineapple"};  
        int r = new Random().nextInt(data.length);
        List<String> flist = new ArrayList<String>();
        
        flist.add(data[r]);
        AddWord aw = new AddWord(flist, data);
        
        aw.setDaemon(true);
        aw.start();

        quiz : while(true){
            
           System.out.println(flist);
           System.out.print(">> ");
           String fruit = sc.next();
           
           for(int i = 0; i < flist.size(); i++){
                if(flist.get(i).equals(fruit)){
                    flist.remove(i);
                }
                if(flist.size() == 0){
                    break quiz;
                }
            }
        }

    }




}
