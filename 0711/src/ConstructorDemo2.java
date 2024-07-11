
public class ConstructorDemo2 {
	public static void main(String[] args) {
		MyDate birthday = new MyDate();
		System.out.println(birthday.day);
	}

}
class MyDate{
	int year, month, day;
	
	public MyDate() { // default contructor's overriding
		this.year = 2024;
		this.month = 7;
		this.day = 11;
	}
}
