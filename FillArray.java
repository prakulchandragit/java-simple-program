import java.util.Scanner;

public class FillArray {
    int arr[][];
    int A[];
    int n;
    int k;

    FillArray(int nn) {
        n = nn;
        arr = new int[nn][nn];
        A = new int[n];
    }

    void accept() {
        System.out.println("enter a single dimension array");
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i] = sn.nextInt();
        }
    }

    void fill() {
        for (int i = 0; i < A.length; i++) {
            for (int j = i, k = 0; j < i + A.length; j++, k++) {
                arr[i][k] = A[j % A.length];
            }
        }
    }

    void display() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        FillArray ob = new FillArray(5);
        ob.accept();
        ob.fill();
        ob.display();

    }
}
