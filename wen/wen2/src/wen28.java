public class wen28 {
    public void lwx(int[] a){
          a[3]=15;
          System.out.print("数组元素为");
          for(int n:a){
              System.out.print(" "+n);
          }
        System.out.println();
    }
    public static void main(String[] args) {
         wen28 sc=new wen28();
         int []a1={1,2,3,4,5};
         System.out.print("数组元素为");
        for(int n:a1){
            System.out.print(" "+n);
        }
        System.out.println();
        sc.lwx(a1);
    }
}
