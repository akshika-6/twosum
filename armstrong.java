import java.util.*;
import java.lang.Math;
public class armstrong {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,d1,temp1,temp,s=0,c=0;
        temp=n;
        temp1=n;
        while(temp!=0){
            d=temp%10;
            c++;
            temp=temp/10;
        }
        while(temp1!=0){
            d1=temp1%10;
            s=s+(int) Math.pow(d1,c);
            temp1=temp1/10;
        }
        if(n==s)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
    }
    Scanner.close();
}
}