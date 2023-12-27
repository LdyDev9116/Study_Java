package oop.day2.classEx.sec03.exam02;

public class Car {
	//1. 모든 필드는 private 변경한다. 의 의미는 Car 의 모든 멤버들을 캡슐화(다른 클래스가 직접 접근을 금지)하겠다
	//필드 선언
	private String company ;
	private String model ;
	private String color ;
	private int maxSpeed ;
	private int speed;


	// 2. 생성자 오버로딩
	// 모든 클래스의  생성자는 해당 클래스의 접근제한자를 따른다.
	// 생성자는 메소드와 비슷하지만, 리턴타입이 없고 클래스이름과 동일하다
	// 생성자의 매개변수는 new 연산자로 생성자를 호출할때, 매개값을 (매개변수) 생성자 블록 내부 로 전달하는 역할을 한다

	//없어지기때문에 Heap 메모리에 옮겨두기 위함  아래와 같이 작성해줘야함
	public Car(String company ,String  model, String color, int maxSpeed , int speed ) {
		this.company = company; //new 에서 넘겨준 객체의 값  초기값들을 집어넣어라
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}

	public Car(){

	}


	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}



	//3. company, model, maxSpeed, color 는 객체가 생성되면 변경할 수 없고, 읽기만 가능하도록 재구성 하세요  public getter 메소드로

	//4. speed 멤버는 읽기 쓰기가 가능하도록 publiuc getter setter 메소드를 작성하세요

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}