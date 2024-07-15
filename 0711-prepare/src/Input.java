import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
	private Scanner sc;
	private Student [] array;
	
	public Input (Student [] array) throws IOException { // 생성자
		this.sc = new Scanner(new java.io.File("sungjuk_utf8.txt"));
		this.array = array;
	}
	
	
//	void studentInput2() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학번을 입력하세요 : ");
//		String no = sc.nextLine();
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.nextLine();
//		System.out.print("국어 점수를 입력하세요 : ");
//		int kor = Integer.parseInt(sc.nextLine());
//		System.out.print("영어 점수를 입력하세요 : ");
//		int eng = Integer.parseInt(sc.nextLine());
//		System.out.print("수학 점수를 입력하세요 : ");
//		int mat = Integer.parseInt(sc.nextLine());
//		System.out.print("뭐야 점수를 입력하세요 : ");
//		int edp = Integer.parseInt(sc.nextLine());
//		Student p = new Student(no, name, kor, eng, mat, edp);
//		System.out.println("학번 : "+p.no);
//		System.out.println("이름 : "+p.name);
//		System.out.println("국어 : "+p.kor);
//		System.out.println("영어 : "+p.eng);
//		System.out.println("수학 : "+p.mat);
//		System.out.println("뭐야 : "+p.edp);
//	}
	
	void studentInput() {
		
		for(int i = 0; i< this.array.length; i++) {
			String line = this.sc.nextLine();
			Scanner s = new Scanner(line).useDelimiter("\\s+");
			
			String no = s.nextLine();
			String name = s.nextLine();
			int kor = Integer.parseInt(s.nextLine());
			int eng = Integer.parseInt(s.nextLine());
			int mat = Integer.parseInt(s.nextLine());
			int edp = Integer.parseInt(s.nextLine());
			this.array[i] = new Student(no, name, kor, eng, mat, edp);
		}
		
	}
	

}
