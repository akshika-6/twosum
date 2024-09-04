import java.util.*;
public class armstrong {
    public static void main (string args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,d1,temp1,temp,s=0,c=0;
        temp=n;
        temp1=n;
        while(n!=0){
            d=n%10;
            c++;
            n=n/10;
        }
        while(n!=0){
            d1=n1%10;
            s=s+(int) math.pow(d1,c1);
            n=n/10;
        }
        if(temp==s)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
    }
}
