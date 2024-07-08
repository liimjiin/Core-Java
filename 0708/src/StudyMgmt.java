import java.util.Scanner;

public class StudyMgmt { // Student 클래스가 없으면 작동하지 않음 (Student 클래스에 종속)
	
	// 학생 클래스를 사용
	public static void main(String[] args) {
		Student chulsu = new Student(); // chulsu = 8byte
		Scanner sc = new Scanner(System.in);
		String y_n = null;
			do {
			System.out.print("학번 : ");
			chulsu.no = sc.next(); // 입력 받은 값을 철수의 학번 방으로 배달
			System.out.print("국어 : ");
			chulsu.kor = sc.nextInt();
			System.out.print("영어 : ");
			chulsu.eng = sc.nextInt();
			System.out.print("수학 : ");
			chulsu.math = sc.nextInt();
			
			chulsu.tot = chulsu.kor + chulsu.eng + chulsu.math;
			chulsu.avg = chulsu.tot / (double)3;
			
			chulsu.grade = '\0'; // null
			
			switch((int)(chulsu.avg/10)) {
			case 10: case 9: chulsu.grade = 'A';
			break;
			case 8: chulsu.grade = 'B';
			break;
			case 7: chulsu.grade = 'C';
			break;
			case 6: chulsu.grade = 'D';
			break;
			default: chulsu.grade = 'F';
			
			}
			System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%.1f\t%3c%n", 
					chulsu.no, chulsu.kor, chulsu.eng, chulsu.math, 
					chulsu.tot, chulsu.avg, chulsu.grade);
			System.out.println("Again? (y/n)");
			y_n = sc.next();
			}while(y_n.equals("y") || y_n.equals("Y"));
			System.out.println("Program is over.");
	}

}
