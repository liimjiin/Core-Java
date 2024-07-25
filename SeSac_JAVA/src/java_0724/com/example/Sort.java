package java_0724.com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    private List<StudentVO> list;

    public Sort(List<StudentVO> list) {
        this.list = list;
    }

    public void quickSorting() {
        Collections.sort(this.list, (o1, o2) -> o2.getTot() - o1.getTot());
    }
}
