package ex10_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        
        //입력받은 각 자리수의 합을 출력하는 예제
        //---------------------------------
        //입력 : 358
        //결과 : 16

        //입력 : 12a
        //입력한 값은 정수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int sum = 0;

        try{
            String str = sc.next();
            int num = Integer.parseInt(str);

            //각 자리의 수 합 구하는 코드
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            

            System.out.println("결과 : " + sum);

            
        }catch(NumberFormatException e){
            System.out.println("입력한 값은 정수가 아닙니다");
        }

    }// main
}
