public class wen22 {
    public static void main(String[] args){
        int[] a={1,2,3,4,6,8,72,12,15,215,3145,21};
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
