
public class InitializationBlock {
	private double weight; // member variable
	private char grade;
	
	{// InitializationBlock 이름이 없어서 바꾸지 못함, 자동으로 적용
		this.weight = 100.0;
		this.grade = 'F';
	}
	
	public InitializationBlock() { // default constructor's overriding
		this.weight = 62.4;
		this.grade = 'C';
	}
	public static void main(String[] args) {
		InitializationBlock jm = new InitializationBlock();
		System.out.println(jm.weight);
		System.out.println(jm.grade);
	}
	// 직접 초기화, 생성자를 통해 초기화, 블록을 통해 초기화(생성자 초기화보다 먼저 세팅)
	

}
