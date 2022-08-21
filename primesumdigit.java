//program to input a number and print the number of prime digit it has...
import java.util.*;
public class primesumdigit {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sn.nextInt();
        int d =0;
        int c =0;
        for(int i = num ; i > 0 ; i=i/10)
        {
            d = i%10;
            if(d==2 ||d==3 || d==5 || d==7)
            {
                c++;
            }
        }
            System.out.println(c);
    }
}
