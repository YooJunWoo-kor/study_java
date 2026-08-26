package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        
        //id : aaa
        //aaa 회원
        //id : bbb
        //aaa
        //bbb
        //id : ccc
        //aaa
        //bbb
        //ccc
        //id : aaa
        //aaa회원은 이미 존재함
        
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>(); 

        while(true){

            System.out.printf("\nid : ");
            String id = sc.next();

            if( list.contains(id) ){
                System.out.println(id + "회원은 이미 존재함");
                continue;
            }
            
            //중복체크2
            //for(int i = 0; i < list.size(); i++){
                
                //if( id.equals(list.get(i)) ){
                    //System.out.println(id + "회원 이미 있음");
                    //continue outer;
                //}

            //}
            
            list.add(id);
            for( int i = 0; i < list.size(); i++ ){
                System.out.println(list.get(i) + " 회원");
            }

        }


    }
}
