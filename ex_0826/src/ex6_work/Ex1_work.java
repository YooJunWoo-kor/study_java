package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1_work {
    public static void main(String[] args) {
        
        //ArrayList arr에 1 ~ 30사이의 난수를 5개 추가
        //arr에 담겨진 값중 가장 큰 값을 출력

        List<Integer> list = new ArrayList<Integer>();

        Random rd = new Random();
        int i = 0;

        while( i < 5){
            list.add( rd.nextInt(30) + 1 );
            i++;
        }

        System.out.println( list );
        /*

        int max = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
            sysout(max);
         */

        for(i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i + 1)){
                int tmp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, tmp);
            }
        }
        

        System.out.println("가장 큰 값 : " + list.get(list.size() - 1));

    }
}
