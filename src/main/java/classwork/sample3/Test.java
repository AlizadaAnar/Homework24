package classwork.sample3;

import classwork.sample2.FuncInter1;

public class Test {
    public static void main(String[] args) {
        FuncInter1 add = (int a, int b) -> (a + b);

        FuncInter1 mul = (int a, int b) -> (a * b);

        Test tobj = new Test();

        System.out.println("Addition is: " + tobj.operate(3, 6, add));

        System.out.println("Multiplication is: " + tobj.operate(5, 5, mul));

        FuncInter2 fobj = message -> System.out.println("Hello " + message);
        fobj.sayMessage("Anar");



    }

    private int operate(int a, int b, FuncInter1 obj) {
        return obj.operation(a, b);
    }
}
