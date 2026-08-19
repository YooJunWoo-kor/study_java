package ex3_class_array;

public class PersonMain { // 클래스는 무조건 대문자로 쓰기

    public static void main(String[] args) {
        
        Person[] p1 = new Person[2]; 
        
        //클래스를 배열로 만들었다면
        //반드시 각 index의 객체화를 해줘야 한다. (str은 암시적 객체 생성이 되어서 공간할당을 안했어도됐지만 나머지는 무조건해야한다)

        for(int i = 0;  i < p1.length; i++){
            p1[i] = new Person();
        }

        p1[0].setName("홍길동");
        p1[0].setAge(20);

        p1[1].setName("김길동");
        p1[1].setAge(25);

        for(int i = 0; i < p1.length; i++){
            System.out.println(p1[i].getName() + " / " + p1[i].getAge());
        }


    }
    
}
