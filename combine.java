import java.util.*;

public class combine {
    int com[];
    int size;

    combine(int nn) {
        size = nn;
        com = new int[nn];
    }

    void ReadArr() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            com[i] = sc.nextInt();
        }

    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(com[i] + "");
            System.out.println();
        }
    }

    void mix(combine A, combine B) {
        int i, j = 0, k = 0;
        for (i = 0; i < A.size; i++) {
            this.com[k] = A.com[i];
            k++;
        }
        for (i = 0; j < B.size; j++) {
            this.com[k] = B.com[j];
            k++;
        }
    }

    public static void main(String args[]) {
        combine P = new combine(5);
        combine Q = new combine(3);
        combine R = new combine(8);
        P.ReadArr();
        Q.ReadArr();
        R.mix(P, Q);
        R.display();
    }
}
