
//program to find volume of a sphere with various types of methods available in java...
import java.util.*;

class sphere {
    double radius, volume;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        radius = sc.nextDouble();
    }

    void findvol() {
        volume = 4 / 3.0 * 3.14 * Math.pow(radius, 3); // class metho
    }

    void display() {
        findvol(); // nested method calling
        System.out.println(radius + " " + volume);
    }

    public static void main(String args[]) {
        sphere ob = new sphere(); // method declaration
        ob.input();
        ob.display();
    }
}