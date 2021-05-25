package binary;

public class BinaryTest {
    public static void main(String[] args) {
        // decimal
        int num = 17;
        // binary
        int bNum = 0B10001;
        // octal
        int oNum = 021;
        // hexadecimal
        int xNum = 0X11;

        System.out.println("num = " + num);
        System.out.println("bNum = " + bNum);
        System.out.println("oNum = " + oNum);
        System.out.println("xNum = " + xNum);
    }
}
