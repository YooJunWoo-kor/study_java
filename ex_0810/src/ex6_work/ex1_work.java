package ex6_work;

import java.util.Scanner;

public class ex1_work {

    public static void main(String[] args) {
        /*
        1 ~ 100까지의 숫자중에서
        키보드에서 입력받은 수보다 큰 
        첫번째 3의 배수를 찾아서 출력

        입력 : 55
        55보다 큰 첫번째 3의 배수 : 57

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();

        for(int i = num + 1; i <= 100; i++){

            if( i % 3 == 0){
                System.out.printf("%d보다 큰 첫번째 3의 배수 : %d", num, i);
                break;
            }

            /* 내 답 
            if(i % 3 != 0)
                continue;

            System.out.println(num + "보다 큰 첫번째 3의 배수 : " + i);
            break;
            */

        }
        
    } // main
    
}
