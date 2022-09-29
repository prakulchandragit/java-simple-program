
// to input two different array of different lengths and combine them and display them in ascending order
import java.util.*;

public class merger {
    int A[], B[], C[];
    int m, n;

    merger(int a, int b) {
        m = a;
        n = b;
        A = new int[m];
        B = new int[n];
        C = new int[m + n];
    }

    void input() {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter array A in ascending order");
        for (int i = 0; i < n; i++)
            A[i] = sn.nextInt();
        System.out.println("enter array B in ascending order");
        for (int i = 0; i < n; i++)
            B[i] = sn.nextInt();
    }

    void merge() {
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;

            }
            k++;

        }
        if (i == m) {
            while (j < n) {
                C[k] = B[j];
                k++;
                j++;
            }
        }
        if (j == n) {
            while (i < m) {
                C[k] = A[i];
                k++;
                i++;

            }
        }

    }

    void display() {
        int i;
        for (i = 0; i < m; i++)
            System.out.print(A[i] + "|\t |");
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.print(B[i] + "|\t |");
        }
        System.out.println();
        for (i = 0; i < m + n; i++) {
            System.out.print(C[i] + "|\t |");
        }
        System.out.print(B[i] + "|\t|");

    }

    public static void main(String args[]) {
        merger ob = new merger(3, 3);
        ob.input();
        ob.merge();
        ob.display();
    }

}
