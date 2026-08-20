package ex01_work.ex05_overload;

public class OverMain {
    public static void main(String[] args) {

        OverSub os = new OverSub();
        os.result();
        os.result(100);
        os.result('A');
        os.result("나");
        os.result(1, "Hello World!");
        os.result("Hello World", 3);

    }
}
