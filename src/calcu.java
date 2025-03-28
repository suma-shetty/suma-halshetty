import java.util.Scanner;
public class calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        Mycalculator mc = new Mycalculator();
        mc.add(a,b);
        mc.sub(a,b);
        mc.mul(a,b);
        mc.div(a,b);
    }
}

interface Calculator {
    public abstract void add(int a, int b); // in this case by default public abstract is already there
    public abstract void sub(int a, int b);
}
interface calci {
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}
class Mycalculator implements Calculator {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Sub: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Mul: " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("div: " + (a / b));
    }
}


