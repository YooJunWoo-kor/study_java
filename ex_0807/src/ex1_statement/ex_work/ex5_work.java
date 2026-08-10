package ex1_statement.ex_work;

import java.util.Scanner;

public class ex5_work {
    public static void main(String[] args) {
        
        //정수 n1, n2를 입력받고
        // n1 ~ n2 사이의 합을 출력
        //------------------------
        // 수1 : 2 
        // 수2 : 5 
        // 결과 : 14

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int n1 = sc.nextInt();
        System.out.print("수2 : ");
        int n2 = sc.nextInt();
        int sum = 0;

        //n1과 n2의 값을 교환
        if(n1 > n2){
            int swap = n1;
            n1 = n2;
            n2 = swap;
        }

        for(int i = n1; i <= n2; i++){
            sum += i;
        }

        System.out.println("결과: " +  sum);

    }// main
    
}
