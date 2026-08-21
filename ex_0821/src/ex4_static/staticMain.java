package ex4_static;

public class staticMain {
    
    int n;
    static String str;
    
    public void test1(){
        n = 10;
        str = "안녕";
    }

    public static void test2(){
        //n = 10; // static메서드에서는 일반 변수의 참조가 불가능하다.
        str = "안녕"; // static 메서드에서 static 변수를 사용하는것은 문제가 안됨

        int num = 100;
        // static int num2 = 200; // static안에서 static변수 선언은 불가능  (지역이든 전역이든)
    }
    

    


}
