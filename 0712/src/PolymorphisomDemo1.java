
public class PolymorphisomDemo1 {
	public static void main(String[] args) {
		int su = 5;
		long lo = su; // 자동 형변환 (implicit conversion, promotion)
		double avg = su;
		short sh = (short)avg; // 강제 형변환 (explicit conversion, demotion)
		
		Test t = new Test();
		Demo d = new Demo();
		t = d;
		if(t instanceof Demo) {
			d = (Demo)t; // 부모 -> 자식으로 자동 형변환 불가
			System.out.println("형변환 완료");
			// 객체끼리 형변환 안됨, 형변환 되기 위해서는 부모 자식의 관계가 되어야 함
		}else {
			System.out.println("ㄴㄴㄴ");
		}
	}
}

class Test{} // 부모
class Demo extends Test{} // 자식
