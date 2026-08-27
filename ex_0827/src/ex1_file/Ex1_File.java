package ex1_file;
import java.io.File;

public class Ex1_File {
    public static void main(String[] args) {
        
        //IO(Input / Output)
        //IO는 입출력 스트림을 의미한다
        //스트림이란 데이터를 입출력하기 위한 방법
        //JVM에서 콘솔로 값을 내보내면 Output
        //콘솔의 값을 JVM에서 읽어야한다면 Input
        //역슬래시 두개로 경로 들어가도되지만 왠만하면 /로하자

        //입출력 스트림의 종류
        //1) byte기반의 스트림
        // - ...Stream구조의 클래스들
        
        //2) char기반의 스트림
        //- ...Reader, ...Writer 구조의 클래스들

        String path = "c:/java/test.txt";
        File f = new File(path); 
        
        //생성한 file객체가 파일구조라면...
        if( f.isFile() ){
            System.out.println("용량 : " + f.length() + "byte");
        }
        

    }//main
}
