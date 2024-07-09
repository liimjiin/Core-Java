
public class HelloWorld1 {
	
	// 동일 클래스에 있는 static 변수는 클래스 이름을 생략할 수 있다.
	
	static String str2 = "Hello, World"; // class, static variable : 클래스 변수 : 클래스 이름으로 접근.

	public static void main(String[] args) {
		String str1 = "Hello, World"; // local, stack, temporary, auto variable -> 지역변수 : 초기화 필요, 사용 후 알아서 소멸
		System.out.println(str2); 
		System.out.println(Demo.str); 
	}

}
class Demo{
	static String str = "아오 졸려"; // class, static variable
}
