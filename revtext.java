import java.util.StringTokenizer;
//A class RevTxt is designed to reverse the words of a given text. For e.g. WAR MINED 
//changes to RAW DENIM.

public class revtext {
    String txt, rtxt = "";

    revtext(String s) {
        txt = s;
    }

    String revstr(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    void reverse() {
        String w;
        StringTokenizer st = new StringTokenizer(txt);
        while (st.hasMoreTokens()) {
            w = st.nextToken();
            rtxt = rtxt + revstr(w) + "";
        }

    }

    void display() {
        System.out.println(txt);
        System.out.println(rtxt);

    }

    public static void main(String args[]) {
        revtext ob = new revtext("WAR MINED");
        ob.reverse();
        ob.display();
    }
}
