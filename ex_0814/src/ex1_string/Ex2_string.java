package ex1_string;

public class Ex2_string {
    public static void main(String[] args) {

        String str = "Hong Gil Dong";
        int index = str.length();
        System.out.println("str의 길이 : " + index);

        index = str.indexOf('o');
        System.out.println("맨 처음 문자 o의 위치 : " + index);

        index = str.indexOf("Gil");
        System.out.println("문자열 Gil의 위치 : " + index);

        index = str.lastIndexOf('o');
        System.out.println("마지막 문자 o의 위치 : " + index);

        char res = str.charAt(6);
        System.out.println("6번째 문자 : " + res);

        String ss = str.substring(1,6); // 자바의 경우 이런식으로 매소드를 사용하면 6(끝인덱스)바로 이전인 5번인덱스까지 가져옴

        System.out.println(ss);

        String apple = "Apple"; 
        if( apple.equals("apple") ){ // 이런식으로 생성한 문자열 "apple" 그 자체는 암시적 객체생성이기때문에 주소값은 같긴하지만 무조건 내용을 비교하는 equals메소드를 사용하자
        //equals 메소드는 대소문자까지 비교한다.
            System.out.println("사과");
        }

        if( apple.equalsIgnoreCase("apple") ){ // 영어말고 다른건 적용안됨
            System.out.println("대소문자 상관없이 사과");
        }

        String password = " 1234 ";
        String pwd2 = password.trim();
        // trim()을 통해 문자열 앞 뒤의 의미없는 공백을 제거
        System.out.println(pwd2 + "의 길이 : " + pwd2.length());

        //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메소드
        String number = "100";
        int num = Integer.parseInt( number );
        System.out.println(num + 1);

        //기본자료형의 -> Wrapper 클래스 (중요!)
        //boolean -> Boolean
        //char -> Character
        //byte -> Byte
        //short -> Short
        //int -> Integer
        //long -> Long
        //float -> Float
        //double -> Double

    } // main
}
