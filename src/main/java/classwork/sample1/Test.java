package classwork.sample1;


public interface Test {
    public static void main(String[] args) {
        FuncInter2 fobj = (msg) -> System.out.println("Hello " + msg);
        fobj.sayMessage("Printed");
    }
}
