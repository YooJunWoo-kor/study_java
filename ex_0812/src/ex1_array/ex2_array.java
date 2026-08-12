package ex1_array;

public class ex2_array {
    public static void main(String[] args) {
        
        //배열 선언 + 생성 + 초기화 , 배열 변수는 stack영역 메모리공간은 heap영역에 생성됨
        int[] ar = {1, 2, 3, 4, 5};

        // 출력
        for(int i = 0; i < ar.length; i++){

            ar[i] = (i + 1) * 100;
            System.out.print(ar[i] + " ");

        } // for

        System.out.println();
        System.out.println("---------------");

        //개선된 루프
        for( int n : ar ){
            System.out.println( n );
        } // for


    }
}
