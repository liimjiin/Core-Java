package java_0716;

public class ExceptionDemo4 {
    public static void main(String[] args) throws KoreanException {
        Student s = new Student();
        s.setKor(90);
        try {
            s.setHistory(101);

        }catch (HistoryException e){
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }
}

class HistoryException extends Exception{ // Checked Exception
    public HistoryException(String msg){
        super(msg);
    }
}

class KoreanException extends Exception{ // Unchecked Exception
    public KoreanException(String msg){ // 생성자
        super(msg);
    }
}

class Student{

    private int kor;

    public void setHistory(int his) throws HistoryException {
        if (his >= 0 && his <= 100) {
        }else throw new HistoryException("역사점수는 0부터 100까지 입니다. 다시 입력해주세요");
    }

    public void setKor(int kor) throws KoreanException{
        if (kor >= 0 && kor <= 100) {
            this.kor =kor;
        }else throw new KoreanException("국어점수는 0부터 100까지 입니다. 다시 입력해주세요");
    }

    @Override
    public String toString(){
        return "kor = " + this.kor;
    }

}