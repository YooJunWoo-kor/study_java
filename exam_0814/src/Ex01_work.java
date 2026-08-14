public class Ex01_work {
    public static void main(String[] args) {
        // 과수원이 있다.
        // 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양이
        // 각각 5, 7, 5개

        // 1. 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
        // 2. 시간당 전체 과일의 평균 생산 갯수
        // 단. 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float

        int[] fruit = {5, 7, 5};

        int sum = 0;

        for(int i = 0; i < fruit.length; i++){
            sum += fruit[i];
        }

        System.out.println("과수원에서 하루에 생산되는 총 갯수 : " + sum);

        System.out.println("시간당 전체 과일의 평균 생산 갯수" + (float)sum / 24);




        
    }
}
