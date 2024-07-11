import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProductInput {
	void input(Product[] pArray) throws IOException {
		
		Scanner sc = new Scanner(new java.io.File("productdata.txt"));
		
		for(int i = 0; i < pArray.length; i++) {
			String line = sc.nextLine();
//			System.out.println(line);
			String [] array = line.split("\t+");
//			System.out.println(Arrays.toString(array));
			pArray[i] = new Product();
			pArray[i].setName(array[0].trim());
			pArray[i].setCount(Integer.parseInt(array[1].trim()));
			pArray[i].setSell(Integer.parseInt(array[2].trim()));
			pArray[i].setPrice(Integer.parseInt(array[3].trim()));
			pArray[i].setDelivery(Integer.parseInt(array[4].trim()));
			}
		}
	}

