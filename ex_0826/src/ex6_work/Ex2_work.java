package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_work {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        String longstr = "";

        for( int i = 0; i < 5; i++ ){
            System.out.print("입력 : ");
            list.add(sc.next());
            if( list.get(i).length() > longstr.length() ){
                longstr = list.get(i);
            }
        }

        System.out.println("가장 긴 문자열 : " + longstr);
        
    }
}
