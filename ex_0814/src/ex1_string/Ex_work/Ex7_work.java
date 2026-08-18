package ex1_string.Ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        
        //키보드에서 아무값이나 입력받고
        //숫자인지 아닌지를 판단하기
        //------------------------
        // 값 : 123
        // 123은 숫자입니까? true

        //값 : a12
        //a12는 숫자입니까? false;

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next();
        Boolean numVeri = false;

        int i = 0;
        for(; i < str.length(); i++){
            char ch = str.charAt(i);

            if( ch < '0' || ch > '9'){
                break;
            }
            
        } //for

        if( i == str.length() ){
            numVeri = true;
            System.out.println(str + "은 숫자입니까? " + numVeri);
        }else{
            System.out.println(str + "은 숫자입니까? " + numVeri);
        }
        

    }
}
