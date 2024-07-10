
public class VariableArgumentDemo {
	/*
	public static void main(String[] args) {
		VariableArgumentDemo vad = new VariableArgumentDemo();
		int a = 5;
		int b = 10;
		int c = 100;
		vad.change(a, b, c); // argument : 인자(인수)
	}
//	void change(int a, int b, int c) { // parameter : 매개변수
	void change(int ... a ) { // 배열로 받음, 가변
		for(int su : a) {
			System.out.println(su);
		}
	}*/
	
	public static void main(String[] args) {
		VariableArgumentDemo vad = new VariableArgumentDemo();
		int a = 5; 
		char b = 'B';
		boolean c = true;
		vad.change(a,b,c);
	}
		void change(Object ... A) { // Object : 모든 객체의 조상
//			for(Object su : A) {
//				System.out.println(su);
//			}
			
		}
}

