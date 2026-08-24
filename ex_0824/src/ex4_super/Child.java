package ex4_super;

public class Child extends Parent{

    public Child(){
        super(10); // 부모클래스의 생성자(자식 공간이 할당되려면 부모가 먼저 만들어져야하므로!)  => 디폴트로 super()가 숨겨있긴하다
        System.out.println("자식클래스의 생성자");
    }

    @Override
    public int getNum() {
        super.num = 100; // 부모의 num변수로 접근

        //부모의 getNum()메서드 호출
        return super.getNum();
    }
    
}
