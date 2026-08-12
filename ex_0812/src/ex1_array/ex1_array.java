package ex1_array;

public class ex1_array {
    public static void main(String[] args) {

         // 배열 선언
        int arr[];
        arr = new int[5];

        // 배열 초기화
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        // 존재하지 않는 index에 접근할 수 없다

        // arr[4] = 500;

        //배열의 모든 내용을 출력
        for( int i = 0; i < arr.length; i++ ){

            System.out.println(arr[i]);

        }


    } //main
}
