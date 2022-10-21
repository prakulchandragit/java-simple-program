public class distance {
    int km, mt;
    int k;
    int m;

    distance() {
        km = 0;
        m = 0;
        mt = 0;
        k = 0;
    }

    void getdistance(int k, int m) {
        km = k;
        mt = m;
    }

    void printdistance() {
        System.out.println(km + " " + mt);
    }

    void sum(distance A, distance B) {
        int i = A.mt + B.mt;
        this.km = A.km + B.km + (i / 1000);
        this.mt = i % 1000;
    }

    distance diff(distance B) {
        distance C = new distance();
        if (this.km > B.km) {
            C.km = this.km - B.km;
            C.mt = this.mt - B.mt;
        } else {
            C.km = B.km - this.km;
            C.mt = B.mt - this.mt;
        }
        if (C.mt < 0) {
            C.mt += 1000;
            C.km--;

        }
        return C;
    }

    public static void main(String args[]) {
        distance D1 = new distance();
        distance D2 = new distance();
        distance D3 = new distance();
        distance D4;
        D1.getdistance(18, 750);
        D2.getdistance(13, 900);
        D3.sum(D1, D2);
        D4 = D1.diff(D2);
        D3.printdistance();
        D4.printdistance();
    }
}
