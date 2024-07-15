
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Frog f = new Frog();
		f.weight = 5;
//		f.name; -> private 변수이기 때문에 접근 불가
	}

}
class 양서류{
	private String name;
	int weight;
}
class Frog extends 양서류{
	
}