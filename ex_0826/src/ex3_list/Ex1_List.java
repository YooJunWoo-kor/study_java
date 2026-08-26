package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(100);
        list.add(50);
        list.add(1,60); // 해당 인덱스에 값을 끼워넣고 나머지 값들을 뒤 인덱스로 민다
        list.set(0, 90); // 해당 인덱스 값을 바꾼다.
        list.remove(2); // 삭제하면 뒤 인덱스 값들을 땡겨온다 (중간에 값이 빠지거나하는 없다)

        if( list.contains(50) ){
            System.out.println("list에 50이 있다");
        }

        

        System.out.println("size : " + list.size());
        System.out.println( list );
        System.out.println("2번 인덱스값 : " + list.get(2)); // 리스트의 2번 인덱스 값을 가져옴
        
        list.clear();
        System.out.println(list.size());
    }

}
