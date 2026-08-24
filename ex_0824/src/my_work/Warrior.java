package my_work;

public class Warrior extends Character {
    private int attackD;
    private String name;
    static int wn = 1;

    Warrior(){
        attackD = super.getAttackD() + 20;
        name = "Warrior" + wn;
        wn++;
    }


    @Override
    public void attack() {
        System.out.printf("전사 %s이 검으로 공격합니다\n", name);
        System.out.println("공격력: " + attackD);
    }
}
