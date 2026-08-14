import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {
        
        // 1 ~ 12월 사이의 값을 키보드에 입력
        // 입력된 값에 해당하는 달이 몇일까지 있는지 출력
        // -----------------------------------------
        // 3월은 31일까지 있습니다

        Scanner sc = new Scanner(System.in);

        //굳이 배열로 품 

        int[] calender = new int[12];
        int[] day = {30, 31, 28};

        int month = 0;

        do{
            System.out.print("1 ~ 12월 사이의 값을 입력 : ");
            month = sc.nextInt();

        }while(month > calender.length || month < 1);

        
        for(int i = month-1; i < calender.length; i++){
            

            if(i == 1){
                calender[i] = day[2];
                break;
            }

            if(i  <= 6){
                if(i % 2 == 0){
                    calender[i] = day[1];
                }else{
                    calender[i] = day[0];
                }
            
            }else{
                if (i % 2 == 0){
                    calender[i] = day[0];
                }
                else{
                    calender[i] = day[1];
                }
            }

            
        }


        /* 좋은 정답
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "월은 31일 까지");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 30일 까지");
                break;
            
            case 2:
                System.out.println(month + "월은 28일 까지");
                break;
            
            default:
                System.out.println(month + "월은 없음");
                break;
        }
        */

         
        
    
        System.out.printf("%d월은 %d일까지 있습니다",month, calender[month-1]);
          


    }
}
