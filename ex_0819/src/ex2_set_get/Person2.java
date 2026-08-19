package ex2_set_get;

public class Person2 {
    
    private String name;
    private int age;

    public void setInfo(String name, int age){

        this.name = name; // this 는 "현재 내 클래스"를 의미한다
        this.age = age;

    }

    public String getName(){
        return name; // 메소드 내 지역변수와 헷갈릴 이유가 없어서 this를 쓰지않아도 알아서 클래스내 전역변수 name을 지칭함
    }

    public int getAge(){
        return age;
    }


}
