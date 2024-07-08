
public class VariableDemo {
	
	// VariableDemo의 유일한 멤버 변수 eng
	int eng = 100; // instance variable 인스턴스 변수, 사용하려면 객체를 만들어야 함
	static int math = 80; // class variable 클래스 변수 -> 가장 먼저 생성, 변수 앞에 클래스명을 작성

	public static void main(String[] args) {
		int kor = 90; // local variable 지역변수 -> 메인이 실행 될 때
		System.out.printf("수학점수 = %d\n", math);
		System.out.printf("국어점수 = %d\n", kor);
//		System.out.printf("영어점수 = %d\n", eng); // -> 에러 : 스태틱 아니어서 못함

		int kor2; // local variable 지역변수 -> 메인이 실행 될 때
//		System.out.printf("국어점수2 = %d\n", kor2); // 에러 : 지역변수 초기화 필요!
		
		VariableDemo vd = new VariableDemo(); // 객체 생성
		System.out.printf("영어점수 = %d\n", vd.eng); // 주소 vd를 통해 접근

		System.out.printf("수학2점수 = %d\n", Demo.math);
		
		Demo d = new Demo(); // 객체 생성!
		System.out.printf("영어2점수 = %d\n", d.eng);
	}

}

class Demo{
	
	static int math = 70; // class variable
	int eng = 50; // local variable -> 객체를 생성해야 호출 가능
}
