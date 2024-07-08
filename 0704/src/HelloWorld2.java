/*
1. 저장은 퍼블릭 클래스 이름과 동일하게, 
2. 퍼블릭 클래스는 한 개만 존재한다.
3. 한 파일에는 한 클래스만 작성하는 것이 이클립스의 원칙
4. 주석, 패키지, 임포트 외에 다 때려 넣는다??
클래스는 그 하나가 실행의 단위가 된다.
main 함수 : 동작한다, 리턴하지 않음, 외부에서 접근할 수 있어야 하기 때문에 public을 사용, static(공용), 실행 시 메모리에 올라올 때에는 HelloWorld와 상관 없음
클래스 이름은 항상 대문자로 시작
 */

import java.util.Scanner;// 

public class HelloWorld2 { 
	public static void main(String [] args){
//		Scanner sc = new Scanner(System.in);
//	    System.out.print("이름 : ");
//	    String name = sc.nextLine();
//	    System.out.printf("귀하의 이름은 %s 입니다. \n", name)

		System.out.printf("숫자 500 = %d\n", 500);
		System.out.printf("숫자 500 = %o\n", 500);
		System.out.printf("숫자 500 = %x\n", 500);
		
		short a = 5 + 746;// 숫자가 byte와 short에 저장 가능한 이유 : 앞에 무의미한 0은 잘리고 뒤에 유의미한 숫자만 저장되기 때문에
		System.out.println(a);
		
		float f = 0.123456789123456789f;
		double dj = 0.123456789123456789;
		System.out.println(f);
		System.out.println(dj);
		
		System.out.print('A');
		System.out.print('B');
		System.out.print('\n');
		System.out.print('C');
		System.out.print('D');
		System.out.print('\r');
		System.out.println('E');
		
		System.out.println(true);
		System.out.println(false);
		System.out.println(5 == 5);
		
		Scanner sc = new Scanner(System.in); // sc : 8byte
	    String name = "한지민"; // name : 8byte
	    // 8byte가 같은데 왜 데이터 타입을 적어야 할까? 주소 변수는 시작 주소를 저장함, 끝은 모름, 내가 가리키는 곳에 스트링 또는 스캐너를 만들어야함
		
	    /*
	    byte x = 10;
	    byte y = 20;
		byte result1 = x + y; // 이항 연산자는 무조건 int 이상 해야한다.
		
		
		
		short a = 10;
		short b = 20;
		short result2 = a + b; // 이항 연산자는 무조건 int 이상 해야한다.
		short result3 = (short)(x + y); // short로 강제형변환
		*/
		System.out.print(365f/4);
	}

}
