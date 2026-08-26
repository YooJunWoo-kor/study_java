package ex7_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1_work {
    //ArrayList를 두 개 만들고 1 ~ 5 사이의 난수를 5개 추가해둔다
    // 두 개 리스트의 값을 비교하여 교집합을 출력
    //-------------------------------------------------
    //[5, 3, 5, 1, 5]
    //[2, 3, 1, 1, 3]
    //교집합 : [3, 1]
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> commonlist = new ArrayList<Integer>();
        int i = 0;

        while(i < 5){
            list1.add(rd.nextInt(5) + 1);
            list2.add(rd.nextInt(5) + 1);
            i++;
        }
        System.out.println(list1);
        System.out.println(list2);


        for(i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    if(!commonlist.contains(list1.get(i)))
                        commonlist.add(list1.get(i));
                }
            }
        }

        System.out.println("교집합 : " + commonlist);
        
    }
}
