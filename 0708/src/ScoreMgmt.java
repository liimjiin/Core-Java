import java.util.Scanner;

public class ScoreMgmt {
	public static void main(String[] args) {
		
		//객체 배열 = 주소 배열 
		Student [] array = new Student[2]; // 배열의 크기는 한번 정하면 수정 불가
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			array[i] = new Student(); // 학생 객체 생성
			System.out.print("학번 : ");
			array[i].no = sc.next();
			System.out.print("국어 : ");
			array[i].kor = sc.nextInt();
			System.out.print("영어 : ");
			array[i].eng = sc.nextInt();
			System.out.print("수학 : ");
			array[i].math = sc.nextInt();
			
			array[i].tot = array[i].kor + array[i].eng + array[i].math;
			array[i].avg = array[i].tot / 3.;
			
		}
		for(int i = 0; i < 2; i++) {
			System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%10.1f%n",
					array[i].no, array[i].kor, array[i].eng, array[i].math, 
					array[i].tot, array[i].avg);
		}
	}

}
