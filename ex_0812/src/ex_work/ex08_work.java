package ex_work;

import java.util.Random;
import java.util.Scanner;

public class ex08_work {
    public static void main(String[] args) {
        //변수 money에 10 ~ 5000 사이의 난수를 발생시킨다
        // 단 발생한 난수 money는 1의 자리가 반드시 0이 되도록한다
        //money를 최소한의 동전으로 몇 개씩 거슬러 지는지 출력
        // 금액 : 2590
        // 500원 : 5
        // 50원 : 1
        // 10원 : 4

        int[] coin = { 500, 100, 50, 10};
        int money = 1;

        while(money % 10 != 0){
            money = new Random().nextInt(5000 - 10 + 1) + 10;
        }

        
        System.out.println("금액 : " + money);

        for(int i = 0; i < coin.length; i++){
            int count = (money / coin[i]);
            System.out.printf("%d원 : %d\n", coin[i], count );
            money -= coin[i] * count;
        }
        


    }// main
}
