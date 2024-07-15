
public class HelloWorld6 {
	// 동일 클래스의 멤버 메소드는 해당 클래스를 생성하고 주소로 접근할 수 있다.
	public static void main(String[] args) {
		HelloWorld6 h = new HelloWorld6();
		h.print();
		new HelloWorld6().print();
	}
	void print() { // member, instance method
		System.out.println("Hello, World");
	}
}
