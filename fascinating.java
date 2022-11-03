import java.util.*;

public class fascinating {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a number 3 digit or more");
        int n = sn.nextInt();
        if (n <= 99) {
            System.out.println("entered number  is not 3 digit");
            System.exit(0);
        }
        int n2 = n * 2;
        int n1 = n * 3;
        String s = n + "" + n1 + "" + n2;
        System.out.println(s);
        int flag = 1;
        int i;
        int f;
        char d;
        char ch = ' ';

        for (d = '1'; d <= '9'; d++) {
            f = 0;
            for (i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                if (d == ch) {
                    f++;
                }
            }

            if (f != 1) {
                flag = 0;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("number is fascinating");

        } else {
            System.out.println("number is not fascinating");
        }
    }

}
