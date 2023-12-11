import java.util.*;

public class lol {
    public static void main(String args[]) {
        int flag = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a setence");
        String sent = sn.nextLine();
        String upsent = sent.toUpperCase();
        String consot = "";
        String newst = "";
        StringTokenizer st = new StringTokenizer(sent);
        while (st.hasMoreTokens()) {
            String wd = st.nextToken();
            for (int i = 0; i <= wd.length(); i++)
                if ("AEIOU".indexOf(wd.charAt(i)) != -1 && "AEIOU".indexOf(wd.length() - 1) != -1) {
                    newst = newst + wd;
                } else
                    consot = consot + wd;
        }
        char t = sent.charAt(sent.length() - 1);
        if (t != '?' || t != '!' || t != ',' || t != '.')
            System.out.println("Invalid Input");

    }
}
