import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int add = 0;
        for(int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                add = add + i;
            }
        }
            System.out.println("Tha sum of all square numbers are " + add);
    }
}
