
public class ArrayDemo {
	public static void main(String[] args) {
		int[] age; // declaration 선언
		age = new int[4]; // creation new 연산자를 이용해 힙에 공간을 확보해야 함
		age[0] = 6;
		age[1] = 7;
		age[2] = 8;
		age[3] = 9; // assignment 할당
		
		char [] array = {'a','b','c','d'}; // initialization 
		
		char [] charArray = null;
		charArray = new char[] {'a','b','c','d'}; // initialization
		
		String [] strArray = {"Hello", "World", "Good", "Java", "A"};
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("strArray[" + i + "]=" + strArray[i]);
			
		}
		
		int [] intArray = {5, 6, 7, 8};
		for(int i = 0; i < 4; i++) {
			System.out.print("intArray[ "+ i + "]= " + intArray[i] + "\t");
		}
		System.out.println();
		
	}

}
