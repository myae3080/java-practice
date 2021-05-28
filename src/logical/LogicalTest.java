package logical;

public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 3;

        boolean bool1 = ((num1 += 1) < 2) && ((num2 += 10) < 10);

        System.out.println(bool1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        boolean bool2 = ((num1 += 1) < 5) || ((num2 += 10) < 10);

        System.out.println(bool2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        boolean bool3 = ((num1 += 1) < 4) || ((num2 += 10) < 10);

        System.out.println(bool3);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
