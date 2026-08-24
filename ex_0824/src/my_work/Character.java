package my_work;

public class Character {
    private String name;
    private int hp;
    private int attackD;
    
    public Character(){
        attackD = 50;
    }

    public void attack(){
        System.out.print("캐릭터가 공격합니다");
    }

    public int getAttackD() {
        return attackD;
    }
}
