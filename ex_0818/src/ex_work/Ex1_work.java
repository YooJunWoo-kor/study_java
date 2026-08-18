package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 값이 회문인지 판단 (앞에서 읽으나 뒤에서 읽으나 똑같은거)
        //--------------------------------
        //입력 : abcba
        //abcba는 회문입니다

        //입력 : abc
        //abc는 회문이 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        String res = "";
        for(int i = str.length()-1; i >= 0; i--){
            res += str.charAt(i);
        }
        if(str.equals(res)){
            System.out.println(str + "는 회문입니다");

        }else{
            System.out.println(str + "는 회문이 아닙니다");
        }
    }
}
