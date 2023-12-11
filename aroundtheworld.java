import java.util.Scanner;

public class aroundtheworld {

    static void printmat(int b[][], int r, int c) {
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter m and n values:");
        int m = sn.nextInt();
        int n = sn.nextInt();
        int A[][] = new int[m][n];

        // Input matrix
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sn.nextInt();

        // Declare new matrix
        int B[][] = new int[n][m];
        printmat(A, m, n);

        // Rotate matrix
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                B[j][m - 1 - i] = A[i][j];
            }
        printmat(B, n, m);

        // Sum of odd elements
        int sum = 0;
        System.out.print("Odd Elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] % 2 != 0) {
                    sum += A[i][j];
                    System.out.print(A[i][j] + " ");
                }
            }
        }
        System.out.println("\nSum is: " + sum);

        // Close the Scanner
        sn.close();
    }
}
