package ex1_string;

import java.util.Scanner;

public class Ex1_string {
    public static void main(String[] args) {

        //String클래스 두 가지 특징
        //1) 객체 생성방법이 2가지( 암시적, 명시적 )
        //2) 한 번 생성된 문자열의 내용은 변하지 않는다.

        String s1 = "abc"; // 암시적 객체생성 (String만 가능) heap메모리에 해당 데이터의 공간이 있는지 없는지 판별 후 생성
        String s2 = "abc";
        String s3 = new String("abc"); //명시적 객체생성 new라는 키워드로 생성하면 heap메모리에서의 해당 값의 유무와 관계없이 무조건 새로생성
        String s4 = new String("abc");
        

        // 객체들끼리 비교하면 값이 아닌 주소를 비교함
        if( s1 == s3){ 
            System.out.println("주소가 같습니다");
        }
        else{
            System.out.println("주소가 다릅니다");
        }

        //String 클래스의 불변의 법칙
        String greet = "안녕";
        greet += "하세요";
        System.out.println( greet );


        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");

        String op = sc.next();

        if(op.equals("+")){ 
            System.out.println("+연산 할게요");
        }

    } //main
    
}
