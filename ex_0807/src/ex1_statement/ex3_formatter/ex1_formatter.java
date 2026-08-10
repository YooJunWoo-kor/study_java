package ex1_statement.ex3_formatter;

public class ex1_formatter {
    public static void main(String[] args) {
        
        //저의 나이는 20살 입니다.
        int age = 20;

        System.out.printf("저의 나이는 %d살 입니다 \n", age); // \n은 줄바꿈

        // 저는 20살이고 3층에 살아요
        System.out.printf("저는 %d살이고 %02d층에 살아요 \n", age, 3); // %02d == (2자리가 되도록 0을 붙이는 문법)

        //나는 박씨야
        System.out.printf("나는 %c씨야 \n",'박'); // 정수 : %d 문자 : %c

        //나는 a형이야
        System.out.printf("나는 %C형이야 \n", 'a'); // %C로 대문자로 작성할 경우 입력한 소문자를 대문자로 바꿔줌

        //원주율 : 3.141592
        System.out.printf("원주율 : %.2f \n",3.141592); // %.2f 소수점 두 자리까지만 출력

        //저는 홍길동입니다
        System.out.printf("%s \n", "저는 홍길동입니다"); // %s는 문자열을 저장

        System.out.printf("%s\t %d\t %d \n", "김윤", 100, 95); // \t 탭키의 공간확보

        System.out.printf("%s\t %d\t %d \n", "김길동", 100, 7);

        System.out.printf("오늘 강수량은 %d%% 입니다 \n",15); // 특수문자 %를 출력하고 싶으면 %% 사용


        /*
        formatter의 문법
        \n : 강제개행
        \t : tab키만큼의 공간확보
        %d : 정수
        %c : 문자
        %s : 문자열
        %% : %특수문자
        */
    } // main
}
