package computer;

public class ComMain {
    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.ssd = 1024;
        c1.info();
        //private변수 brand로는 접근이 불가
        //c1.brand = "apple";

        Computer c2 = new Computer();
        c2.info();

    }
    
}
