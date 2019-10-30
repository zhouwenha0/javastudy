package wen1;

public class wen15 {
    public static void main(String args[]){
        char ch='a';
        int sum=1;
        while(ch<='z')
        {
            System.out.print(ch+"");
            if (sum%13==0)
                System.out.println();
            sum++;
            ch++;
        }
    }
}
