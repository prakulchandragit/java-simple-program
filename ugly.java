import java.util.*;

public class ugly {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a num");
        int n = sn.nextInt();
        if (n <= 0) {
            System.out.println("INVALID INPUT NEGATIVE NUMBER ENTERED");
            System.exit(0);
        }
        int i;
        for (i = 2; i < 6 && n != 1; i++) {
            while (n % i == 0)
                n = n / i;
        }
        if (n == 1) {
            System.out.println("ugly");

        } else
            System.out.println("not ugly");
    }
}
