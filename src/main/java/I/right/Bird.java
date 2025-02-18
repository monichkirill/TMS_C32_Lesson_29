package I.right;

public class Bird implements Flyable, Walkable, Eatable {
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }

    @Override
    public void walk() {
        System.out.println("Bird walking");
    }

    @Override
    public void eat() {
        System.out.println("Bird eating");
    }
}
