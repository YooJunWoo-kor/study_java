package ex01_work.ex02_work;

import java.util.Scanner;

public class EncodeMain {
    public static void main(String[] args) {
        char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
                    '&', '*', '(', ')', '-', '_', '+', '=', '|',
                    '[', ']', '{', '}', ';', ':', ',', '.', '/' };

        char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y',
                    'u', 'i', 'o', 'p' };


        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        Encode en = new Encode();
        StringBuffer sb = en.Encoding(abcCode, numCode, str);
        System.out.println(sb);
    }

                    
}
