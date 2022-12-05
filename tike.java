import java.util.*;

public class tike {
    String wrd;
    int len;

    tike() // default constructor
    {
        wrd = "";
        len = 0;
    }

    void acceptword() // for inputting the word
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter word");
        wrd = sn.next();// setting the value of wrd to the inputted string
    }

    boolean palindrome() // method to check whether entered string is palindrome
    {
        String s = "";
        len = wrd.length();
        for (int i = wrd.length() - 1; i >= 0; i--) // word extraction loop
        {
            s = s + wrd.charAt(i);
        }
        if (s.equals(wrd))// string comparision to original string
            return true;
        return false;
    }

    void display() // displaying the conditions
    {
        System.out.println("entered word was " + wrd);
        if (palindrome()) {
            System.out.println("palindrome");
        } else
            System.out.println("not");
    }

    public static void main(String args[]) {
        tike ob = new tike();
        ob.acceptword();
        ob.display();
    }

}
