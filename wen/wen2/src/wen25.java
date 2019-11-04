public class wen25 {
    public int fac(int n){
        int s=1;
        for(int i=1;i<=n;i++){
            s*=i;
        }
        return s;
    }
    public static void main(String[] args) {
        wen25 sc=new wen25();
        int fac=sc.fac(3);
        System.out.println(fac);
        int sum=0,fab;
        for(int i=1;i<=5;i++){
            fab=sc.fac(i);
            sum=sum+fab;
        }
        System.out.println(sum);
    }
}
