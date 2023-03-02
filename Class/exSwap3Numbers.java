public class mySwap3Numbers {
    public static void main (String[] args) {
        
        int num1 = 10
        int num2 = 20
        int num3 = 30
        int temp;

        System.out.printf("Three numbers before swap: %d, %d, %d\n", num1, num2, num3);

        temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;

        System.out.printf("Three numbers after swap: %d, %d, %d\n", num1, num2, num3);
    }
}