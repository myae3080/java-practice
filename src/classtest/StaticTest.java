package classtest;

public class StaticTest {
    public static void main(String[] args) {
        Test.printMethod("Hello World!");

        Test test = new Test();

        test.printMethod("Hello Wooooorld!");
    }
}
