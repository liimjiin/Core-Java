import java.io.IOException;

public class StudentMgmt {
	public static void main(String[] args) throws IOException {
		Student [] stdArray= new Student[12];
		
		Input input = new Input(stdArray);
		input.studentInput();
		
		Calc calc = new Calc(stdArray);
		calc.studentCalc();
		
		Output output = new Output(stdArray);
		output.studentOutput();
	}

}
