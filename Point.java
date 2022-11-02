public class Point {
    double x, y;
    double dist;

    Point(double m, double n) {
        x = m;
        y = n;
    }

    void display() {
        System.out.println("x=" + x + "y=" + y);

    }

    void distance(Point B) {
        double r = Math.pow(this.x - B.x, 2) + Math.pow(this.y - B.y, 2);
        System.out.println(Math.sqrt(r));
    }

    Point midpoint(Point B) {
        x = (this.x + B.x) / 2;
        y = (this.y + B.y) / 2;
        return this;
    }

    public static void main(String args[]) {
        Point P = new Point(6.5, 3);
        Point Q = new Point(2, 1.0);
        Point R = new Point(0, 0);
        P.distance(Q);
        R.midpoint(P);
        R.display();

    }
}
