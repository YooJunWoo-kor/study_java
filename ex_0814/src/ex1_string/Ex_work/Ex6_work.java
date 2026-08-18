package ex1_string.Ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        //문장 : aabbcc
        //결과 : abc
        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");
        String s = sc.next();
        String res = "";

    
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);

            // if(res.indexOf(sChar) == -1) 이 문자가 중복없이 입력받을 문장 res에 없다면(-1)
            if(!(res.contains(String.valueOf(sChar)))){
                res += sChar; // 문장에 해당 문자추가
            }
         }

         System.out.println(res);

    }//main
}
