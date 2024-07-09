
public class ArrayDemo4 {
	public static void main(String[] args) {
		double [] array = {3.14, 89.5, 182.5, 69.2};
		
		for(int i = 0 ; i < array.length; i++) {
			System.out.printf("%.2f%n",array[i]);
		}
		
		// Enhanced For : 반복 대상의 처음부터 끝까지
		for (double aaa : array) {
			System.out.println(aaa);
		}
				
		}
	

}
