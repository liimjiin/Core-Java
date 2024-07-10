
public class EncapDemo {
	public static void main(String[] args) {
		Car sonata = new Car();
		
		System.out.printf("이름 : %s, 가격 : %d", sonata.getName(), sonata.getPrice());
	}
}

class Car{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) { // 자기 자신의 주소
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}