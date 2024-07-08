import java.util.Scanner;

public class OpDemo {

	public static void main(String[] args) {

//		short su = ~5;
//		short result = ~su; // Type mismatch: cannot convert from int to short (int -> short로 convert 안됨), +. -, ~의 결과는 int
		
//		short result = true ? 1970 : 3.14; // 삼항연산자는 조건보다 참과 거짓의 값을 먼저 비교한다. (중요)
		
		/*
		 * nextInt로 값을 받기, 
		 * 예)3601 -> 시,분,초로 출력하기
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력해주세요 : ");
		int time = sc.nextInt();
		
		int hour = time/3600;
		int min = (time%3600)/60;
		int sec = (time%3600)%60;
		
		System.out.print(hour + "시 " + min + "분 " + sec + "초" + "입니다.");
		
		
	}
}
