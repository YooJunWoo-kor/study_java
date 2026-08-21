package ex10_work;

public class Magic {


    public void makeMagic(int[][] magic){
        int n = magic.length;
        int r = 0;
        int c = n / 2; 
        int nextR = 0;
        int nextC = 0;

        for(int i = 1; i <= n * n; i++){
            magic[r][c] = i;

            nextR = (r - 1 + n) % n;
            nextC = (c + 1) % n;

            if(magic[nextR][nextC] != 0){
                nextR = r + 1 % n;
                nextC = c;
            }
            
            r = nextR;
            c = nextC;
        }
    }

}
