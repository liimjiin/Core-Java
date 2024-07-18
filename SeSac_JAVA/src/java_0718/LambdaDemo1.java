package java_0718;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // myInterface 자식 만들어 활용
        int c = 5;
        int d = 10;
        child ch = new child();
        int result1 = ch.add(c, d);
        System.out.println(result1);

        // anonymous
        MyInterface mi = new MyInterface() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        int result2 = mi.add(c, d);
        System.out.println(result2);

        /* Lambda Expression
            순서 (anonymous 생성 후 아래 순서대로)
            - 객체의 생성 부분 삭제
            - Override annotation 삭제
            - 접근지정자, 리턴타입, 메소드 이름 삭제
            - 파라미터 타입 삭제 → 타입 추론이 가능하다면 파라미터 타입 삭제 가능, 추론이 불가하면 모두 명시해야함
            - 메소드 바디의 return 삭제
            - 메소드 () 뒤에 오는 {} 삭제 → 구현부의 문장이 한 개인 경우
            - 메소드의 파라미터 선언부 괄호 뒤와 {} 사이였던 부분을 ‘→’로 표기
        * */
        MyInterface mi1 = (a, b) -> a + b; // 매개 변수와 return 타입으로만 작성 가능
        int result3 = mi.add(c, d);
        System.out.println(result2);
    }
}

interface MyInterface{
    int add(int a, int b);
}

class child implements  MyInterface{

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
