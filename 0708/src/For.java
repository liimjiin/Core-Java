
public class For {

	public static void main(String[] args) {
		int count = 0;
		int line = 1;
		
		for(int i = 65; i <= 90; i++) {
			if(line % 2 == 0)System.out.print((char)(i+32));
			else System.out.print((char)(i));
			count++;
			if(count%5 == 0) {
				System.out.println();
				line++;
			}
		}
	}
}