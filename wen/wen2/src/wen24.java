public class wen24 {
    public void faker(){
        System.out.println("我爱");
    }
    public int area(){
        int length=10;
        int width=5;
        int garea=length*width;
        return garea;
    }
    public void tmax(float a,float b){
        float max;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        wen24 sc=new wen24();
        sc.faker();
        System.out.println("周");
        sc.faker();
        wen24 rc=new wen24();
        System.out.println(rc.area());
        wen24 mc=new wen24();
        int a=3,b=5;
        mc.tmax(a,b);
        float m=5.6f,n=8.9f;
        mc.tmax(m,n);
        mc.tmax(9.8f,12.8f);
    }
}
