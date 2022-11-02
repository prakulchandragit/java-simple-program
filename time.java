public class time {
    int hrs;
    int mins;

    time() {
        hrs = 0;
        mins = 0;
    }

    void getTime(int h, int m) {
        hrs = h;
        mins = m;
    }

    void dispTime() {
        System.out.println(hrs + " " + mins);

    }

    void diffTime(time et, time st) {
        this.hrs = et.hrs - st.hrs;
        this.mins = et.mins - st.mins;
        if (this.mins < 0) {
            this.mins += 60;
            this.hrs--;
        }

    }

    public static void main(String args[]) {
        time t1 = new time();
        time t2 = new time();
        time t3 = new time();
        t1.getTime(6, 45);// start
        t2.getTime(10, 25);
        t3.diffTime(t2, t1);
        t3.dispTime();
    }
}
