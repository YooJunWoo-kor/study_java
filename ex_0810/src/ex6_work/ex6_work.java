package ex6_work;

import java.util.Scanner;

public class ex6_work {
    public static void main(String[] args) {
        
        /*
        키보드에서 출력될 수열의 갯수를 지정하고 피보나치수열대로 결과 보여주기
        1 1 2 3 5 8 13 21 34 ...
        입력 : 7
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        int cnt = sc.nextInt();
        int sum = 0; 
        int num1 = 1;
        int num2 = 1;

        for(int i = 1; i <= cnt; i++){

            System.out.printf("%d %d ",num1, num2);

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

            
        }

    } // main
}
