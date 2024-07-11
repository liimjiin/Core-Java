
public class Car {
	private String name;
	private int price;
	
	String name2;
	int price2;
	
	/* 기본 생성자가 하는 일 : 자동으로 기본 초기값 설정 
	public Car() {
		this.name = null;
		this.price = 0;
	}
	*/
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
//	==========================================
			
	public void setPrice(int price) {
		this.price = price; // 나의 price = 매개변수의 price
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	public void setPrice(int price) {
//	price = price; // 멤버변수와 파라미터의 이름이 같아 컴파일러가 구분을 하지 못함
//	}
//	public void setName(String name) {
//		name = name;
//	}
	
	public Car clone() { // 자동차 복제 (주소 복사)
		return this; // 자기 집 주소를 넘기는 것
	}
}
