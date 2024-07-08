import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// A ~ Z까지 출력하기 -> 시작과 끝이 명확하기 때문에 for문을 사용
		for(int i = 65 ; i <= 90 ; i++) {
			if(i%5 == 0) {
				System.out.println();
			}
			System.out.printf("%c\t", (char)i);
		}
		System.out.println();
	
	
	//1~100까지 4의 배수는 몇개?
	int count = 0;
	for(int f = 4 ; f <= 100 ; f++) {
		if(f%4 == 0) {
			count += 1;
			}
		}
	System.out.println(count);
	
	// 윤년의 조건 : 400년마다 윤년, 년도를 4로 나누어 딱 떨어지면서 100으로 나누어서 딱 떨어지지 말아야한다.
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Year : ");
	  int year = sc.nextInt();
	  
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
	}
	
	
}


