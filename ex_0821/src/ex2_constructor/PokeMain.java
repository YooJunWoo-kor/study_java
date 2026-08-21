package ex2_constructor;

public class PokeMain {
    public static void main(String[] args) {
        
        //이름과 타입을 반드시 입력해야만 객체가 생성되도록 강제
        //필수정보가 빠진 포켓몬이 만들어지는것을 방지할 수 있다.

        Pokemon p1 = new Pokemon("피카츄", "전기");
        p1.setName("라이츄");
        p1.info();
        
    } // main
}
