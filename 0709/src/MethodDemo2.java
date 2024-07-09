
public class MethodDemo2 {
	public static void main(String[] args) {
		
		MethodDemo2 md = new MethodDemo2();
		md.sum(50,480);
		md.sum(3,40);
	}
	
	void sum(int start, int end){
		int sum = 0;
		for(int i= start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + "부터" + end + "까지의 합 : " + sum);
	}
}
