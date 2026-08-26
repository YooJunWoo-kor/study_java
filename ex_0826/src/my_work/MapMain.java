package my_work;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("철수" , 80);
        map.put("영희", 95);
        map.put("민수", 70);

        int yscore = map.get("영희");
        System.out.println("영희의 점수 : " + yscore);
        System.out.println("철수 존재 여부 : " + map.containsKey("철수"));

        Set<String> set = new HashSet<>();
        set.add("철수");
        set.add("영희");
        set.add("민수");

        String[] arr = set.toArray(new String[0]);

        for(String s : arr){
            System.out.println(s + " : " +  map.get(s));
        }

        System.out.println(map.size());
        set.clear();
        System.out.println(set.size());

    }
}
