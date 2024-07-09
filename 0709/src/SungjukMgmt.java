
public class SungjukMgmt {

	public static void main(String[] args) {
		int [][] scores = {
				{67,89,100},
				{77,99,56},
				{100,99,88}
		};
		for(int i = 0; i < scores.length; i++) { // 전체 학생 루프
			int tot = 0;
			for(int j = 0; j < scores[i].length; j++) {
				tot += scores[i][j];
			}
			double avg = tot / 3;
			char grade = (avg >= 90) ? 'A' :
							(avg >= 80) ? 'B' : 
								(avg >= 70) ? 'C' : 
									(avg >= 60) ? 'D' : 'F';
			for(int j = 0; j < scores[i].length; j++) {
				System.out.printf("%5d\t", scores[i][j]);
			}
			System.out.printf("%5d\t%10.1f%5c%n",tot,avg,grade);
		}

	}

}
