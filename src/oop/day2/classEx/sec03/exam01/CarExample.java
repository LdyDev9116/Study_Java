package oop.day2.classEx.sec03.exam01;
//데이터 처리의 기본 기능 : CRUD ( Create (Insert) Read Update Delete )

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car mycar = new Car(); //그랜저
		//생성자를 통해서 객체 초기화 방법
		Car 아이오닉 = new Car("아이오닉",false ,0); //모댈 . 스탈 / 스피드
		Car 트위지 = new Car("트위지",false ,0);
		Car 모닝 = new Car("모닝",false ,0);
		Car 스파크 = new Car("스파크",false ,0);

		//Car 타입을 저장할 수 있는 배열 : myCarArray (5대주차 )
		Car[] myCarArray = new Car[5];

		//Car 객체의 필드값 읽기
		System.out.println(mycar.toString());

		//mycar model : 그랜저  spped : 100 srart : true

		mycar.model ="그랜저";
		mycar.speed = 100;
		mycar.start =true;

		System.out.println(mycar.model);
		System.out.println(mycar.speed);
		System.out.println(mycar.start);

		// myCarArray 차고에 1번째 공간에 그랜저를 주차하세요
		myCarArray[0] = mycar;
		System.out.println(myCarArray[0].model);
		System.out.println(myCarArray[0].speed);
		System.out.println(myCarArray[0].start);

		//myCarArray 주차공간에 그랜저, 아이오닉, 트위지, 모닝, 스파크 주차해주세요


		myCarArray[1] = 아이오닉;
		myCarArray[2] = 트위지;
		myCarArray[3] = 모닝;
		myCarArray[4] = 스파크;

		//기존
		for (int i = 0; i < myCarArray.length; i++) {
			System.out.println(myCarArray[i].model + myCarArray[i].start + myCarArray[i].speed);
		}
		System.out.println("============================================");
		//변경
		for (Car car : myCarArray) {
			System.out.println(car.model + " " +car.start + " " + car.speed);
		}




	}
}