package miniproject;

import java.awt.*;

public class MazePanel {

    int[][] maze;
    Frame f;
    User user;
    Label player;

    public MazePanel(int[][] maze, Frame f) {
        this.maze = maze;
        this.f = f;
        this.user = new User();
    }

    // 플레이어(열쇠 아이콘) 라벨 생성
    public Label buildPlayer() {
        player = new Label() {
            Image img = Toolkit.getDefaultToolkit().getImage("src/image/key.png");

            @Override
            public void paint(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        player.setBounds(user.playCol * 44 + 23, user.playRow * 46 + 288, 44, 44);
        return player;
    }

    // 미로 칸(벽/길/골) 전부 만들어서 f에 붙이기
    public void buildMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < 23; j++) {

                if (maze[i][j] == 2) {
                    Label goalLabel = new Label() {
                        Image img = Toolkit.getDefaultToolkit().getImage("src/image/clear.png");

                        @Override
                        public void paint(Graphics g) {
                            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
                        }
                    };
                    goalLabel.setBounds(j * 44 + 23, i * 46 + 288, 46, 46);
                    f.add(goalLabel);
                    continue;
                }

                if (maze[i][j] == 1) {
                    Label wallLabel = new Label() {
                        @Override
                        public void paint(Graphics g) {
                            g.setColor(new Color(250, 250, 250));
                            g.fillRect(0, 0, getWidth(), getHeight());

                            g.setColor(new Color(255, 122, 122));
                            g.fillRoundRect(3, 5, 40, 40, 12, 12);
                        }
                    };
                    wallLabel.setBounds(j * 44 + 23, i * 46 + 288, 46, 46);
                    f.add(wallLabel);
                } else {
                    Label pathLabel = new Label();
                    pathLabel.setBackground(Color.WHITE);
                    pathLabel.setBounds(j * 44 + 23, i * 46 + 288, 46, 46);
                    f.add(pathLabel);
                }

            } // inner
        } // for
    }
}
