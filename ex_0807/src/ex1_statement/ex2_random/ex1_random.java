package ex1_statement.ex2_random;

import java.util.Random;

public class ex1_random {
    public static void main(String[] args) {
        // 2 ~ 5사이의 난수 -> new Random().nextInt(사이의 숫자개수) + 시작 수
        int num = new Random().nextInt(4) + 2;

        System.out.println(num);

        // 216 ~ 1378사이의 난수
        int num2 = new Random().nextInt(1378 - 216 + 1) + 216;

        System.out.println(num2);

        // 2 ~ 9 사이의 난수에 해당하는 구구단 출력
        int dan = new Random().nextInt(9 - 2 + 1) + 2;
        for(int i = 1; i < 10; i++)
            System.out.println(dan + " * " + i + " = " + dan*i);
        

    } // main
}
