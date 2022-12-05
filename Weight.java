class Weight {
    int kg;
    int gm;
    int z;

    Weight() {
        kg = 0;
        gm = 0;
    }

    Weight(int k, int g) {
        kg = k;
        gm = g;
    }

    void addWeight(Weight x, Weight y) {
        z = x.gm + y.gm;
        this.kg = x.kg + y.kg + z / 1000;
        this.gm = z % 1000;
    }

    void display() {
        System.out.println(kg + " " + gm);

    }

    public static void main(String args[]) {
        Weight w1 = new Weight(5, 800);
        Weight w2 = new Weight(8, 700);
        Weight w3 = new Weight();
        w3.addWeight(w1, w2);
        w3.display();
    }
}