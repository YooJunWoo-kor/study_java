package my_work;

public class Mage extends Character{
    private int attackD;
    private String name;
    private static int mn = 1;

    Mage(){
        attackD = super.getAttackD() + 40;
        name = "Mage" + mn;
        mn++;
    }

    @Override
    public void attack() {
        System.out.printf("마법사 %s이 파이어볼을 사용합니다\n", name);
        System.out.println("공격력: " + attackD);
    }    
}
