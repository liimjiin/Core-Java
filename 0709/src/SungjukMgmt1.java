import java.util.Scanner;

public class SungjukMgmt1 {
	public static void main(String[] args)throws java.io.IOException {
		Student [] stdArray = new Student[3]; // 학생들의  정보가 저장될 공간
		
		// 표준 입력이 아닌 파일로부터 데이터를 읽음
		Scanner sc = new Scanner(new java.io.File("sungjuk.dat"));
		
		for(int i = 0; i < 3; i++) {
			stdArray[i] = new Student(); // 여기서 학생 생성 (주소 생성)
			String line = sc.nextLine(); 
			// Parsing : 분석하다 
			String[] array = line.split("\t+");
			stdArray[i].no = array[0].trim(); // 학번
			stdArray[i].name = array[1].trim(); // 이름
			stdArray[i].kor = Integer.parseInt(array[2].trim()); // 국어
			stdArray[i].eng = Integer.parseInt(array[3].trim()); // 영어
			stdArray[i].math = Integer.parseInt(array[4].trim()); // 수학
		}
		int j = 0;
		while(j < 3) {
			System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d\t%n",
					stdArray[j].no, stdArray[j].name, stdArray[j].kor,
					stdArray[j].eng, stdArray[j].math);
			j++;
		}

	}

}
