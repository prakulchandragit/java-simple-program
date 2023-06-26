import java.util.*;

// tocheck whether given number is prime or not
class prime {

    public static void main(String args[]) {
        int c = 0;
        int i;
        Scanner sn = new Scanner(System.in);
        System.out.println("enter num");
        int n = sn.nextInt();

        for (i = 2; i <= n / 2; i++)
            if (n % i == 0)
                c = 1;

        if (c == 0)
            System.out.println("isprime");
        else
            System.out.println("not prime");

    }

}