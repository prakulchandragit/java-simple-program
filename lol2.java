import java.util.Scanner;

public class lol2 {
    public static boolean WordCheck(String w) {
        int len1 = w.length();
        if (isVowel(w.charAt(0)) == true && isVowel(w.charAt(len1 - 1)) == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String args[]) {
        int count = 0, i = 0, len = 0;
        char last = ' ', ch = ' ';
        String sen = "", wd = "", vowels = "", nonVowels = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        sen = sc.nextLine();
        sen = sen.trim();
        sen = sen.toUpperCase();
        len = sen.length();
        last = sen.charAt(len - 1);
        if (last != '.' && last != '?' && last != '!') {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }

        for (i = 0; i < len; i++) {
            ch = sen.charAt(i);
            if (ch == ' ' || ch == '.' || ch == '?' || ch == ',' || ch == '!') {

                if (wd.length() > 0 && WordCheck(wd) == true) {
                    count++;
                    vowels += wd + " ";
                } else {
                    nonVowels += wd + " ";
                }
                wd = "";
            } else {
                wd += ch;
            }
        }

        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + count);
        System.out.println(vowels + nonVowels);
    }

}