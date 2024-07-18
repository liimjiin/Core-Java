package java_0718_ProductMgmt.src.com.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    private List<Product> list; // 이미 계산이 끝난 list

    public Sort(List<Product> list) {
        this.list = list;
    }

    public void quickSort() {
        Collections.sort(this.list, new Comparator<Product>(){

            // new Comparator<Product>() 사용 방법 : 자식 클래스, anonymous 사용

            @Override
            public int compare(Product front, Product back) {  // 앞 - 뒤 : 오름차순, 뒤 - 앞 : 내림차순
                return back.getBenefit() - front.getBenefit();
            }
        });
    }
}
