
public class MethodDemo3 {
	public static void main(String[] args) {
		
		MethodDemo3 md = new MethodDemo3();
		Product ballpen = new Product();
		ballpen.price = 100;
		System.out.println("before : " + ballpen.price);
		md.change(ballpen);
		System.out.println("after : " + ballpen.price);
//		int original = 100;
//		md.print(original); // Call by Value
//		System.out.println("original = " + original);
	}
	
//	void print(int target){
//		System.out.println("target = " + target);
//		target = 50000;
//		System.out.println("target = " + target);
//	}
	void change(Product pencil) { // pencil = ballpen
		pencil.price = 50000;
	}
}
class Product{
	int price;
}
