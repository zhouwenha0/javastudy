public class wen27 {
    public int uzi(int n,int m){
       return m+n;
    }
    public double uzi(double n,double m){
        return m+n;
    }
    public int uzi(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
        }
        return sum;
    }
    public void xiaoming(int a,int b){
        int temp;
        System.out.println("交换前是"+a+"  "+b);
        temp=a;a=b;b=temp;
        System.out.println("交换后是"+a+"  "+b);
    }
    public static void main(String[] args) {
        int m=5 ,n=10;
        int[]arr={1,2,3,4,5};
        wen27 sc=new wen27();
        System.out.println(sc.uzi(m,n));
        System.out.println(sc.uzi(5.6,7.8));
        System.out.println(sc.uzi(arr));
        wen27 sd=new wen27();
        sd.xiaoming(m,n);
    }
}
