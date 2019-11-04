import java.util.Scanner;

public class wen23 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("请输入第"+(i+1)+"个数");
            arr[i] = sc.nextInt();
        }
        for (int n : arr) {
            System.out.print(n + " ");
            }
        int temp;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                 if(arr[j]>arr[j+1]){
                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
            }
        }
        System.out.println("");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        }
    }