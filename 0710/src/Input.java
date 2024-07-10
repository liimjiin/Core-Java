import java.util.Scanner;

public class Input {
	void input(Student std) { // std = younghee, (Call by ref)
		Scanner sc = new Scanner(System.in);
		System.out.print("학번 : ");
		std.setNo(sc.next());
		System.out.print("국어 : ");
		std.setKor(sc.nextInt());
		System.out.print("영어 : ");
		std.setEng(sc.nextInt());
		System.out.print("수학 : ");
		std.setMath(sc.nextInt());
	};

}
