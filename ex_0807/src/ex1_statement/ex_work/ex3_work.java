package ex1_statement.ex_work;

import java.util.Random;

public class ex3_work {
    public static void main(String[] args) {
        int alpha = new Random().nextInt('Z' - 'A' + 1) + 'A'; 
        // new Random().nextInt(사이의 숫자 개수) + 첫 숫자;

        System.out.println((char)alpha);
        // A ~ Z사이의 값중 하나를 랜덤으로 출력
    }// main
}
