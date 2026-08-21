package ex6_work;

public class Prime {
    public void isPrime(int n){
        
        int i = 2;
        for(; i < n; i++){
            if(n % i == 0)
                break;
        }

        System.out.println((i == n)? n + "은(는) 소수입니다" : n + "은(는) 소수가 아닙니다");

    }
    
    /*
    강의 코드

    public boolean isPrime(int n){
        int i = 0;
        for( i <= n; i++ ){
            if( n % i == 0)
                break;
        }//for

        if( i == n )
            return true
        else
            return false
    }

     */

}
