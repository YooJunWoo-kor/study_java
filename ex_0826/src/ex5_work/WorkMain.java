package ex5_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        
        //id : aaa
        //pw : 1111
        //aaa/1111
        //-----------
        //id : bbb
        //pw : 2222
        //aaa/1111
        //bbb/2222

        Scanner sc = new Scanner(System.in);
        List<User> list = new ArrayList<User>(); //제네릭 타입에는 클래스가 들어감

        outer : while(true){
            System.out.print( "id : ");
            String id = sc.next();

            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getId().equals(id)){
                    System.out.println("아이디가 중복됩니다");
                    continue outer;
                }
            }   

            System.out.print("pw : ");
            int pw = sc.nextInt();

            User u = new User();
            u.setId(id);
            u.setPw(pw);

            list.add(u);

            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).getId() + "/" + list.get(i).getPw());
            }

        }

        



    }//main
}
