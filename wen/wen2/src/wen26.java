import java.util.Scanner;

public class wen26 {
    public void doinb(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public boolean search(int n,int[]arr){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==n){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
             int[] arr={20,30,50,100,120};
             wen26 sc=new wen26();
             sc.doinb(arr);
             Scanner sb=new Scanner(System.in);
             System.out.println("你要找多少");
             int n1=sb.nextInt();
             wen26 sd=new wen26();
             boolean flag=sd.search(n1,arr);
             if(flag){
                 System.out.println("找到了");
             }else{
                 System.out.println("没找到");
             }
    }
}
