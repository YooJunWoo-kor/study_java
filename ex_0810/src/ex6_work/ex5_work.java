package ex6_work;

import java.util.Scanner;

public class ex5_work {
    public static void main(String[] args) {
        /*
        입력받은 두 수의 최소공배수
        수1 : 6
        수2 : 10
        최소공배수 : 30
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();
        
        for(int i = 1; i<= num1 * num2; i++){
            if(i % num1 == 0 && i % num2 == 0){
                System.out.println("최소공배수 : " + i);
                break;
            }
        }
        
        System.out.println("------------------------------");

        //최소공배수 (유클리드 호재법)
        int x = num1;
        int y = num2;

        while( y != 0 ){
            int tmp = x % y;
            x = y;
            y = tmp;
        }

        int gcd = x;

        //최소공배수 = 두 숫자를 곱한값에 최대공약수로 나눈값
        int lcm = (num1 * num2) / gcd ; 
        System.out.println("최소공배수 : "  + lcm);


        /*
         내 답
        if(num1 > num2){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        for(int i = 1; i <= num1; i++){
            int res = num2 * i;
            if(res % num1 == 0){
                System.out.println("최소공배수 : " + res);
                break;
            }
        */
            
        
        
    }
}

