package oop2;

public class Person2 {

    private final String name;
    private final String age;
    private final String address;
    private final String tel;
    private final String data;

    public static class Builder {
        //필수 매개변수
        private final String name;   //(Lm1, 1회 제공량) 필수
        private String age;      //(m1, n회 제공량) 필수
        //선택 매개변수
        private String address;
        private String tel;
        private String data;


        public Builder(String name) {
            this.name = name;
        }

        public Builder age(String val) {
            age = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder tel(String val) {
            tel = val;
            return this;
        }

        public Builder data(String val) {
            data = val;
            return this;
        }

        public Person2 build() {
            return new Person2(this);
        }
    }

    private Person2(Builder builder){
        name = builder.name;
        age = builder.age;
        address = builder.address;
        tel = builder.tel;
        data = builder.data;

    }
    public void personinfomation() {
        System.out.println(name+"의 나이는"  + age +"이고 주소는 "+ address +"이며 전화번호는 "+ tel );
    }





}
