import java.util.Scanner;

class semiprime {

    static boolean isSemi(int y) {
        int i;
        int c = 0;
        for (i = 2; y != 1;) {
            if (y % i == 0) {
                c++;
                y = y / i;

            } else
                i++;
        }
        if (c == 2)
            return true;
        return false;
    }

    public static void main(String args[]) {
        int i;
        int c = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("enter values m and n ");
        int m = sn.nextInt();
        int n = sn.nextInt();
        if (m > n) {
            System.out.println(":>_< Invalid Input T_T");
        }
        System.out.println("THE SEMI PRIME NUMBERS ARE:");
        for (i = m; i <= n; i++)
            if (isSemi(i)) {
                System.out.print(i + ",");
                c++;
            }
        System.out.println("Frequency of semi prime is:" + c);
    }
}