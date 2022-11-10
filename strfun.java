import java.util.*;

//returns true if the given string begins and ends with a vowel.
public class strfun {
    String txt;

    strfun() {
        txt = "";
    }

    void readtxt() {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a sentence");
        txt = sn.nextLine();
    }

    boolean check(String a) {
        char c1, c2;
        int p1, p2;
        c1 = a.charAt(0);
        c2 = a.charAt(a.length() - 1);
        p1 = "AEIOUaeiou".indexOf(c1);
        p2 = "AEIOUaeiou".indexOf(c2);
        if (p1 > -1 && p2 > -1) {
            return true;
        }
        return false;
    }

    void display() {
        String w;
        StringTokenizer st = new StringTokenizer(txt);
        while (st.hasMoreTokens()) {
            w = st.nextToken();
            if (check(w))
                System.out.println(w);
        }

    }

    public static void main(String args[]) {
        strfun ob = new strfun();
        ob.readtxt();
        ob.display();
    }
}
