package my_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        User u = new User();

        Scanner sc = new Scanner(System.in);
        System.out.print("ID : ");
        String id = sc.next();
        
        try{
        if(!id.equals(u.getId())){
            throw new WrongIdException("잘못된 계정입니다");
        }
        } catch(WrongIdException e){
            System.out.println(e.getMessage());
        }

    }
}
