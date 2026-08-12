package ex6_work;

import java.util.Scanner;

public class ex4_work {
    public static void main(String[] args) {
        /*
        키보드에서 입력받은 두 개의 수의 최대공약수 출력

        수1 : 10 (1,2,5,10)    
        수2 : 4 (1,2,4)  

        최대공약수 4
    
        최대공약수 : 2
        */

         
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();

        /* 
        // 작은수를 min에 저장
        if(num1 > num2){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        int i = num1;

        for(; i >= 1; i--){ // 작은수까지 i를 반복했을 때 두 수가 모두 나누어떨어진다면 공약수, 계속 반복해서 최대값 저장
            if(num1 % i == 0 && num2 % i == 0){
                break;
            }
        }

        System.out.println("최대공약수 : " + i);
        */
        
        // 유클리드 호재법

        
        while( num2 != 0){
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }

        System.out.println("최대공약수 : " + num1);

        

    } // main
}
