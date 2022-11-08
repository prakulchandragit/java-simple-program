import java.util.*;

class everythingstrings {
    String s = "The judge sentenced her to three months in prison for shoplifting.";
    String s2 = "Twenty years in prison was a very harsh sentence.";

    void compare() {
        System.out.println(s.compareTo(s2));// should return negative value...

    }

    public static void main(String args[]) {

        everythingstrings ob = new everythingstrings();
        ob.compare();
    }
}