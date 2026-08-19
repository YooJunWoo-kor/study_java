package ex5_work;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //수1 : 5
        //수2 : 10
        //연산자 : +
        //결과 : 15

        //수1 : 5
        //수2 : 10
        //연산자 : a
        //연산기호가 올바르지 않습니다
        //결과 : -1

        Calc c = new Calc();
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();

        System.out.print("수2 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 : ");
        String oper = sc.next();

        int res = c.getResult(num1, num2, oper);
        System.out.println("결과 : " + c.getResult(num1, num2, oper));
    }
}
