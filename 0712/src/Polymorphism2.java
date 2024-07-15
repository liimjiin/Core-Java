
public class Polymorphism2 {
	// String : 자식
	// Object : 부모
	public static void main(String[] args) {
		String str = "Hello, World";
		Object obj = str;
		if(obj instanceof String) {
			String t = (String)obj;
			System.out.println("ㅇㅇ");
			System.out.println(t);
		}else {
			System.out.println("ㄴㄴ");
		}
		Parent p = new Parent();
		Child jm = new Child();
		p = jm; // 
		p.display(); //  자식
	}
}
class Parent{
	public void display() {
		System.out.println("부모");
	}
}

class Child extends Parent{
	public void display() {
		System.out.println("자식");
	}
}
