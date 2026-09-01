package ex3_form;

import java.awt.*;
import java.awt.desktop.OpenURIEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStream;

public class FormMain {
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.setBounds(500,200,400,600);
        f.setVisible(true);
        f.setBackground(Color.CYAN);
        f.setLayout(null);

        Font font = new Font("", Font.PLAIN,30);

        //최상단
        TextField tf = new TextField();
        tf.setFont(font);
        tf.setBounds( 10, 30, 280, 35 );

        Button btn = new Button("입력");
        btn.setEnabled(false); // 버튼 비활성화
        btn.setBounds(300, 30, 80, 35);
        btn.setBackground(Color.WHITE);


        //중앙단
        TextArea ta = new TextArea();
        ta.setFont(font);
        ta.setBounds(10, 70, 380,400);
        ta.setEditable(false);
        

        //최하단
        Button btnSave = new Button("저장");
        Button btnClose = new Button("종료");
        btnSave.setBounds(45, 530, 150, 50);
        btnClose.setBounds(205,530,150,50);

        //tf에 값이 들어간 경우를 감지
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(java.awt.event.TextEvent e) {
                // 텍스트필드 내용이 비어있지 않으면 버튼 활성화, 아니면 비활성화
                btn.setEnabled(!tf.getText().isEmpty());
                /*
                if(tf.getText().trim().equals("")){
                    btn.setEnabled(false);
                }
                else{
                    btn.setEnabled(true);
                }
                */
            }
    
        });

        //입력버튼에 클릭을 감지
        btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            // TextField의 텍스트를 받아와서 TextArea에 추가
            String text = tf.getText();
            if (!text.isEmpty()) {
                ta.append(text + "\n");
                tf.setText("");
                tf.requestFocus();
            }
        }

        });
        
        //tf에서 키보드의 엔터값을 감지
        tf.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
                if( e.getKeyChar() == KeyEvent.VK_ENTER ){
                    ta.append(tf.getText() + "\n");
                    tf.setText("");
                    tf.requestFocus();
                }
            }
        }); 

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = ta.getText();
                FileWriter fw = null;
                BufferedWriter bw = null;
                

                try {
                    
                    FileDialog fd = new FileDialog(f, "저장", FileDialog.SAVE);
                    fd.setVisible(true);

                    String path = fd.getDirectory() + fd.getFile();
                    System.out.println(path);

                    //msg를 저장
                    fw = new FileWriter(path);
                    bw = new BufferedWriter(fw);
                    bw.write(msg);
                    bw.flush();

                } catch (Exception e2) {
                    // TODO: handle exception
                }finally{
                    try {
                        if(bw != null)
                            bw.close();
                        if(fw != null)
                            fw.close();
                    } catch (Exception e3) {
                        // TODO: handle exception
                    }
                }
            }
        });

        

        f.add(btnSave);
        f.add(btnClose);
        f.add(ta);
        f.add(tf);
        f.add(btn);

        f.setResizable(false);

        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
