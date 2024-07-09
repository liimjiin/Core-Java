
public class ArrayDemo3 {
	public static void main(String[] array) {
		int [][] array1; // 2차원 배열 선언
		int [] array2 []; // 2차원 배열 선언
		
		// 2차원 배열 생성
		array1 = new int [4][3]; // 4행 3열, 48byte, Rectangular Array
		array2 = new int [4][]; // // 열의 갯수가 달라질 수 있음, Ragged(Jagged) Array
		
		array1[0][0] = 5; // 할당
		int [][] array3= {
					{1,2,3},
					{4,5,6},
					{7,8,9,},
					{10,11,12}
		};
		
		int [][] array4;
		array4 = new int[4][3];
		array4[0] = new int [] {1,2,3};
		array4[1] = new int [] {4,5,6};
		array4[2] = new int [] {7,8,9};
		array4[3] = new int [] {10,11,12};
		
		int [][] array5;
		array5 = new int [4][];
		array5[0] = new int[] {1,2,3,4};
		array5[1] = new int[] {5,6};
		array5[2] = new int[] {7};
		array5[3] = new int[] {8,9,10};
		
		System.out.println(array5.length); // 4
		System.out.println(array5[2].length); // 4
		
		// 층 = i, 열 = j
		for(int i = 0; i < array5.length; i++) {
			for(int j = 0; j < array5[i].length; j++) {
				System.out.printf("arry[%d][%d] = %d\t", i, j, array5[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
