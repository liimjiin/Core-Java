import java.util.Scanner;

public class VarilableDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		String kor = sc.nextLine();
		int kor2 = Integer.parseInt(kor);
		System.out.print("수학 점수 : ");
		String math = sc.nextLine();
		int math2 = Integer.parseInt(math);

		System.out.println(kor2 + math2);

		

	}

}
