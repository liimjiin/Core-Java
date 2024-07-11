import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Scanner sc;
	private Student [] array;
	
	public Input(Student [] array) throws FileNotFoundException {
		this.sc = new Scanner(new java.io.File("sungjuk_utf8.txt"));
		this.array = array;
	}
	void input() {
		for(int i = 0 ; i < this.array.length; i++) {
			
			String line = this.sc.nextLine();
			//문자열 파싱 => String [] = String 클래스의 split(정규식)
			Scanner s = new Scanner(line).useDelimiter("\\s+"); // scanner 파싱
			
			String id = s.next();
			String name = s.next();
			int kor = s.nextInt();
			int eng = s.nextInt();
			int mat = s.nextInt();
			int edp = s.nextInt();
			this.array[i] = new Student(id, name, kor, eng, mat, edp);
		}
	}

}
