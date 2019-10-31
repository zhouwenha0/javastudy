package wen1;

public class wen18 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=5;i++)
        {
            int s=1;
            for(int j=1;j<=i;j++){
                s=s*j;
            }
            sum=sum+s;
        }
        System.out.println(sum);
    }
}
