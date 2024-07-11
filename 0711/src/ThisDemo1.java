
public class ThisDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.setName("소나타");
		sonata.setPrice(20_000_000);
		System.out.println(sonata.getName() + sonata.getPrice());
		
		Car matiz = sonata.clone(); // 주소
		System.out.println("마티즈 이름 : " + matiz.getName());
		
		int r = Math.round(3);
	}
}
