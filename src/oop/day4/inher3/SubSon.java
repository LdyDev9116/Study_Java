package oop.day4.inher3;

public class SubSon extends SubFather  {

    private String son ;
    public void printSon(){

//        getSon();
//        getFamilyName();
//        getHouseAddress();

        System.out.println("나는 " + getSon() + "입니다 printSon  출력");
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }
}
