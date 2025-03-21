public class animal {
    public static void main(String[] args) {

    }

}


abstract class ani {
    public  abstract void eat();
    public abstract void sleep();
}
class Herbivore extends ani  {
    public void eat() {
        System.out.println();
    }
    public void sleep() {

    }
}
class Cow extends Herbivore {
    public void eat() {
        System.out.println("eat non-veg");
    }
    public void sleep() {
        System.out.println("sleeping");
    }
}

