//not completed
public class password {
    String pwd;

    password(String s) {
        pwd = s;
    }

    int hasLetters() {
        for (int i = 0; i < pwd.length(); i++)
            if (pwd.charAt(i) >= 65 && pwd.charAt(i) <= 90) {
                return 1;
            }
        return 0;
    }

    int hasDigits() {
        for (int i = 0; i < pwd.length(); i++)
            if (pwd.charAt(i) >= 48 && pwd.charAt(i) <= 57) {
                return 1;
            }
        return 0;
    }

}
