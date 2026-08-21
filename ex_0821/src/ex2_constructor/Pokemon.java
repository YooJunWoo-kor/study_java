package ex2_constructor;

public class Pokemon {
    private String name;
    private int hp;
    private String type;

    public Pokemon( String name, String type ){ 
        this.name = name;
        this.type = type; // type의 setter 메소드를 없앨 경우 생성자만이 type을 지정할 수 있다. 이후 변경 불가 
        hp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }


    public void info(){

        System.out.println("이름 : " + name);
        System.out.println("타입 : " + type);
        System.out.println("체력 : " + hp);
        System.out.println("-----------------");

    }

}
