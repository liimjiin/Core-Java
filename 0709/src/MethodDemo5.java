
public class MethodDemo5 {
	public static void main(String[] args) {
		
		MethodDemo5 md = new MethodDemo5();
		System.out.println(md.sum(50, 80));
		int result = md.sum(2, 40);
		System.out.println(result);
	}
	
	int sum(int start, int end){
		int sum = 0;
		for(int i= start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}
