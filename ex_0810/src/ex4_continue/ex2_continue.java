package ex4_continue;

public class ex2_continue {
    public static void main(String[] args) {
        for( int i = 1; i <= 5; i++ ){

            switch(i){
                case 1:
                    System.out.println("case 1");
                    break;
                
                case 2:
                    System.out.println("case 2");
                    continue; // 반복문 있을때만 사용가능하고 바로 반복문의 증감식으로 이동

            }

            System.out.println("결과 : " + i);
        }
    }// main
    
}
