package ex1_constructor;

public class ConMain {
    public static void main(String[] args) {

        int n = 10;

        Consub cs = new Consub();
        // cs.ConSub(); 일반 메모리처럼 다시 호출하는 것은 불가능 객체 생성할때만 호출됨

        Consub[] cs1 = new Consub[2];
        cs1[0] = new Consub(); // 이것을 반드시 해야되는게 생성자때문임

    }
}
