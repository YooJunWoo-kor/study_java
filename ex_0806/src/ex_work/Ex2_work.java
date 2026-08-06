package ex_work;

public class Ex2_work {

    public static void main(String[] args) {

        // [연습문제 - 난이도 UP!]
        // 아래 조건에 맞는 if, else if, else문 코드를 작성해보세요.
        //
        // 국어(kor), 영어(eng), 수학(math), 과학(sci) 4과목의 점수가 각각 변수에 저장되어 있음
        //
        // 1. 네 과목 모두 85점 이상이면 "만점자"
        // 2. 각 과목이 모두 50점 이상이면서, 총점이 330점 이상이면 "장학생"
        // 3. 과목 중 50점 미만이 두 개 이상이면 "과락"
        // 4. 평균이 60점 미만이면 "재시험"
        // 5. 위의 조건이 모두 아니라면 "통과"
        //
        // (순서대로 조건을 체크하여 코드 작성, 답안은 작성하지 마세요)

        int kor = 40;
        int eng = 40;
        int math = 60;
        int sci = 50;
        float average = (kor + eng + math + sci) / 4f;
        int total = kor + eng + math + sci;
        int count50 = 0;

        String res = "";

        if (kor >= 50) {
            count50++;
        }
        if (eng >= 50) {
            count50++;
        }
        if (math >= 50) {
            count50++;
        }
        if (sci >= 50) {
            count50++;
        }

        if (kor >= 85 && eng >= 85 && math >= 85 && sci >= 85) {
            res = "만점자";

        } else if (count50 == 4 && total >= 330) {
            res = "장학생";

        } else if (count50 <= 2) {
            res = "과락";

        } else if (average < 60) {
            res = "재시험";

        } else {
            res = "통과";

        }

        System.out.println(res);

    }

}
