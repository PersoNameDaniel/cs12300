public class mySwapNoTemp {
    public static void main (String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.printf("Numbers before swap: %d, %d, %d\n", num1, num2, num3);

        num1 = num1+ num2+ num3;
        num2 = num1- (num2 + num3);
        num3 = num1- (num2+ num3);
        num1 = num1- (num2 num3);

        System.out.printf("Numbers after swap: %d, %d, %d\n", num1, num2, num3);        

    }
}