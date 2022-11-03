import java.util.*;

public class palindrome {
    public static void main(String args[]) {

        Scanner sn = new Scanner(System.in);

        int dig;

        int revnum = 0;
        System.out.println("enter a number");
        int n = sn.nextInt();
        int copy = n;
        while (copy != 0) {
            dig = copy % 10;
            copy = copy / 10;
            revnum = revnum * 10 + dig;
        }
        if (revnum == n) {
            System.out.println("palindrome");
        } else {
            System.out.println("notpal");
        }

    }
}
