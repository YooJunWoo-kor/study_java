package miniproject;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;

import ui1_main.TermsFrame;

import java.awt.Frame;

public class MazeButtonListener implements ActionListener {
    private int[][] maze;
    private User user;
    private Label player;
    private Button yes;
    private Button no;
    private Button ex;
    private boolean[] gameOver;

    private Frame f;
    private Frame infoFrame;
    private Frame timerFrame;
    private TermsFrame terms;
    

    public MazeButtonListener(int[][] maze, User user, Label player, Button yes, Button no, Button ex, boolean[] gameOver,Frame f,Frame infoFrame, Frame tf, TermsFrame terms){
        this.maze = maze;
        this.user = user;
        this.player = player;
        this.yes = yes;
        this.no = no;
        this.ex = ex;
        this.gameOver = gameOver;
        this.f = f;
        this.infoFrame = infoFrame;
        this.timerFrame = tf;
        this.terms = terms;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        if(gameOver[0]) return; // 이미 게임이 끝났으면 더 이상 움직이지 않게

        int newRow = user.playRow;
        int newCol = user.playCol;

        if(e.getActionCommand().equals("←")){ newCol = user.playCol -1; }
        if(e.getActionCommand().equals("→")){ newCol = user.playCol +1; }
        if(e.getActionCommand().equals("↑")){ newRow = user.playRow -1; }
        if(e.getActionCommand().equals("↓")){ newRow = user.playRow +1; }

        user.playRow = newRow;
        user.playCol = newCol;
        player.setBounds(user.playCol * 44 + 23, user.playRow * 46 + 288, 44, 44);

        if(maze[newRow][newCol] == 2){
            yes.setEnabled(true);
            yes.repaint();
        }

        if(maze[newRow][newCol] == 1){
            gameOver[0] = true;
            no.setEnabled(false);
            ex.setEnabled(false);
            new GameOverFrame(terms).show(f, infoFrame, timerFrame);
        }
    }
}
