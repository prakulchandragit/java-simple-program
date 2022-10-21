import java.util.*;

class wage {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sn.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n);
            } else
                i++;
        }
    }
}