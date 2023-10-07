public class Composite1 {
    int arr[][];
    int m;
    int n;

    Composite1(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    // Helper function to check if a number is composite
    int isComposite(int p) {
        int ctr = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                ctr++;
            }
        }
        if (ctr > 2)
            return 1;
        else
            return 0;
    }

    void fill() {
        int num = 4; // Start with the first composite number (4 is the smallest composite number)
        for (int j = 0; j < n; ++j) {
            for (int i = 0; i < m; ++i) {
                while (isComposite(num) != 1) {
                    ++num; // Find the next composite number
                }
                arr[i][j] = num;
                ++num; // Move to the next number
            }
        }
    }

    void display() {
        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Composite1 obj = new Composite1(4, 4); // Create an object with a smaller matrix size for testing
        obj.fill();
        obj.display();
    }
}
