package ex1_statement;

public class Ex1_if {

    public static void main(String[] args) {

        // 제어문 - 프로그램의 흐름을 제어하는 문장
        // 분기문과 반복문으로 나뉜다
        // 분기문 : if, switch
        // 반복문 : for, while, do-while

        // if문
        // if(조건식){
        // 조건식이 참일 때 실행되는 영역
        // }

        int n = 49; // n 변수에 49를 저장

        // String은 쌍따옴표 안에 여러글자(문자열)를 저장할 수 있는 자료형 (클래스)
        String str = ""; // 빈 문자열로 str을 초기화 (일반적으로 null보다는 ""로 초기화한다)

        // n이 50과 같으면 str에 "n은 50입니다"라는 문자열을 저장
        if( n == 50 ){
            str = "n은 50입니다";
        }

        // n이 50과 다르면 str에 "n은 50이 아닙니다"라는 문자열을 저장
        if ( n != 50 ){
            str = "n은 50이 아닙니다";
        }

        // str 변수에 저장된 문자열을 출력
        System.out.println(str);

    }
}
