package I.right;

public class Cat implements Eatable, Walkable{
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void walk() {
        System.out.println("cat walk");
    }
}
