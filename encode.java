import java.util.Scanner;

public class encode {
    String word;
    int length;
    String new_word;

    encode() {
        word = "";
        length = 0;
        new_word = "";
    }

    void acceptword() {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter the word");
        word = sn.next();
        length = word.length();
    }

    void nextvowel() {
        for (int i = 0; i < length; i++) {
            char oldchar = word.charAt(i);
            char newchar = oldchar;
            if (oldchar == 'a' || oldchar == 'e' || oldchar == 'i' || oldchar == 'o' || oldchar == 'u') {
                switch (oldchar) {
                    case 'a':
                        newchar = 'e';
                        break;
                    case 'e':
                        newchar = 'i';
                        break;
                    case 'i':
                        newchar = 'o';
                        break;
                    case 'o':
                        newchar = 'u';
                        break;
                    case 'u':
                        newchar = 'a';
                        break;
                }
            }
            new_word = new_word + newchar;
        }

    }

    void display() {
        System.out.println("old string is" + word);
        System.out.println(new_word);
    }

    public static void main(String args[]) {
        encode ob = new encode();
        ob.acceptword();
        ob.nextvowel();
        ob.display();
    }
}
