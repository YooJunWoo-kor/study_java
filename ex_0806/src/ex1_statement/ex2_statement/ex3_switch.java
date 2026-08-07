package ex1_statement.ex2_statement;

public class ex3_switch {
    public static void main(String[] args) {
        
        char name = '이';

        switch( name ){
            case '김': System.out.println("1000만"); //break; 이 케이스가 실행됐다고 가정했을때 break가 없으면 다음 케이스 이어서 실행

            case '이' : System.out.println("730만"); break;

            case '박' : System.out.println("419만"); break;

            default : System.out.println("데이터가 없습니다"); break;

        }//switch
    }
    
}
