import java.util.*;
public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        int[] m = new int[size];
        for (int i = 0; i < n.length; i++)
            n[i] = sc.nextInt();

        for (int i = 0; i < m.length; i++)
            m[i] = n[m.length - 1 - i];
        System.out.println("Original Array: " + Arrays.toString(n));
        System.out.println("Reversed Array: " + Arrays.toString(m));
    }
}
