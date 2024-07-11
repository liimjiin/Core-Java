import java.io.IOException;

public class GradeManager {
	public static void main(String[] args) throws IOException {
		Student[] array = new Student[12];
		Input input = new Input(array);
		input.input();
		
		Calculator calculator = new Calculator(array);
		calculator.calc();
		
		Output output = new Output(array);
		output.output();
		
		System.out.println("Program is over");
		
	}

}
