package ex_work;

public class Ex1_work {

    public static void main(String[] args) {

        // 나이가 15세 이상이거나, 키가 150cm 이상이면 탑승가능
        // 그렇지 않으면 탑승불가를 출력

        int age = 14;
        int height = 160;
        String res = "";
        if (age >= 15 || height >= 150) {
            res = "탑승가능";

        } else {
            res = "탑승불가";

        }

        System.out.println(res);

        res = (age >= 15 || height >= 150) ? "탑승가능" : "탑승불가";

        System.out.println(res);

        int kor = 80;
        int eng = 70;
        int math = 60;
        int total = kor + eng + math;

        String test = "";

        if ((kor >= 70 && eng >= 70) || (eng >= 70 && math >= 70) || (kor >= 70 && math >= 70)) {
            test = "우수";

        } else if (kor < 30 || eng < 30 || math < 30) {
            test = "재시험";

        } else if (total >= 200) {
            test = "특별상";

        } else {
            test = "일반";

        }
        System.out.println(test);

        /*
         * int count70 = 0;
         * 
         * if( kor >= 70 ) count70++;
         * if( eng >= 70 ) count70++;
         * if( math >= 70 ) count70++;
         * 
         * if( count70 >= 2 ){..} gemini 추천
         */

   



    }

}
