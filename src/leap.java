import java.util.Scanner;
public class leap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0)) {
            System.out.println(n + " Numbers is a leap Year");
        }
        else {
            System.out.println(n + " Numbers is not a leap Year");
        }

    }
}
