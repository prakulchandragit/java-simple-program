import java.util.StringTokenizer;

public class Change {
    String str;
    String nstr;

    Change(String X) {
        X = str;
    }

    StringTokenizer st = new StringTokenizer(str);

    String reverse(String w) {
        String wt = "";
        String wter = "";
        while (st.hasMoreTokens()) {
            wt = st.nextToken();
        }
        if (wt.indexOf("aeiouAEIOU") != -1) {
            return wt;
        }
        wter = wt;
        return wter;
    }

    void display() {
        String nigga = "";
        while (st.hasMoreTokens()) {
            nigga = st.nextToken();
        }
        nstr = nigga + str;
        System.out.println(str);
        System.out.println(nstr);
    }

    public static void main(String args[]) {
        Change ob = new Change("THE OWL AND THE EAGLE");
        ob.reverse(null);
        ob.display();
    }
}
