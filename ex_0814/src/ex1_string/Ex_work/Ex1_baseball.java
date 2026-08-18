package ex1_string.Ex_work;

import java.util.Random;
import java.util.Scanner;

// 정답 : 142
  //세자리 수를 입력하세요 - 123
  // 1Strike, 1Ball
  //세자리 ... - 567
  //OUT!!
  //세자리 ... - 214
  //0Strike 3Ball  

public class Ex1_baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력받기
        int[] answer = new int[3]; // 컴퓨터가 랜덤으로 생성하는 숫자 세자리에 대한 배열
        int[] user = new int[3]; // 실행했을때 내가 치는 숫자 세자리에 대한 배열
        int[] div = new int[user.length]; // 내가 치는 숫자 각 자리의 숫자를 나누기 위한 배열
        int strike = 0; int ball = 0; // 스트라이크와 볼의 횟수를 저장할 변수 초기화
        int cnt = 0; // 몇번만에 맞췄는지를 확인하기 위한 횟수변수
        

        outer: for(int i = 0; i < answer.length; ){ // 숫자 세자리 모두 채워질때까지 for문 돌기
            answer[i] = new Random().nextInt(9) + 1; // 1 ~ 9 사이의 랜덤숫자 생성해서 컴퓨터 숫자를 저장하는 answer배열에 저장


            for(int j = 0; j < i; j++){ // 중복을 검사할 for문
                if(answer[i] == answer[j]){ // 방금 생성된 컴퓨터 숫자 배열이 이미 생성된 컴퓨터 숫자 배열에 존재하는 경우
                    continue outer; // for문을 다시 돌려서 다시 랜덤 숫자 생성
                }
            }
            i++; // 중복된 숫자가 없을 때 i값 증가시켜 다음 위치의 answer배열에 컴퓨터 랜덤 숫자 저장하기
        } // outer
    
        System.out.println(); // 줄바꿈
        int divindex = 0; // 10의 거듭제곱을 저장할 변수 

        for(int i = user.length-1; i >= 0; i--){ // 나눌 숫자를 저장할 div배열을 위한 for문
            div[i] = (int)Math.pow(10, divindex++); // div배열에 10의 divindex 거듭제곱만을 저장 이처럼 세자리일 경우 div배열에는 {100, 10, 1}이 저장됨

            if(divindex > user.length-1){ // divindex가 n자리 숫자보다 커질 경우 더이상 나눌 거듭제곱의 수가 필요하지 않기때문에 for문 브레이크
                break;
            }
        }


        while(strike != 3){ // strike가 3이되면 자동 종료되게 while문 열기
            System.out.print("세자리 수를 입력하세요(예:123) - "); 
            int userN = sc.nextInt(); // 내가 치는 숫자를 저장할 변수 userN 
            cnt++; // 몇번 정답을 맞추려는 시도를 했는지 저장하는 변수 cnt
            

            for(int i = 0; i < user.length; i++){ 
                user[i] = userN / div[i]; // 내가 입력한 숫자의 가장 앞자리수부터 user배열에 저장
                userN %= div[i]; // userN 변수에 이미 저장한 자리의 숫자를 제외
            }

            for(int i = 0; i < answer.length; i++){
                for(int j = 0; j < answer.length; j++){
                    if(user[i] == answer[j]){ // 내가 입력한 숫자와 컴퓨터가 생성한 숫자 사이에서 같은 숫자가 있을 때 

                        if(i == j){ // 만약 인덱스까지 같다면 (줄까지 같다)
                            strike++; // 스트라이크 변수 증가
                        }else{ // 인덱스는 같지 않고 숫자만 같다면
                            ball++; // 볼 변수 증가
                        }
                    }
                }
            }


            if(strike == 0 && ball == 0){ // 같은 숫자가 한개도 없을 때
                System.out.println("OUT!"); // out출력
                
            }else if(strike != 3){ // strike가 3개가 아닐경우(정답이 아닐경우)
                System.out.printf("%d Strike %d Ball \n", strike, ball); // strike횟수와 ball횟수 출력
                strike = 0; ball = 0; // 이후 strike와 ball 횟수의 출력을 위해서 두 변수를 0으로 초기화
               
            }

        }//while

        System.out.println("정답입니다!"); // while문을 빠져나왔다면 strike가 3이므로 정답 
        System.out.println(cnt + "회 클리어"); // 몇번안에 정답을 맞췄는지 출력

    }
    
}

  

  


