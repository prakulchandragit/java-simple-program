import java.util.*;

/*to arrange the word in alphabetical order 
using bubble sort technique. For e.g. 
binary becomes abinry*/
public class sort {
    String str;

    sort() {
        str = "";
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        str = sc.next();
    }

    void dispword() {
        System.out.println(str);
        arrange();
        System.out.println(str);
    }

    void arrange() {
        int i, j, len;
        char ch[] = str.toCharArray();
        len = ch.length;
        for (i = 0; i < len - 1; i++) {
            for (j = 0; j < len - 1 - i; j++) {
                if (ch[j] > ch[j + 1]) {
                    char t = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = t;
                }
                str = new String(ch);
            }
        }
    }

    public static void main(String args[]) {
        sort ob = new sort();
        ob.readword();
        ob.dispword();
    }
}
