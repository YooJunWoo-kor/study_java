package ex3_override;

public class CalMain {
    //자바는 하나의 클래스당 하나의 부모만 가질수있다. 하지만 최하위 자식은 조상의 메소드나 변수 등을 사용할 수 있다.
    //자바의 존재하는 모든 클래스는 Object의 자손이다.
    
    public static void main(String[] args) {
        
        CalPlus cp = new CalPlus();
        

        int n = cp.getResult( 10, 20);
        System.out.println(n); // -> 30

        CalMinus cm = new CalMinus();
        n = cm.getResult(15, 10);
        System.out.println(n); // -> 5

    }

}
