public class wen29 {
    public void sum(int... n){
     int sum=0;
     for(int i:n){
          sum=sum+i;
     }
     System.out.println("和为"+sum);
    }
    public void search(int n,int... a){
     boolean flag=false;
     for(int a1:a){
        if (a1==n){
          flag=true;
          break;
        }
     }
     if(flag){
         System.out.println("找到了");
     }else
         System.out.println("没找到");
    }
    public static void main(String[] args) {
      wen29 sa=new wen29();
      sa.sum(1);
      sa.sum(1,2);
      sa.sum(1,2,3);
        wen29 sb=new wen29();
        sb.search(3,1,2,3,4,5);
        int []a={1,2,4,5};
        sb.search(3,a);
    }
}
