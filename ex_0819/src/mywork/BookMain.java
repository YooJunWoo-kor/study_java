package mywork;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 도서 데이터를 저장할건가요? ");
        int n = sc.nextInt();
        Book[] b = new Book[n];
        int sum = 0;
        int avg = 0;

        for(int i = 0; i < b.length; i++){
            b[i] = new Book();
            System.out.printf("%d번 책 제목 : ", i + 1);
            b[i].setTitle(sc.next());
            System.out.printf("%d번 책 저자 : ", i + 1);
            b[i].setAuthor(sc.next());
            System.out.printf("%d번 책 가격 : ", i + 1);
            b[i].setPrice(sc.nextInt());
        }

        for(int i = 0; i < b.length; i++){
            b[i].showInfo();
            sum += b[i].getPrice();
        }

        avg = sum / n;

        System.out.printf("총합 : %d / 평균가격 : %d\n", sum, avg);


        

        

    }
}
