package ex2_set_get;

public class PersonMain {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setGender("남자");
        System.out.println(p1.getGender());

        p1.setName("홍길동");
        System.out.println(p1.getName());

        p1.setAge(20);
        System.out.println(p1.getAge());

        System.out.println("-----------------");

        Person2 p2 = new Person2();
        p2.setInfo("홍길동", 30);

        System.out.println("이름 : " + p2.getName() + " 나이 : " + p2.getAge());

        
    }//main
}
