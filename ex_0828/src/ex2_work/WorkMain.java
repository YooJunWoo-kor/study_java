package ex2_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    /*
    Word : ☆☆☆☆☆ >> a
    Word : a☆☆☆☆ >> a
    a은(는) 이미 입력한 문자입니다
    Word : a☆☆☆☆ >> e
    Word : a☆☆☆e >> o
    o이(가) 포함되어 있지 않습니다
    Word : a☆☆☆e >> p
    Word : app☆e >> abc
    한글자의 영 소문자만 입력 가능합니다
    Word : app☆e >> l
    apple 정답
    7회 만에 정답
     */
    public static void main(String[] args) {
        UserWriter uw = new UserWriter();
        String[] quizword = {"apple", "banana", "pineapple", "orange", "tomato"};
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String answer = quizword[rd.nextInt(quizword.length)];
        char[] answerstar = new char[answer.length()];
        int count = 0;
        int precount = 0;
        String ans = null;


        User user;
        UserLoader ul = new UserLoader();

        while(true){
            System.out.print("아이디가 있습니까 ? y/n ");
            ans = sc.next();


            if(ans.equalsIgnoreCase("y")){
                System.out.print("id : ");
                String id = sc.next();
    
                System.out.print("pw : ");
                String pw = sc.next();

                user = ul.loadInfo(id);
                if(!pw.equals(user.getPw())){
                    System.out.println("비밀번호가 올바르지 않습니다");
                    return;
                }
                precount = user.getCount();
                System.out.println("현재 최고 기록 : " + user.getCount() + "회");
                user.setCount(0);
                break;

            }else if(ans.equalsIgnoreCase("n")){
                System.out.println("회원가입할 id와 비밀번호를 입력해주세요 : ");
                System.out.println("-------------------");

                System.out.print("id : ");
                String id = sc.next();
    
                System.out.print("pw : ");
                String pw = sc.next();

                user = new User(id , pw);
                System.out.println("신규유저로 게임을 시작합니다");
                break;
            }else{
                System.out.println("y 또는 n으로 입력해주세요");
                continue;
            }
        }

        for(int i = 0; i < answerstar.length; i++){
            answerstar[i] = '☆';
        }
        while(true){
            
            for(char c : answerstar){
                System.out.print(c);
            }
            System.out.print(" >> ");
            String useranswer = sc.next();
            count++;
            HangMan hm = new HangMan(answerstar, useranswer, answer);
            hm.start(user);

            String s = new String(answerstar);

            if(s.equals(answer)){
                System.out.println(answer + "정답");
                System.out.println(user.getCount() + "회 만에 정답");
                if(ans == "y"){
                    if(count < precount){
                        user.setCount(count);
                    }
                }else{
                    user.setCount(count);
                }
                break;
            }
        }
            uw.writeInfo(user);
        


    }
}
