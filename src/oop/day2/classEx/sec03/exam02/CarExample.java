package oop.day2.classEx.sec03.exam02;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		// Car타입의 myCar1 ( new연산자를 이용하여 생성된 객체의 주소값), 생성자를 호출해서 객체를 초기화한다.
		// 객체 초기화란 생성된 객체의 필드 (변수) 초기화 하거나, 메소들을 호출해서 객체를 사용할 준비 역할을 한다

		Car myCar2 = new Car("테슬라","X","white",300,0 );




		//Car 객체의 필드값 읽기

/*		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);

		//Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		*/


		System.out.println(myCar2.getCompany());
		System.out.println(myCar2.getModel());
		System.out.println(myCar2.getColor());
		System.out.println(myCar2.getMaxSpeed());
//		System.out.println(myCar2.getSpeed());

		myCar2.setSpeed(10);
		System.out.println(myCar2.getSpeed());





	}
}