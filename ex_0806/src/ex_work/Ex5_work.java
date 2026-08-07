package ex_work;
import java.util.Scanner;

/*
수1 : (입력받기) 
수2 : (입력받기)
연산자 : (입력받고)
 결과값
 */

public class Ex5_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 : ");
        String calc = sc.next();

        switch(calc){
            case "+" : System.out.println(num1 + " " + calc + " " + num2 + " = " + (num1+num2)); break;

            case "-" : System.out.println(num1 + " " + calc + " " + num2 + " = " + (num1-num2)); break;

            case "*" : System.out.println(num1 + " " + calc + " " + num2 + " = " + (num1*num2)); break;

            case "/" : System.out.println(num1 + " " + calc + " " + num2 + " = " + ((float)num1/num2)); break;

            default : System.out.println("+, -, *, / 중에 연산자를 입력해주세요"); break;
        }

    }
    
}
