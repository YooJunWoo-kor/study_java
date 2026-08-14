import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = sc.nextInt();
        int sum = 0;

       
        for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    sum += i;
                }    
        }

        if(sum != n + 1){
            System.out.printf("%d는 소수가 아닙니다", n);
        }

        else{
            System.out.printf("%d는 소수입니다" , n);
        }

        /*

        int i = 2;
        
        for( ; i <= n; i++){
            if( n % i == 0){
                break;
            }
        }

        if( i == n){
            System.out.println("소수");
        }

        else{
            System.out.println("소수가 아님");
        }

         */

    }
}
