package ex_work;

import java.util.Scanner;

public class ex6_work {
    public static void main(String[] args) {
        /*
        키보드에서 정수를 10개 입력받아 배열에 담고
        가장 많이 등장한 정수와 등장 횟수를 출력
        --------------------------------------
        정수 : 
        1
        1
        2
        2
        2
        2
        3
        3
        가장 많이 등장한 숫자 : 2
        등장횟수 : 4
         */
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        int max = 0; 
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.printf("정수%d : " , i+1);
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            int cnt = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }

            }// inner

            if(cnt > count){
                count = cnt;
                max = arr[i];
            }
            

        }
        System.out.println("가장 많이 등장한 숫자 : " + max);
        System.out.println("등장횟수 : " + count);





    } // main
}
