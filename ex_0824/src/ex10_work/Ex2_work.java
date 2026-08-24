package ex10_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        //정수 : 100
        //결과 : 100
        
        // 정수 : abc10
        // abc10은(는) 정수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");

        String str = "";

        try{
            str = sc.next();
            int n = Integer.parseInt(str);
            System.out.println("결과 : " + n);

        }catch( NumberFormatException e ){
            System.out.println(str + "은(는) 정수가 아닙니다");
        }

        

    }// main
}
