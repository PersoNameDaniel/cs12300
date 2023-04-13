public class mySwap3Numbers {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int tempa = a;
        int tempb = b;
        int tempc = c;

        System.out.printf("Three numbers before swap: %d, %d, %d\n", a, b, c);

        a = tempc;
        b = tempa;
        c = tempb;

        System.out.printf("Three numbers after swap: %d, %d, %d\n", a, b, c);
    }
}