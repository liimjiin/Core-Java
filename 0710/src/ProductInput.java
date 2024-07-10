import java.util.Scanner;

public class ProductInput {
	public static void main(String[] args) throws java.io.IOException {
		Product [] pArray = new Product[7];
		
		Scanner sc = new Scanner(new java.io.File("productdata.txt"));
		
		for(int i = 0; i < 7; i++) {
			pArray[i] = new Product();
			String line = sc.nextLine();
			System.out.println(line);
			
			String [] array = line.split("\t+");
			pArray[i].setName(array[0].trim());
			pArray[i].setCount(Integer.parseInt(array[1].trim()));
			pArray[i].setSell(Integer.parseInt(array[2].trim()));
			pArray[i].setPrice(Integer.parseInt(array[3].trim()));
			pArray[i].setDelivery(Integer.parseInt(array[4].trim()));
			
			for(pArray)
			
		}
	}

}
