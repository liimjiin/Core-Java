
public class CallbyRefDemo1 {

	public static void main(String[] args) {
		CallbyRefDemo1 d = new CallbyRefDemo1();
		int money = 1000;
		String name = "한지민";
		System.out.printf("Before money = %d, name = %s%n", money, name);
		d.change(money, name);
		System.out.printf("After money = %d, name = %s%n", money, name);
	}
	void change(int su, String str) { // Call by Value : java에서 String은 불변
		su *= 5;
		str = "김지민";
		System.out.printf("In change = %d, name = %s%n", su, str);
	}
	

}
