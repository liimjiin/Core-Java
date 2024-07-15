
public class EmployeeMgmt {
	public static void main(String[] args) {
		Employee [] array = new Employee[5];
		String[] data = new String[5];
		
		Input input = new Input(array,data);
		input.input();
		
		Calc calc = new Calc(array);
		calc.calc();
		
		Output output = new Output(array,data);
		output.output();
	}
}
