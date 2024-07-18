package java_0718_ProductMgmt.src.com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
    private List<Product> list; // 넘어온 애를 받는 애
    private Scanner sc;
    private File file;


    public Input(List<Product> list) {
        this.list = list;
        this.file = new File("D:\\Workspace\\SeSac_JAVA\\src\\java_0718_ProductMgmt\\productdata.txt");
        try{
            this.sc = new Scanner(this.file);
        }catch (FileNotFoundException f){
            System.out.println("파일을 찾을 수 없습니다.");
            System.exit(0);
        }
    }

    public void fileInput() {
        while (this.sc.hasNextLine()){ // 파일이 몇개인지 모르기 때문에 while, sc로 읽은 파일의 다음 줄이 없을 때까지
            String line = this.sc.nextLine();
            /*
            pasing
            1. String's split()
            2. Scanner's useDelemeter()
            3. StringTokenizer
             */
            Scanner scLine = new Scanner(line).useDelimiter("\\s+");
            Product p = new Product(scLine.next(), scLine.nextInt(), scLine.nextInt(),
                                    scLine.nextInt(), scLine.nextInt()); // 제품 만들기
            this.list.add(p);
        }
    }
}
