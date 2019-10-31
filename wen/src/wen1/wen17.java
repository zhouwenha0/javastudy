package wen1;

public class wen17 {
    public static void main(String[] args){
        int a,b,c,i,ji,sum;
        for(i=199;i<=300;i++)
        {
            a=i/100;
            b=(i-a*100)/10;
            c=i-a*100-b*10;
            ji=a*b*c;
            sum=a+b+c;
            if(ji==42&&sum==12)
            {
                System.out.println(i);
            }
        }
    }
}
