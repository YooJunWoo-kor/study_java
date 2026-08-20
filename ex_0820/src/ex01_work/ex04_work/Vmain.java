package ex01_work.ex04_work;

import java.util.Scanner;

public class Vmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액 : ");
        int money = sc.nextInt();

        Vending v = new Vending();
        v.init();
        
        v.showDrink(money);

        String name = sc.next();
        v.dispense(name);

        
    }
}
