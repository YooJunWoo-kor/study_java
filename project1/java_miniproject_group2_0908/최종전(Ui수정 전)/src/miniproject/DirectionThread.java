package miniproject;

import java.util.Random;
import java.awt.*;

public class DirectionThread extends Thread {

    Button[] buttons; // 순서: left, up, right, down
    boolean[] gameOver;
    Frame f;

    Random rnd = new Random();

    public DirectionThread(Button left, Button up, Button right, Button down, boolean[] gameOver, Frame f) {
        this.buttons = new Button[] { left, up, right, down };
        this.gameOver = gameOver;
        this.f = f;
    }

    @Override
    public void run() {

        while (!gameOver[0]) {

            try {

                Thread.sleep(300 + rnd.nextInt(3001)); // 0.3~4초 랜덤 대기

                int count = 2 + rnd.nextInt(3); // 이번엔 2~4개 중 몇 개 섞을지

                // 4개 중 count개를 랜덤으로 고르기 (Fisher-Yates로 인덱스 섞기)
                int[] idx = { 0, 1, 2, 3 };
                for (int i = idx.length - 1; i > 0; i--) {
                    int r = rnd.nextInt(i + 1);
                    int temp = idx[i];
                    idx[i] = idx[r];
                    idx[r] = temp;
                }

                int[] picked = new int[count];
                for (int i = 0; i < count; i++) {
                    picked[i] = idx[i];
                }

                // 고른 버튼들의 현재 좌표 저장
                int[] fromX = new int[count];
                int[] fromY = new int[count];
                int[] toX = new int[count];
                int[] toY = new int[count];

                for (int i = 0; i < count; i++) {
                    fromX[i] = buttons[picked[i]].getX();
                    fromY[i] = buttons[picked[i]].getY();
                }

                // 목표 좌표: 한 칸씩 회전시켜서 뽑힌 버튼들이 전부 실제로 움직이게 함
                for (int i = 0; i < count; i++) {
                    int next = (i + 1) % count;
                    toX[i] = fromX[next];
                    toY[i] = fromY[next];
                }

                // 여러 단계로 나눠서 부드럽게 이동
                int steps = 15;
                for (int s = 1; s <= steps; s++) {
                    for (int i = 0; i < count; i++) {
                        Button b = buttons[picked[i]];
                        int x = fromX[i] + (toX[i] - fromX[i]) * s / steps;
                        int y = fromY[i] + (toY[i] - fromY[i]) * s / steps;
                        b.setBounds(x, y, b.getWidth(), b.getHeight());
                    }
                    Thread.sleep(15);
                }

                // 빠르게 여러 번 움직이고 나면 화면에 이전 위치 잔상이 남을 때가 있어서,
                // 다 옮긴 뒤 창 전체를 한 번 다시 그리게 해서 깨끗하게 정리함
                f.repaint();

            } catch (Exception e) {

            }
        } // while
    }

}
