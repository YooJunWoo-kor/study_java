package poke;

import java.util.Random;

public class PokeMain {
    public static void main(String[] args) {

        String[] sname = {"피카츄", "파이리"};
        int[] nhp = {100, 80};
        String[] stype = {"전기", "불"};

        

        Pokemon p = new Pokemon();
        p.name = sname[new Random().nextInt(2)];
        p.hp = nhp[new Random().nextInt(2)];
        p.type = stype[new Random().nextInt(2)];
        p.info();
    }
}
