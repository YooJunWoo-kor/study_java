/*
for문 : 특정 코드를 원하는 만큼 반복하고자 할 때
for(초기식; 조건식; 증감식){
    조건식이 참일 때 수행되는 영역
}
 */
package ex1_statement;

public class ex1_for {
    public static void main(String[] args) {
        int a = 10; // main에서 선언해서 어디에서든 사용가능한 전역변수

        for(int i=0; i<=2; i++){ // i는 for문에서만 사용가능한 지역변수
            System.out.println(i);
        }
        System.out.println("----------------");

        for(int j=10; j>=1; j--){
            System.out.println(j);
        }
        System.out.println("----------------");

        for(int i=1; i<=100; i++){ // 가장추천
            if(i % 5 == 0)
                System.out.println(i);
        }

        for(int i=5; i<=100; i+=5 ){
            System.out.println(i);
        }
       
    }
    
}
