import java.util.*;

class uhxs {
    String str1;
    String str2 = "";
    String str3;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        str1 = sc.nextLine().toUpperCase();
        if (str1.indexOf(".") == -1 && str1.indexOf("?") == -1 && str1.indexOf("!") == -1) {
            System.out.println("invalid input");
        } else {

        }
        str3 = str1;
    }

    boolean check(String w) {
        int l = w.length();
        if ((w.charAt(0) == 'A' || w.charAt(0) == 'E' || w.charAt(0) == 'I' || w.charAt(0) == 'O' || w.charAt(0) == 'U')
                && (w.charAt(l - 1) == 'A' || w.charAt(l - 1) == 'E' || w.charAt(l - 1) == 'I' || w.charAt(l - 1) == 'O'
                        || w.charAt(l - 1) == 'U'))
            return true;
        else
            return false;
    }

    void wordch1() {

        input();
        str1 = str1.substring(0, (str1.length() - 1));
        StringTokenizer st = new StringTokenizer(str1);
        int c = 0;
        while (st.hasMoreTokens()) {
            String w = st.nextToken();
            if (check(w) == true) {
                str2 = str2 + w + " ";
                c++;
                System.out.println(w"\t");
            }
        }
        System.out.println("frequency" + c);
    }

    void wordch2() {
        wordch1();
        StringTokenizer st = new StringTokenizer(str1);
        while (st.hasMoreTokens()) {
            String w = st.nextToken();
            if (check(w) != true) {
                str2 = str2 + w + " ";
            }

        }
        System.out.println(str2 + str3.charAt(str3.length() - 1));
    }

    public static void main(String arggs[]) {
        uhxs ob = new uhxs();
        ob.wordch2();
    }
}