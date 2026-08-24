package my_work;

public class Knight extends Warrior{
    private int attackD;
    private static int kn = 1;
    private String name;

    public Knight(){
        attackD = super.getAttackD() + 30;
        name = "Knight" + kn;
        kn++;
    }

    @Override
    public void attack() {
        System.out.printf("기사 %s이(가) 강력한 검으로 공격합니다\n", name);
    }
}
