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
        int min = 0;
        int max = 0;


        if(num1 > num2){
            max = num1;
            min = num2;
        }
        else{
            max = num2;
            min = num1;
            
        }

        outer : for(int i = 1; i <= max; i++){
            int res = max * i;
            for(int j = 1; j <= max; j++){
                if(min * j == res){
                    System.out.print("최소공배수 : " + res);
                    break outer;
                }
            }
        }
        
        
    }
}
