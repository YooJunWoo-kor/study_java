package ex01_work.ex03_work;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        /*
        1.입 금
        2.출 금
        3.잔액확인
        ect. 종료
        >> 1
        ---입 금---
        입금액 : 1000
        입금성공
        ----------
        1.입 금
        2.출 금
        3.잔액확인
        ect. 종료
        >> 3
        ---잔액확인---
        1000원
        -------------
        >> 4 (1,2,3 이외의 값)
        atm 사용을 종료합니다

        */
       Scanner sc = new Scanner(System.in);
       Atm atm = new Atm();
       int money = 0;

       while(true){
            atm.printOption();
            int choice = sc.nextInt();

            /*
            switch문으로도 할 수 있음 대신 이럴경우 while문에 라벨을 붙여서 break하거나
            또는 메인함수 return으로 종료할 수 있음

             */
            if(choice == 1){
                System.out.print("입금액 : ");
                money = sc.nextInt();
                atm.deposit(money);
            }else if(choice == 2){
                System.out.print("출금액 : ");
                money = sc.nextInt();
                atm.withdraw(money);
            }else if(choice == 3){
                atm.printBalance();
            }else{
                System.out.println("종료");
                break;
            }

            System.out.println("---------------------------");


       }

    }
}
