package ui1_main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import forge.ForgeMain;
import miniproject.MiniPro;
import agree_game.ShuffleMain;
import rsp.RspMain;
import find.FindMain;

public class TermsFrame extends Frame {

    private StartFrame start;
    private Button fok, sok, thok, fuok, fifthok, lastok; // fifthok, lastok 변경
    private Label first, second, third, fourth, fifth, last; // fifth, last 변경
    private Label check1, check2, check3, check4, check5, check6;

    public TermsFrame(StartFrame start) {

        this.start = start;

        // 6조까지 표시하기 위해 높이를 400 -> 450으로 확장
        setBounds(450, 150, 400, 450); 
        setTitle("이용약관");
        setLayout(null);

        // 이용약관 내용
        Label notice = new Label("모든 이용약관에 동의하면");
        notice.setFont(new Font("바탕체", Font.BOLD, 15));
        notice.setBounds(100, 30, 300, 30);

        Label noticetwo = new Label("게임이 클리어됩니다.");
        noticetwo.setFont(new Font("바탕체", Font.BOLD, 15));
        noticetwo.setBounds(120, 50, 300, 50);

        first = new Label("제 1조  이용자의 자세에 대하여"); // 제1동의
        first.setFont(new Font("맑은고딕", Font.BOLD, 20));
        first.setBounds(20, 110, 300, 35);
        check1 = new Label("   ✓");
        check1.setFont(new Font("맑은고딕", Font.BOLD, 20));
        check1.setBounds(320, 110, 60, 35);
        check1.setVisible(false);

        second = new Label("제 2조  중독성에 대하여"); // 제2동의
        second.setFont(new Font("맑은고딕", Font.BOLD, 20));
        second.setBounds(20, 160, 300, 35);
        check2 = new Label("   ✓");
        check2.setFont(new Font("맑은고딕", Font.BOLD, 20));
        check2.setBounds(320, 160, 60, 35);
        check2.setVisible(false);

        third = new Label("제 3조  손해배상에 대하여"); // 제3동의
        third.setFont(new Font("맑은고딕", Font.BOLD, 20));
        third.setBounds(20, 210, 300, 35);
        check3 = new Label("   ✓");
        check3.setFont(new Font("맑은고딕", Font.BOLD, 20));
        check3.setBounds(320, 210, 60, 35);
        check3.setVisible(false);

        fourth = new Label("제 4조  개인정보 취급에 대하여"); // 제4동의
        fourth.setFont(new Font("맑은고딕", Font.BOLD, 20));
        fourth.setBounds(20, 260, 300, 35);
        check4 = new Label("   ✓");
        check4.setFont(new Font("맑은고딕", Font.BOLD, 20));
        check4.setBounds(320, 260, 60, 35);
        check4.setVisible(false);

        fifth = new Label("제 5조  권리 귀속에 대하여"); 
        fifth.setFont(new Font("맑은고딕", Font.BOLD, 20));
        fifth.setBounds(20, 310, 300, 35);
        check5 = new Label("   ✓");
        check5.setFont(new Font("맑은고딕", Font.BOLD, 20));
        check5.setBounds(320, 310, 60, 35);
        check5.setVisible(false);

        last = new Label("제 6조  당신의 인생에 대하여"); // 제6동의 (최종 last)
        last.setFont(new Font("맑은고딕", Font.BOLD, 20));
        last.setBounds(20, 360, 300, 35);
        check6 = new Label("   ✓");
        check6.setFont(new Font("맑은고딕", Font.BOLD, 20));
        check6.setBounds(320, 360, 60, 35);
        check6.setVisible(false);
        // 약관내용 끝

        // 약관 확인버튼
        fok = new Button("확인하기");
        sok = new Button("확인하기");
        thok = new Button("확인하기");
        fuok = new Button("확인하기");
        fifthok = new Button("확인하기"); // 5조 버튼
        lastok = new Button("확인하기");  // 6조 최종 버튼

        // 1버튼 기본 활성화
        fok.setBounds(320, 113, 60, 30); 

        // 2~6버튼 기본 비활성화
        sok.setBounds(320, 163, 60, 30);
        sok.setVisible(false);
        thok.setBounds(320, 213, 60, 30);
        thok.setVisible(false);
        fuok.setBounds(320, 263, 60, 30);
        fuok.setVisible(false);
        fifthok.setBounds(320, 313, 60, 30);
        fifthok.setVisible(false);
        lastok.setBounds(320, 363, 60, 30);
        lastok.setVisible(false);

        fok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TermsFrame.this.start.setVisible(true); // 시작화면 유지
                setVisible(false); // 약관동의 화면 안보이게 처리
                new First_ok(TermsFrame.this); // 제1조로 이동
            }
        });

        sok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                MiniPro.start(TermsFrame.this); // 제2조(미로)로 이동
            }
        });

        thok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ForgeMain.start(TermsFrame.this); // 제3조(검 강화)로 이동
            }
        });

        fuok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ShuffleMain.start(TermsFrame.this); // 제4조로 이동
            }
        });

        fifthok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                RspMain.start(TermsFrame.this); // 제5조(가위바위보)로 이동
            }
        });

        lastok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                FindMain.start(TermsFrame.this);
            }
        });

        // ------------------------------------------------------------------
        addWindowListener(new WindowAdapter() { //닫기버튼
            @Override
            public void windowClosing(WindowEvent e) {                
                dispose();
                start.showMainButtons();

            }
        });

        TextArea area = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
        area.setBounds(10, 100, 380, 330);
        area.setEditable(false);

        // 약관 라벨 추가
        add(first); add(second); add(third); add(fourth); add(fifth); add(last); 

        // 약관 체크표시 추가
        add(check1); add(check2); add(check3); add(check4); add(check5); add(check6);

        // 약관공지
        add(notice); add(noticetwo);

        // 확인 버튼 추가
        add(fok); add(sok); add(thok); add(fuok); add(fifthok); add(lastok);

        // 텍스트에리아
        add(area);

        setVisible(true);

    }// TermsFrame

    public void resetterms(){ // 리셋 : 초기화면

        first.setBackground(Color.WHITE);
        second.setBackground(Color.WHITE);
        third.setBackground(Color.WHITE);
        fourth.setBackground(Color.WHITE);
        fifth.setBackground(Color.WHITE);
        last.setBackground(Color.WHITE);

        check1.setVisible(false);
        check2.setVisible(false);
        check3.setVisible(false);
        check4.setVisible(false);
        check5.setVisible(false);
        check6.setVisible(false);

        fok.setVisible(true);
        sok.setVisible(false);
        thok.setVisible(false);
        fuok.setVisible(false);
        fifthok.setVisible(false);
        lastok.setVisible(false);

    }// resetterms

    public void firstAgree() {
        fok.setVisible(false);
        first.setBackground(Color.GREEN);
        check1.setVisible(true);
        check1.setBackground(Color.GREEN);
        sok.setVisible(true);
    }

    public void secondAgree() {
        sok.setVisible(false);
        second.setBackground(Color.GREEN);
        check2.setVisible(true);
        check2.setBackground(Color.GREEN);
        thok.setVisible(true);
    }

    public void thirdAgree() {
        thok.setVisible(false);
        third.setBackground(Color.GREEN);
        check3.setVisible(true);
        check3.setBackground(Color.GREEN);
        fuok.setVisible(true);
    }

    public void fourthAgree() {
        fuok.setVisible(false);
        fourth.setBackground(Color.GREEN);
        check4.setVisible(true);
        check4.setBackground(Color.GREEN);
        fifthok.setVisible(true);
    }

    public void fifthAgree() { // 5번째 동의 시 호출
        fifthok.setVisible(false);
        fifth.setBackground(Color.GREEN);
        check5.setVisible(true);
        check5.setBackground(Color.GREEN);
        lastok.setVisible(true); // 6번째(last) 버튼 활성화
    }

    public void lastAgree() { // 6번째(마지막) 동의 시 호출
        lastok.setVisible(false);
        last.setBackground(Color.GREEN);
        check6.setVisible(true);
        check6.setBackground(Color.GREEN);

        // 약관창 닫기
        setVisible(false);

        //엔딩 크레딧 실행
        new ClearFrame(start);

    }

    public StartFrame getStart(){
        return start;
    }

}// class