package ex01_work.ex04_work;

public class Vending {
    
    private Can[] cans = new Can[5];
    private int money;
    
    public void init(){
        for( int i = 0; i < cans.length; i++ ){
            cans[i] = new Can();
        }//for
        cans[0].setName("환타");
        cans[0].setPrice(1000);
        
        cans[1].setName("사이다");
        cans[1].setPrice(1200);

        cans[2].setName("핫식스");
        cans[2].setPrice(1300);

        cans[3].setName("콜라");
        cans[3].setPrice(1400);

        cans[4].setName("오렌지");
        cans[4].setPrice(1500);
    }//init // 클래스안에 객체 배열을 생성해서 초기화시킬수있다. 자판기 안에서 음료수캔들 하나하나가 객체니까 좋은 예시이다

    //사용자의 돈을 받는다
    //이 돈으로 먹을수 있는 음료 목록만 보여주기

    public void showDrink(int money){
        for( int i = 0; i < cans.length; i++ ){
            if(cans[i].getPrice() <= money){
                System.out.printf("%s - %d원\n",cans[i].getName(), cans[i].getPrice());
            }
        } //for

        this.money = money;

        System.out.print(">> ");

    } // showDrink

    //사용자가 음료수를 선택하면
    //해당 음료수를 제공하고 잔돈을 돌려준다

    public void dispense( String name ){
        for(int i = 0; i < cans.length; i++){

            if(cans[i].getName().equals(name)){
              System.out.println(name + "을(를) 선택함");
              money -= cans[i].getPrice();
              System.out.println("잔액 : " + money);  
            }

        }
    }

    
}
