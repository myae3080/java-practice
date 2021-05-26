package character;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println("ch1 = " + ch1);
        System.out.println("(int)ch1 = " + (int)ch1);

        char ch2 = 68;
        System.out.println("ch2 = " + ch2);

        int ch3 = 72;
        System.out.println("(char)ch3 = " + (char)ch3);

        // unicode
        char unicode1 = '꿀';
        char unicode2 = '\uAFC0';

        System.out.println("unicode1 = " + unicode1);
        System.out.println("unicode2 = " + unicode2);
    }
}
