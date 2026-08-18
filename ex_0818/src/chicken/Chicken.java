package chicken;

public class Chicken {
    int price;
    String name;


    public void order(int p, String n){
        price = p;
        name = n;
        System.out.println(price + "원 짜리 " + name + "치킨을 주문");
    }

}
