/*
1~10까지의 정수들 중에서 홀수의 합만 계산하여 출력
//결과 : 25
 */
package ex1_statement;

public class ex2_for {
    public static void main(String[] args) {
        int sum = 0;
        
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 1)
                sum += i;
        }
        System.out.println("결과 : " + sum);
    }
    
}
