package ex2_valueType;

public class Ex2_valueType {

    public static void main(String[] args) {
        
        //문자형 : 홑따옴표 안에 딱 한글자만 저장함
        char ch = 'A';
        System.out.println("ch : "+ ch);
        char ch2 = 65 + 1;
        System.out.println("ch2 : " + ch2);

        //실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
        float f1 = 100;
        f1 = 3.14F;

        double d1 = 3.14;
        System.out.println("f1 : " + f1);
        System.out.println("d1 : " + d1);

    }
    
}
