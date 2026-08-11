package ex6_work;

import java.util.Scanner;

public class ex2_work {
    public static void main(String[] args) {
        int count_3 = 0;
        int count_5 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            if(i % 3 == 0)
                count_3++;

            if(i % 5 == 0)
                count_5++;

        } // for문


        System.out.println("3의 배수 : " + count_3);
        System.out.println("5의 배수 : " + count_5);
        
    }
    

}
