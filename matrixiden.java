import java.util.*;

class matrixiden {
    int i, j, n, m;
    static int F = 1;
    int arr[][];

    matrixiden(int r, int c) {
        m = r;
        n = c;
        arr = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Identity Matrix Items");
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void check() {
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                if (arr[i][j] != 1 && arr[j][i] != 0) {
                    F = 0;
                    break;
                }
            }
        }
    }

    void display() {
        if (F == 1) {
            System.out.println("Matrix is an Identity Matrix");
        } else {
            {
                System.out.println("\nMatrix is Not an Identity Matrix");
            }
        }
    }

    public static void main(String args[]) {
        matrixiden ob = new matrixiden();
        ob.input();
        ob.check();
        ob.display();

    }
}
