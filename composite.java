public class composite {
    int arr[][];
    int m;
    int n;

    composite(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    int isComposite(int p) {
        int ctr = 0;
        for (int i = 0; i <= p; i++) {
            if (p % i == 0) {
                ctr++;
            }
        }
        if (ctr > 2)
            return 1;
        else
            return 0;
    }

    void fill()
    {
     for(int i = 0 ; i<m;i++)
     {
        for(int j = 0 ; j <n ; j++)
        {
            if(isComposite()==true)
            {
                arr[i][j]==num;
            }
        }
     }   
    }

    void display() {
        System.out.println("the matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }

    public static void main(String args[]) {
        composite obj = new composite(20, 20);
        obj.isComposite(20);
        obj.fill();
        obj.display();
    }
}
