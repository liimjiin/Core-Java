
public class HelloWorld3 {
	
	// 다른 클래스에 있는 static 변수는 속해있는 클래스 이름으로 접근한다.
	
	public static void main(String[] args) {
		System.out.println(Demo2.str); 
	}
}
class Demo2{
	static String str = "아오 졸려"; // class, static variable
}
