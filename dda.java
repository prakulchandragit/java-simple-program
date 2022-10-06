
import java.util.*;

public class dda {
    int A[][];
    int m;
    int n;

    dda(int r, int c) {
        m = r;
        n = c;
        A = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        System.out.println("enter matrix");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
        }
    }

    void display() {
        int i;
        int j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
                System.out.print("");
            }
        }
    }

    public static void main(String args[]) {
        dda ob = new dda(3, 2);
        ob.input();
        ob.display();

    }
}
