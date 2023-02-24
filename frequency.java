import java.util.StringTokenizer;

public class frequency {
    String str;

    frequency(String s) {
        str = s;
    }

    void freq(String wd) {
        String w;
        int count = 0;
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            w = st.nextToken();
            if (w == wd) {
                count++;
            }
        }
    }

    void longWord() {
        String w;
        StringTokenizer st = new StringTokenizer(str);
        String temp;
        String leng = st.nextToken();
        int len = leng.length();
        while (st.hasMoreTokens()) {
            temp = st.nextToken();
            if (temp.length() > len) {
                leng = temp;
                len = temp.length();
            }

        }
        System.out.println("longest word" + leng + "and its length" + len);
    }

    public static void main(String args[]) {
        frequency ob = new frequency("nepal nepal fuck nepalist nepalisssttterrr nepal");
        ob.freq("nepal");
        ob.longWord();

    }
}
