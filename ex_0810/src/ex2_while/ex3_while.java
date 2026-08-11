package ex2_while;

import java.util.Random;
import java.util.Scanner;

public class ex3_while {
    public static void main(String[] args) {
        /*
        1 ~ 100 사이의 난수를 만들고
        키보드에서 입력받은 값이 정답일 때 게임을 종료

        숫자 : 25
        UP
        숫자 : 70
        DOWN
        숫자 : 50
        정답입니다

        */
        Scanner sc = new Scanner(System.in);
        int num = new Random().nextInt(100) + 1;
        int my_num = 0;

        while( num != my_num ){

            System.out.print("숫자 : ");
            my_num = sc.nextInt();

            if(num > my_num)
                System.out.println("UP");
            
            else if(num < my_num)
                System.out.println("DOWN");
            
            else
                System.out.println("정답입니다");

        }

        

    }
}
