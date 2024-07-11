
public class Calculator {
	private Student [] array; // field
	
	public Calculator(Student[] array) {
		this.array = array;
	}
	void calc() {
		for(Student std : this.array) {// Student std : this.array(반복 대상)
			int tot = std.getKor() + std.getEng() + std.getMat()+std.getEdp();
			double avg = tot / 4.;
			char grade = (avg >= 90) ? 'A' : 
						  (avg >= 80) ? 'B' : 
							 (avg >= 70) ? 'C' : 
								 (avg >= 60) ? 'D' : 'F';
			std.setTot(tot);
			std.setAvg(avg);
			std.setGrade(grade);
		}
	}

}
