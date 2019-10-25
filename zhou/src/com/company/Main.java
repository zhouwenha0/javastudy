package com.company;
import java.util.Scanner;
    abstract class faker {
        protected double x;
        public faker(double x) {
            this.x=x;
        }
        protected void changeX(double x) {

            this.x=x;
        }
        public abstract double area();
    }

    class MYTriangle extends faker{
        private double y;
        public MYTriangle(double x,double y) {
            super(x);
            this.y=y;
        }
        public double area(){
            return x*y*0.5;
        }
    }
    class MYCircle extends faker{
        public MYCircle (double x) {
            super(x);
        }
        public double area() {
            return 3.14*x*x;
        }
    }
    class MYRectangle extends faker{
        private double y;
        public MYRectangle( double x,double y) {
            super(x);
            this.y=y;
        }
        public double area() {
            return x*y;
        }
    }
    class MYEllipse extends faker{
        private double y;
        public MYEllipse( double x,double y) {
            super(x);
            this.y=y;
        }
        public double area() {
            return x*y*3.14;
        }
    }
    public class Main {
        public static void main(String[] args) {
            System.out.println("1矩形 2椭圆 3圆 4三角形");
            Scanner sc=new Scanner(System.in);
            double a=sc.nextDouble();
            if(a==1) {
                System.out.println("依次输入长，宽");
                double b=sc.nextDouble();
                double c=sc.nextDouble();
                MYRectangle r=new MYRectangle(b,c);
                System.out.println(r.area());
            }
            if(a==2) {
                System.out.println("依次输入长半轴，短半轴");
                double b=sc.nextDouble();
                double c=sc.nextDouble();
                MYEllipse e=new MYEllipse(b,c);
                System.out.println(e.area());
            }
            if(a==3) {
                System.out.println("输入半径");
                double b=sc.nextDouble();
                MYCircle  c=new MYCircle(b);
                System.out.println(c.area());
            }
            if(a==4) {
                System.out.println("依次输入底边长和高");
                double b=sc.nextDouble();
                double c=sc.nextDouble();
                MYTriangle t=new MYTriangle(b,c);
                System.out.println(t.area());
            }
        }
    }