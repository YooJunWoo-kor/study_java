package ex01_work.ex03_work;

public class Atm {
    private int balance;
    
    public void printOption(){
        System.out.printf("1.입 금\n2.출 금\n3.잔액확인\nect.종 료\n-----------\n>>>");
    }

    public void deposit(int money){
        System.out.println("--- 입 금 ---");
        System.out.println("입금액 : " + money);
        balance += money;
        System.out.println("입금성공");
    }
    
    public void printBalance(){
        System.out.println("----잔액확인----");
        System.out.println(balance + "원");
    }

    public void withdraw(int money){
        System.out.println("----출금----");
        if(balance - money < 0){
            System.out.println("잔액이 부족합니다");
            return;
        }
        balance -= money;
        System.out.println("출금성공");
    }


}
