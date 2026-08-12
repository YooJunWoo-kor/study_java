package ex_work;

import java.util.Scanner;

public class ex1_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        char alpha = 'A';

        for(int i = 0; i < arr.length; i++){
            // arr[i] = (char)('A' + i);
            System.out.print(arr[i] = alpha++);
        }


    }
}
