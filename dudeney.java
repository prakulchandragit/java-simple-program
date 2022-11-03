import java.util.*;

public class dudeney {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a number positibar");
        int n = sn.nextInt();
        int root = (int) Math.round(Math.cbrt(n));
        int sum = 0;
        int dig;

        while (n != 0) {
            dig = n % 10;
            sum = sum + dig;
            n = n / 10;
        }
        System.out.println(sum);

        System.out.println(root);
        if (sum == root) {
            System.out.println("dudeney");
        } else {
            System.out.println("not dudeney");
        }
    }

}
/*
 * A Dudeney number is a positive integer that is a perfect cube such that the
 * sum of its digits is equal to the cube root of
 * the number.
 * Write a program to input a number and check and print whether it is a Dudeney
 * number or not.
 * 
 * Example:
 * 
 * Consider the number 512.
 * 
 * Sum of digits = 5 + 1 + 2 = 8
 * Cube root of 512 = 8
 * 
 * As Sum of digits = Cube root of Number hence 512 is a Dudeney number.
 */