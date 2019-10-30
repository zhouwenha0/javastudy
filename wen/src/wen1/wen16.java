package wen1;

import java.util.Random;
import java.util.Scanner;

public class wen16 {
    public static void main(String[] args)
 {
        Random r = new Random();
        int shu;
            // int ran1 = r.nextInt(10);
             int ran1 = (int)(Math.random()*10+1);
             System.out.println(ran1);
                 do {
                     Scanner sc =new Scanner(System.in);
                     shu=sc.nextInt();
                     if(shu>ran1){
                         System.out.println("大了");
                     }
                     if(shu<ran1){
                         System.out.println("小了");
                     }
                 }while(shu!=ran1);
                 System.out.println("你猜到了");
         }
}
