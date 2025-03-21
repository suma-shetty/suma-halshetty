import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scan.next();
        System.out.println("Enter Email ID:");
        String email = scan.next();
        System.out.println("Enter Age:");
        int age = scan.nextInt();
        System.out.println("Enter percentage:");
        double percentage = scan.nextDouble();
        System.out.println(name+ " " + email + " " + age + " " + percentage);
    }
}
