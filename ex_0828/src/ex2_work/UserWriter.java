package ex2_work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserWriter{
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    public void writeInfo(User user) {
        String path = "C:/myFile/HangMan/" + user.getId() + "/hangman.sav";
        File dir1 = new File("C:/myFile/HangMan/");

        if (!dir1.exists()) {
            dir1.mkdirs();
        }

        File dir2 = new File(dir1, user.getId());

        if (!dir2.exists()) {
            dir2.mkdirs();
        }
        
        try {

            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            // user객체를 통째로 저장
            oos.writeObject(user);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("유저정보 저장 실패");
        } finally {
            try {
                if (oos != null)
                    oos.close();

                if (fos != null)
                    fos.close();

            } catch (Exception e) {

            }
        }
    }
}
