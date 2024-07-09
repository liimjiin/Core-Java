
public class HelloWorld2 {
	
	// 동일 클래스에 있는 멤버 변수는 반드시 해당 클래스를 생성해서 그 주소로 접근해야한다.
	
	String str = "Hello, World"; // member, instance variable

	public static void main(String[] args) {
		HelloWorld2 hw = new HelloWorld2();
		System.out.println(hw.str);
	}
}
