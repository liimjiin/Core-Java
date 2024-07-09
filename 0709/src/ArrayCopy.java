
public class ArrayCopy {
	// 배열 값 복사
	// 주소 복사
	public static void main(String[] args) {
		
	// 배열 주소 복사
	int [] original = {3, 4, 5};
	int [] target = original;
	
	// 배열 값 복사
	int [] original1 = {3,4,5};
	int [] target1 = new int[10];
	System.arraycopy(original1, 0, target1, 9, 3); // 배열 값 복사
	
	
	}
}
