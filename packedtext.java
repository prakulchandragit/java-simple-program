import java.util.*;

class packedtext {
    String txt, ptxt;

    packedtext(String t) {
        txt = t;
        ptxt = "";
    }

    String h = "";

    String packword(String wd) {
        for (int i = 0; i < wd.length(); i++) {
            char ch = wd.charAt(i);
            boolean duplicateFound = false;
            for (int j = i + 1; j < wd.length(); j++) {
                if (ch == wd.charAt(j)) {
                    duplicateFound = true;
                    break;
                }
            }
            if (!duplicateFound) {
                h = h + ch;
            }
        }
        return h;
    }

    void packtext() {

        StringTokenizer st = new StringTokenizer(txt);
        String w;
        while (st.hasMoreTokens() == true) {
            w = st.nextToken();
            ptxt = ptxt + packword(w) + " ";
        }

    }

    void disptext() {
        System.out.println("the original sentence: " + txt);
        System.out.println("the new sentence: " + ptxt);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String text = sc.nextLine();
        packedtext obj = new packedtext(text);
        obj.packtext();
        obj.disptext();
    }
}
