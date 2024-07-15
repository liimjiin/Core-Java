
public class Student {
	String no;
	String name;
	int kor;
	int eng;
	int mat;
	int edp;
	int tot;
	double avg;
	char grade;
	
//	@Override
//	public String toString() {
//		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", edp="
//				+ edp + ", tot=" + tot + ", avg=" + avg + ", grade=" + grade + "]";
//	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%5.2f\t%c%n",
				this.no, this.name, this.kor, this.eng, this.mat, this.edp, this.tot, this.avg, this.grade);
	} 
	
	

	public Student(String no, String name, int kor, int eng, int mat, int edp) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

}
