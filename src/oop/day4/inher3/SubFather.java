package oop.day4.inher3;

public class SubFather extends GrandFather {

    private String SubFather ;
    private String  familyName;
    private String  houseAddress;

    public void printFather(){

        System.out.println("나의 아버지는 "+ getHouseAddress() );

        printGrandFather();
    }

    public String getSubFather() {
        return SubFather;
    }

    public void setSubFather(String subFather) {
        SubFather = subFather;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }
}
