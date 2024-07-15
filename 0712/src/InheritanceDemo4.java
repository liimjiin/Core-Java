
public class InheritanceDemo4 {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("ef", 3_000_000);
		
	}
}

class Car{
	String name;
	int price;
	
//	public Car() {}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
class Sonata extends Car{
	public Sonata(String name, int price) {
		super(name, price);
		System.out.println("소나타 생성자");
	}
}

