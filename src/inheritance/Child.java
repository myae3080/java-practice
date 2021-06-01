package inheritance;

public class Child extends Parent{
    private int privateNum;
    public String nameCard;

    public Child(String name) {
        super(name);
        // cannot directly access to private member variable of Parent class
        // super.name -> compile error
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }
}
