package ex1_string.Ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //이메일 : abc@korea.com
        //이메일 형식 오류 (@앞에 단어길이가 짧으면 "이메일 형식 오류" 출력)

        //이메일 : aabbcc@n.com
        //aabbcc님 환영합니다

        Scanner sc = new Scanner(System.in);
        System.out.print("이메일 입력 : ");
        String email = sc.next();

        String[] sp = email.split("@"); // @를 기준으로 이메일 주소를 분할해서 sp배열에 담는다.

        if(sp[0].length() < 4 || sp[0].length() > 8){
            System.out.println("이메일 형식이 올바르지 않음");
        }else{
            System.out.println(sp[0] + "님 환영합니다");
        }

    }// main
}
