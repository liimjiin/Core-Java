
public class PolymorphismDemo3 {
	public static void main(String[] args) {
//		Dog [] array = new Dog[3];
//		array[0] = new Cat(); // 불가
		Mammal [] mArray = new Mammal[4];
		mArray[0] = new Dog();
		mArray[1] = new Cat();
		mArray[2] = new American();
		mArray[3] = new Korean();
		
		for(Mammal m : mArray) {
			m.sayThing();
		}
	}
}
