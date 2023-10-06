import java.util.*;

public class ArrMix {
    Scanner sc = new Scanner(System.in);
    int a1[];
    int a2[];
    int arranged[];
    int size1;
    int size2;

    ArrMix(int m, int n) {
        size1 = m;
        size2 = n;
        a1 = new int[size1];
        a2 = new int[size2];
        arranged = new int[size1 + size2];
    }

    void fillarray() {
        for (int i = 0; i < size1; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            a2[i] = sc.nextInt();
        }
    }

    void arrange() {
        int aindex = 0;
        for (int i = 0; i < size1; i++) {
            int sqrt = (int) Math.sqrt(a1[i]);
            if (sqrt * sqrt == a1[i]) {
                arranged[aindex++] = a1[i];
            }
        }
        for (int i = 0; i < size2; i++) {
            int sqrt = (int) Math.sqrt(a2[i]);
            if (sqrt * sqrt == a2[i]) {
                arranged[aindex++] = a2[i];
            }
        }
        for (int i = 0; i < size1; i++) {
            int sqrt = (int) Math.sqrt(a1[i]);
            if (sqrt * sqrt != a1[i]) {
                arranged[aindex++] = a1[i];
            }
        }
        for (int i = 0; i < size2; i++) {
            int sqrt = (int) Math.sqrt(a2[i]);
            if (sqrt * sqrt != a2[i]) {
                arranged[aindex++] = a2[i];
            }
        }

    }

    void display() {
        System.out.println("Arranged Array:");
        for (int i = 0; i < size1 + size2; i++) {
            System.out.print(arranged[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array 1: ");
        int size1 = sc.nextInt();

        System.out.print("Enter the size of Array 2: ");
        int size2 = sc.nextInt();

        ArrMix arrMix = new ArrMix(size1, size2);

        arrMix.fillarray();
        arrMix.arrange();
        arrMix.display();
        sc.close();
    }
}
