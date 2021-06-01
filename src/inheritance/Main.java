package inheritance;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("test");
        Child child = new Child("test2");

        parent = child;

        ((Child) parent).setNameCard("Dev");

        System.out.println(child.nameCard);
        System.out.println(child.getName());
        System.out.println(((Child) parent).nameCard);
        System.out.println(((Child) parent).getName());
    }
}
