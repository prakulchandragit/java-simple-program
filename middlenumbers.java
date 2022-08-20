import java.util.*;
class middlenumbers 
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Enter an even number");
        int num =sn.nextInt();
        int a[] =new int[10];
        int d;
        int s = 0;
        int j = 0;
        for(int i = num ; i >0; i/=10){
            
            d = i % 10;
            a[j]=d;
            j++;
        }
        s =a[j/2]+a[(j/2)-1];
        System.out.println(s);
    }
}

