import java.util.Scanner;

public class SungjukMgmt {

	public static void main(String[] args) {
		Student younghee = new Student();
		SungjukMgmt d = new SungjukMgmt();
		
		new Input().input(younghee);
		new Calc().calc(younghee);
		younghee.print();
		System.out.println(younghee.toString());
//		new Output().output(younghee);
	}
}
