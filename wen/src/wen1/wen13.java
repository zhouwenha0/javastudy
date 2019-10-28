package wen1;

public class wen13 {
    public static void main(String args[])
    {
        String ss="hello world ni hao w shi zhou";
        String[] a=ss.split(" ");
        System.out.print(a.length);
        System.out.print("  ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
