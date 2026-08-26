package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        //ArrayList에 색상정보를 랜덤으로 10개 담기
        //담긴 값들 중, 내가 입력받은 문장과 동일한 값이
        // 몇 번째 index에 있는지 찾아내서 출력
        //------------------------------------------
        //찾을 색상 : yellow
        //[RED, BLUE, BLUE, YELLOW, RED, ....]
        //yellow의 모든 index : [3, 5]

        Scanner sc = new Scanner(System.in);
        String[] str = {"RED", "GREEN", "BLUE", "YELLOW"};
        List<String> list = new ArrayList<String>();
        Random rd = new Random();
        List<Integer> index = new ArrayList<Integer>();
        

        for(int i = 0; i < 10; i++){
            int num = rd.nextInt(str.length);
            list.add(str[num]);
        }

        System.out.println(list);

        System.out.print("찾을 색상 : ");
        String searchcolor = sc.next();

        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equalsIgnoreCase(searchcolor)){
                index.add(i);
            }
        }
    
        System.out.println(index);

    }
}
