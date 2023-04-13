public class constructor {
    int a;
    boolean b;

    public constructor() {
        a = 0;
        b = false;
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println("a = " + myObj.a);
        System.out.println("b = " + myObj.b);
    }
}
