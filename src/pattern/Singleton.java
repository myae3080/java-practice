package pattern;

public class Singleton {
    public static void main(String[] args) {
        Example example1 = Example.getInstance();
        Example example2 = Example.getInstance();

        System.out.println(example1 == example2);
    }
}