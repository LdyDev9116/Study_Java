package oop.day7.account2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateSeqFile extends Frame implements ActionListener  {

    private TextField account,name,balance;
    private  Button enter, done;

    private DataOutputStream output ;

    public CreateSeqFile(){
        super("고객의 정보 파일 생성 ");
        try {
            output = new DataOutputStream(new FileOutputStream("client.doc"));
        }catch (IOException e){
            System.err.println(e.toString());
            System.exit(1);

        }
        setSize(250,150);
        setLayout(new GridLayout(4,2));
        add(new Label("계좌번호"));
        account = new TextField();
        add(account);

        add(new Label("이름"));
        name = new TextField(20);
        add(name);

        //balance Frame에 붙이기
        add(new Label("잔고"));
        balance = new TextField(20);
        add(balance);

        enter = new Button("입력");
        enter.addActionListener(this);
        add(enter);

        done = new Button("종료");
        done.addActionListener(this);
        add(done);
        setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }



}
