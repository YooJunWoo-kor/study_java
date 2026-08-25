package ex1_set;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>(); 

        Random rnd = new Random();
        
        while( ts.size() < 6) {

            int r = rnd.nextInt(45) + 1;
            ts.add(r);

        }

        System.out.println(ts); // Hashset에다가 오름차순 기능이 기본적으로 플러스되어있다.
        System.out.println(ts.subSet(10, 30));

        Set<String> set = new TreeSet<String>();
        set.add("홍길동");
        set.add("강길순");
        set.add("고봉민");
        System.out.println(set);
        
    }
    
}
