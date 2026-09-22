package miniproject;

public class User {
    User user;
    int playRow = 3;
    int playCol = 2;

    // 시작 위치로 되돌리기 (게임 재시작할 때 씀)
    public void reset() {
        playRow = 3;
        playCol = 2;
    }
}
