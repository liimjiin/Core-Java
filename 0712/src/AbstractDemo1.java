
public class AbstractDemo1 {
	public static void main(String[] args) {
		Tiger t = new Baby();
		t.dp();
	}

}

abstract class Tiger{ // 재정의를 강제화
	public void print() {
		System.out.println("정상입니다.");
	}
	public abstract void dp();
}
class Baby extends Tiger{
	public void dp() {
		System.out.println("짠");
	}
}
