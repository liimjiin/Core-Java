
public class ConstructorDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car(); // new Car가 초기화 시킴
		System.out.println(sonata.name2); // null
		System.out.println(sonata.price2); // 0
		
		Product p = new Product(); // Product 클래스에 생성자를 명시해놓아서 불가
		Product pencil = new Product("모나미", 2000, "모나미회사");
		Product computer = new Product("노트북", 2_000_000, "LG");
		Product tv = new Product("tv", 3_000_000, "samsung");
	}

}
