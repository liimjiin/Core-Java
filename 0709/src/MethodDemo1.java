
public class MethodDemo1 {
	public static void main(String[] args) {
		
		MethodDemo1 md = new MethodDemo1();
		md.sum();
	}
	
	void sum(){
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100합 : " + sum);
	}
}
