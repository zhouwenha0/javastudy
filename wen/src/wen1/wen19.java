package wen1;

public class wen19 {
    public static void main(String[] args){
         int k=0;
         for(int i=1;i<5;i++){
             for(int j=1;j<5;j++){
                 if(j%2==0)continue;
                 k=k+j;
             }
         }
         System.out.println(k);
    }
}
