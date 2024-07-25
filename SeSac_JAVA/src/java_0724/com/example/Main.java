package java_0724.com.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        List<StudentVO> list = new ArrayList<StudentVO>();
        Input input = new Input(list);
        input.input();
        Calc calc = new Calc(list);
        calc.calc();
        Output output = new Output(list);
        output.output();
//        Sort sort = new Sort(list);
//        sort.quickSorting();
        System.out.println("Program is over...");
    }
}