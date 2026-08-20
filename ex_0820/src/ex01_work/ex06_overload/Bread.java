package ex01_work.ex06_overload;

public class Bread {
    
    //메서드 1
    public void makeBread(){
        System.out.println("빵을 만들었습니다");
    }

    //메서드 2
    public void makeBread(int num){
        int i = 0;
        for(; i < num; i++){
            System.out.println("빵을 만들었습니다");
        }

        System.out.println("요청하신 " + i + "개의 빵을 만들었습니다");

    }

    //메서드 3
    public void makeBread(String breadN, int num){
        
        for(int i = 0; i < num; i++){
            System.out.println(breadN + "을 만들었습니다");
        }
        System.out.println("요청하신 " + num + "개의 " + breadN + "을 만들었습니다");

    }

}
