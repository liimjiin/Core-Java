package java_0718_ProductMgmt.src.com.example;

import java.util.List;

public class Output {
    private List<Product> list;

    public Output(List<Product> list) {
        this.list = list;
    }

    public void print() {
        labelPrint();
        for(Product p : this.list){
            System.out.println(p); // p.toString 호출
        }
    }
    private void labelPrint(){ // 외부에서 호출 할 일이 없기 때문에 private
        System.out.println("                     <제품관리 프로그램>                         ");
        System.out.println("===============================================================");
        System.out.println("\t 제품명\t  수량\t  판매단가\t매입단가\t운송료\t이익금\t이익율");
        System.out.println("===============================================================");
    }
}
