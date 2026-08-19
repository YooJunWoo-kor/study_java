package mywork;

public class GamePartyTest {
    public static void main(String[] args) {
        String[] job = {"전사", "마법사", "궁수", "도적"};
        String[] name = {"아서", "머린", "로빈", "제이"};
        int[] level = {10, 9, 8, 11};
        int[] hp = {150, 40, 120, 35};


        GameCharacter[] gc = new GameCharacter[4];
        System.out.println("=== 1. 파티원 전체 현황 ===");
        for(int i = 0; i < gc.length; i++){
            gc[i] = new GameCharacter();
            gc[i].setJob(job[i]);
            gc[i].setName(name[i]);
            gc[i].setLevel(level[i]);
            gc[i].setHp(hp[i]);
            gc[i].showStatus();
        }
        System.out.println();

        System.out.println("=== 2. 위험 상태 감지 (HP 50 미만) ===");
        for(int i = 0; i < gc.length; i++){
            gc[i].criStatus();
        }

        System.out.println();
        System.out.println("=== 3. 힐(Heal) 스킬 시전 완료! (파티원 전원 HP +30) ===");
        System.out.println();

        System.out.println("=== 4. 힐 적용 후 파티원 전체 현황 ===");
        for(int i = 0; i < gc.length; i++){
            gc[i].partyHeal();
            gc[i].showStatus();
        }
        
    }
}
