package ex1_statement.ex2_statement;

public class ex1_switch_case {
    public static void main(String[] args) {
        /* 
        switch(변수){
        case 값1:
            값1일 때 실행되는 영역
            break;
        case 값2:
            값2일 때 실행되는 영역
            break;
        default:
            값1, 값2 외의 모든 경우 실행되는 영역
            break;

            똑같은 값의 case가 여러 개 있을 수 없다
            
            switch문은 특정 값을 바로 찾아서 실행하기 때문에 else-if에 비해 속도가 빠르다.

            switch문 비교값 자료형은 byte,short,int/ String / char  쓸 수 있다 
        }
        */
       
        int n = 2;
        switch(n){
            case 1: System.out.println("게임시작"); break;
            case 2: System.out.println("설정"); break;
            case 3: System.out.println("종료"); break;
            default: System.out.println("잘못된 입력"); break;
            
            
        }
    }


}
