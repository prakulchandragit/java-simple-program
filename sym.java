import java.util.*;

public class sym {
    int A[][];
    int m;
    int n;

    sym(int nr, int nc) {
        m = nr;
        n = nc;
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

    void issym() {
        int i;
        int j;
        int c = 0;
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                if (A[i][j] == A[j][i])
                    c++;
            }
        if (m == n && c == m * n)
            System.out.println("symmetric");
        else
            System.out.println("Not symmetric");
    }

    public static void main(String args[]) {
        sym ob = new sym(3, 3);
        ob.input();
        ob.issym();
    }
}