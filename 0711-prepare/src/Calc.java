
public class Calc {
	private Student [] array;
	
	public Calc(Student [] array){
		this.array = array;
	}

	void studentCalc() {
		for(Student std : this.array) {
			int tot = std.kor + std.eng + std.mat + std.edp;
			double avg = tot / 4.;
			char grade = (avg >= 90) ? 'A' : 
							(avg >= 80) ? 'B' :
								(avg >= 70) ? 'C' : 
									(avg >= 60) ? 'D' : 'F';
			std.setAvg(avg);
			std.setTot(tot);
			std.setGrade(grade);
		}
	}

}
