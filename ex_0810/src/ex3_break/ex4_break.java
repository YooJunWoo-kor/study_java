package ex3_break;

import java.util.Scanner;

public class ex4_break {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(true){
            
            System.out.print("입력 : ");
            int num = sc.nextInt();
            System.out.println("결과 : " + num);

            if( num == 3 ){
                break;
            }

        } //while

    }
}
