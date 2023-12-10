import java.util.Scanner;

public class rearrange {
    String wrd;

    rearrange() {
        wrd = "";
    }

    void readword() {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a word");
        wrd = sn.next();
    }

    String vow = "";
    String nonvow = "";

    void arrange() {
        String vow = "";
        String nonvow = "";
        for (int i = 0; i < wrd.length(); i++) {

            char ch = wrd.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                ;
            {
                vow = vow + ch;
            }
            nonvow = nonvow + ch;
        }
    }

    void display() {
        System.out.println(wrd);
        System.out.println(vow + nonvow);
    }

    public static void main(String args[]) {
        rearrange ob = new rearrange();
        ob.readword();
        ob.arrange();
        ob.display();
    }
}
