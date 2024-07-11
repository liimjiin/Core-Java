import java.io.IOException;
import java.util.Scanner;

public class ProductMgmt {
	public static void main(String[] args) throws IOException {
		Product [] pArray = new Product[7];
		
		new ProductInput().input(pArray);
		new ProductCalc().calc(pArray);
		new ProductOutput().output(pArray);
		
		
	}

}
