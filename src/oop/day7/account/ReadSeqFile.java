package oop.day7.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReadSeqFile extends Frame implements ActionListener {
    private TextField account,name,balance;
    private  Button next, done;

    private DataInputStream input;   //필드에 입력된 account, name, balance 의 스트링객체를 담는 객체

    public ReadSeqFile(){
        super("Read ReadReadRead "); //고객 파일을 읽겠습니다.
/*        try{
            input = new DataInputStream(new FileInputStream("client.doc"));
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e1){
            System.err.println(e1.toString());
            System.exit(1);
        }*/
        setSize(250,150);
        setLayout(new GridLayout(4,2));
        account = new TextField();
        account.setEditable(false);
        add(account);
        add(new Label("name name"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        //balance Frame에 붙이기
        add(new Label("balance balance"));
        balance = new TextField(20);
        balance.setEditable(false);
        add(balance);

        next = new Button("output output ");
        next.addActionListener(this);
        add(next);

        done = new Button("cancle  ");
        done.addActionListener(this);
        add(done);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == next) readRecord();    // 데이터를 한 레코드씩 읽는 메서드
            else closeFile();

    }


    ///////////////2교시
    public void closeFile() {
        try {
            input.close();
            System.exit(0);
        }catch (IOException io){
            System.err.println(io.toString());
            System.exit(1);
        }

    }
    ///////////////2교시

    public void readRecord() { //1줄씩 출력 할거야 메소드 호출  오버라이드에
        String accountNumber;
        double balance;
        String  nameData;

        try { //
            accountNumber =  input.readUTF();
            nameData = input.readUTF();
            balance = input.readDouble();

            this.name.setText(nameData);
            this.account.setText(String.valueOf(accountNumber)); //각각의 필드에 set (캐스팅아래와같이 없어도됨
            this.balance.setText(String.valueOf(balance));


        }catch (EOFException e1){ // 파일읽다가 문제 있으면 클로즈 파일에서 닫을거얌
            closeFile();

        }catch (IOException e2){
            System.err.println(e2.toString());


        }catch (Exception e3){
            System.err.println(e3.toString());
        }



    }

    public static  void  main(String args[]){
        new ReadSeqFile();
    }

}
