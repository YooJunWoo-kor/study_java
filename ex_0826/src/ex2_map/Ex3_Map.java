package ex2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map {
    public static void main(String[] args) {

        //id : abc
        //pw : 1111
        //id가 존재하지 않습니다

        //id : kim
        //pw : 2222
        //비밀번호 불일치

        //id : Lee
        //pw : 2222
        //로그인 성공
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("kim", 1111);
        map.put("lee", 2222);

        System.out.print("id : ");
        String id = sc.next();
        System.out.print("pw : ");
        int pw  = sc.nextInt();

        if( map.containsKey(id) && map.get(id) == pw ){
            System.out.println("로그인 성공");
        }else if( map.containsKey(id) ){
            System.out.println("비밀번호 불일치");
        }else{
            System.out.println("id가 존재하지 않습니다");
        }
        /*
            강의 답변
        if( !map.containsKey(id) ){
            sysout id가 존재하지 않음
        }else{

            if( map.get(id) ==  pw )
                sysout("로그인 성공");
            else
                sysout("비밀번호 불일치");
            }
         */

    }
}
