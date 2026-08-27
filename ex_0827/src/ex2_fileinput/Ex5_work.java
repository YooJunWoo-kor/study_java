package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_work {
    public static void main(String[] args) throws IOException{
        
        //C:/myFile/work2.txt의 내용을 읽어서
        //회문인지 판단하시오
        //-------------------
        //토마토은(는) 회문입니다

        String path = "C:/myFile/work2.txt";
        File f = new File(path);
        FileInputStream fis = null;
        byte[] console = new byte[(int)f.length()];
        String s = null;
        String r = null;
        try{
            fis = new FileInputStream( f );
            fis.read(console);
            s = new String(console).trim();

            StringBuffer sb = new StringBuffer(s);
            r = sb.reverse().toString();

            //for(int i = s.length()-1; i >= 0; i--){
                //r += s.charAt(i);
            //}

            if(s.equals(r)){
                System.out.println(s + "은(는) 회문입니다");
            }else{
                System.out.println(s + "은(는) 회문이 아닙니다");
            }

        }catch(Exception e){
            

        }finally{
            if(fis != null){
                fis.close();
            }
        }

    }
}
