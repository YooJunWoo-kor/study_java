package ex1_copyarray;

public class ArrMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrSub as = new ArrSub();
        as.param(array); // 객체형 데이터(배열포함)를 파라미터로 넘기면 주소를 넘기는 얕은복사형태가 된다.
        System.out.println(array[0]);
    } // main
}
