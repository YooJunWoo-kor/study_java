package ex_work;

public class ex2_work {
    public static void main(String[] args) {

        //배열 arr에 담긴 모든 값의 합을 출력
        // ---------------------
        // 결과 : 121
        
        int[] arr = { 10, 11, 37, 61, 2 };
        int res = 0;

        for(int i = 0; i < arr.length; i++){
            res += arr[i];
        }
        System.out.println("결과 : " + res);
        
        System.out.println("---------------");
        res = 0;

        for(int n : arr){
            res += n;
        }
        System.out.println("결과 : " + res);

    }
}
