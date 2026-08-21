package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int money = new Random().nextInt(500) + 1;
        money *= 10;
        int[] coin = {500, 100, 50, 10};
        Coin c = new Coin();

        System.out.println("금액 : " + money);
        c.count(coin, money);

    }
}
