
public class OverrideDemo {
	public static void main(String[] args) {
		Base parent = new Derived();
		Object obj = new String("Hello, World");
		
	}

}
class Base{
	public void display() {
		System.out.println("나는 부모 메소드");
	}
}
class Derived extends Base{
	@Override
	public void display() {
		System.out.println("나는 자식 메소드");
	}
}

