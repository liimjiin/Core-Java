import java.util.Scanner;

public class PolymorphisomDemo2 {
	public static void main(String[] args) {
		PolymorphisomDemo2 pd = new PolymorphisomDemo2();
		Mammal m = null;
		for(int i = 0; i < 3; i++) {
				int choice = pd.choose();
				switch(choice) {
				case 1: m = new Dog();
				break;
				case 2: m = new Cat();
				break;
				case 3: m = new American();
				break;
				case 4: m = new Korean();
				break;
			}
			m.sayThing();
		}
	}
	
	int choose() {
		System.out.println("============Menu============");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. American");
		System.out.println("4. Korean");
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 종을 선택하세요.");
		
		return sc.nextInt();
	}
}