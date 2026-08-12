package ex_work;

import java.util.Scanner;

public class ex4_work {
    /* 

    배열의 크기를 입력하세요 : 5
    정수 1 : 3
    정수 2 : 5
    정수 3 : 11
    정수 4 : 20
    정수 5 : 31
    -------------------------------
    홀수 개수 : 3
    짝수 개수 : 2
    
    */

    
    
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("배열의 크기를 입력하세요 : ");
    int size = sc.nextInt();

    int arr[] = new int[size];
    int odd_count = 0;
    int even_count = 0;

    for(int i = 0; i < arr.length; i++){

        System.out.printf("정수%d : ", i + 1);
        arr[i] = sc.nextInt();

        if(arr[i] % 2 == 0)
            even_count++;
        else
            odd_count++;

    }

    System.out.println("홀수 개수 : " + odd_count);
    System.out.println("짝수 개수 : " + even_count);


    
   } 
}
