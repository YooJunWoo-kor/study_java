package mywork;

public class GameCharacter {
    private String name;
    private String job;
    private int level;
    private int hp;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void showStatus(){
        System.out.printf("직업 : %s | 이름 : %s | 레벨 : Lv.%d | 체력 : HP %d\n", job, name, level, hp);
    }
    public void criStatus(){
        if(hp < 50)
            System.out.printf("[경고] %s님의 체력이 부족합니다! 현재 HP : %d\n", name, hp);

    }
    public void partyHeal(){
        hp += 30;
    }
    
}
