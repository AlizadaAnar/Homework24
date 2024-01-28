package classwork.sample2;

public interface Test {
    public static void main(String[] args) {
        FuncInter1 add = (int a, int b) -> a + b;
        FuncInter1 mlt = (int a, int b) -> a * b;
        FuncInter1 div = (int a, int b) -> a / b;
        FuncInter1 sub = (int a, int b) -> a - b;

        int result = add.operation(5, 5);
        System.out.println(result);
    }
}
