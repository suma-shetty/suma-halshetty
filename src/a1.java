import java.util.*;
public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int[] m = new int[size];
        System.out.println("Enter the elements of an array:");
        for(int i = 0; i < m.length; i++)
            m[i] = sc.nextInt();
       int sum = 0;
        for(int i = 0; i < m.length; i++)
            sum = sum + m[i];
            System.out.println("Array to String: " + Arrays.toString(m));
            System.out.println("Sum: " + sum);
        }
    }

