package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex1_Set {
    public static void main(String[] args) {
        
        //collection :
        //많은 수의 데이터를 그 사용 목적에 적합한 구조로 묶어서 하나로 그룹화한 객체형태
        //---------------------
        //Set, Map, List

        //Set은 java.util패키지의 인터페이스다.
        //특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
        //복잡한 코드없이 중복요소를 빠르게 제거할 수 있다.

        //Set인터페이스를 구현하고 있는 대표적인 자식클래스
        //HashSet : 정렬이 안됨
        //TreeSet : HashSet에다가 오름차순 기능이 추가되어있음
        Set<Integer> set = new HashSet<Integer>();
        set.add(150);
        set.add(70);
        set.add(10);
        set.add(200);
        
        //중복된 값은 추가하지 않는다.
        set.add(10);

        //set의 모든 내용을 비운다
        set.clear();

        System.out.println("set의 크기 : " + set.size());
        System.out.println( set );

        System.out.println("-----------------");

        Set<Integer> set2 = new HashSet<Integer>();
        Random rnd = new Random();

        while(true){
            int r = rnd.nextInt(6) + 1;
            set2.add(r);

            if(set2.size() == 6){
                break;
            }
        }

        System.out.println(set2);

        //set2를 배열로 변환
        Integer[] arr = set2.toArray( new Integer[0] ); // Hashset을 배열로 바꾸는 코드

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("-----------------------");

        int[] arr2 = new int[ set2.size() ];
        int i = 0;
        for( Integer num : set2 ){
            arr2[i] = num;
            System.out.print(arr2[i] + " ");
            i++;
        }
        


    }
}
