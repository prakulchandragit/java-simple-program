import java.util.*;

//Example: The word “mOTivATe” becomes “MotIVatE”
public class toggle {
    String str, newstr;
    int len;

    toggle() {
        str = "";
        newstr = "";

    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        str = sc.next();
    }

    void Toggle() {
        int i;
        char ch;
        len = str.length();
        for (i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch + 32);
            else
                ch = (char) (ch - 32);
            newstr = newstr + ch;
        }
    }

    void display() {
        System.out.println(str + " " + newstr);
    }

    public static void main(String args[]) {
        toggle ob = new toggle();
        ob.readword();
        ob.Toggle();
        ob.display();
    }

}
