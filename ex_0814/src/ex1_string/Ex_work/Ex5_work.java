package ex1_string.Ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
        //문장 : Hello World
        //Hlool

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                System.out.print(str.charAt(i));
            }
        }


    }
}
