package ex2_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UserLoader {
    private User user;
    private FileInputStream fis = null;
    private ObjectInputStream ois = null;

    public User loadInfo( String id ){
        
        String path = "C:/myFile/HangMan/" + id + "/hangman.sav";

        File f = new File(path);

        if( f.exists() ){
            
            try {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                
                //읽어온 데이터를 User클래스 형태로 넘겨준다
                user = (User)ois.readObject();


            } catch (Exception e) {
                // TODO: handle exception
            }finally{
                try {

                    if( ois != null ) ois.close();
                    if( fis != null ) fis.close();
                    
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

        }else{
            System.out.println("해당 유저의 정보가 없습니다");
        }

        return user;

    }
}

