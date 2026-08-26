package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex2_List {
    public static void main(String[] args) {
        //[유비, 유봉, 유선, 관우, 관평]
        //[유비, 관우, 장비, 조조, 여포]
        
        List<String> list = new ArrayList<>();
        list.add("유비");
        list.add("유봉");
        list.add("유선");
        list.add("관우");
        list.add("관평");

        System.out.println( list );

        list.remove(1);
        list.remove(1);
        list.set(list.size() - 1,"장비");
        list.add("조조");
        list.add("여포");
        System.out.println( list );
        
    }
}
