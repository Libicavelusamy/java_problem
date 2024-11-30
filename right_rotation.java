import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int r = sc.nextInt();

        // Optimize the number of rotations
        r = r % n;
        
        // Use an auxiliary array to store the result
        int[] rotated = new int[n];
        
        // Fill the rotated array with elements in their new positions
        for (int i = 0; i < n; i++) {
            rotated[(i + r) % n] = a[i];
        }
        
        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}