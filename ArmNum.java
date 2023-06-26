//armstrong number program 
class ArmNum {
    int n;
    int len;
    int sum = 0;

    ArmNum(int nn) {
        n = nn;
    }

    int sum_pow(int i) {
        int numOfDigits = String.valueOf(n).length();

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numOfDigits);
            temp /= 10;
        }
        return sum;

    }

    void isArmstrong() {
        if (sum == n) {
            System.out.println("it ij armstrong");
        } else {
            System.out.println("tmkc");
        }
    }

    public static void main(String args[]) {
        ArmNum ob = new ArmNum(69);
        ob.sum_pow(0);
        ob.isArmstrong();

    }
}
