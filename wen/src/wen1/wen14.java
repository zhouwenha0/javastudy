package wen1;

import java.util.Scanner;

public class wen14 {
    public static void main(String args[]){
        //char grade = args[0].charAt(0);
        Scanner c=new Scanner(System.in);
        String grade = c.nextLine();
        grade=grade.toUpperCase();//把字符串里的单词全部改成大写
        switch(grade)
        {
            case "A" :
                System.out.println("优秀");
                break;
            case "B" :
            case "C" :
                System.out.println("良好");
                break;
            case "D" :
                System.out.println("及格");
                break;
            case "F" :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
