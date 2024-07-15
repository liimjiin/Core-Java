
public class Output {
	private Student [] array;
	
	public Output(Student [] array) {
		this.array = array;
	}

	void studentOutput() {
		System.out.println("============================성적 관리 프로그램============================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t뭐야\t총점\t평균\t등급");
		System.out.println("=====================================================================");
		
		for(Student std : array) {
			System.out.println(std);
//			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%5.2f\t%c%n",
//					std.getNo(), std.getName(), std.getKor(), std.getEng(),
//					std.getMat(), std.getEdp(), std.getTot(), std.getAvg(), std.getGrade());
		}
	}

}
