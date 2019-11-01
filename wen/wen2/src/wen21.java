import java.util.Scanner;

public class wen21 {
    public static void main(String[] args){
      int []a=new int[5];
        Scanner sc=new Scanner(System.in);
      for(int i=0;i<a.length;i++){
          System.out.print("请输入第"+(i+1)+"个数");
          a[i]=sc.nextInt();
      }
      System.out.println("数组内容为：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
