package oop.day2.hambuger;

//메소드는 해당 클래스

public class HambrugerBuilder {
    // 필수
    private int bun;
    private int patty;

    // 선택
    private int cheese;
    private int tomato;
    private int bacon;

    public static class Builder { // Builder 클래스 빌더는
        // 필수
        private int bun;
        private int patty;

        // 선택
        private int cheese;
        private int tomato;
        private int bacon;

        public Builder(int bun, int patty) { //이건 생성자  필수 값임
            this.bun = bun;
            this.patty = patty;
        }

        public Builder cheese(int cheese) { //메소드임  이름 :Builder 메소드  아래에
            this.cheese = cheese;

            return this;
        }

        public Builder tomato(int tomato) {
            this.tomato = tomato;

            return this;
        }

        public Builder bacon(int bacon) {
            this.bacon = bacon;

            return this;
        }

        public HambrugerBuilder build() {
            return new HambrugerBuilder(this);
        } //버거의 클래스 메소드임  다시 받은 값은 보여주기 위해
    }

    private HambrugerBuilder(Builder builder) { //생성자임  버거의
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.bacon = builder.bacon;
    }

    public String showBurgerTopping() {

        return "번 : %d짝 | 패티 : %d개 | 치즈 : %d개 | 토마토 : %d개 | 베이컨 : %d개"
                .formatted(this.bun, this.patty, this.cheese, this.tomato, this.bacon);

    }
}