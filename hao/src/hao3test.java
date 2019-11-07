public class hao3test {
    public static void main(String[] args) {
       //对象实例化
        hao3 one=new hao3();
        //测试
        one.eat();
        one.run();
        one.name="花花";
        one.month=2;
        one.weight=1000;
        one.species ="英短";
        System. out. println("昵称: "+one.name);
        System. out . println("年龄:"+one.month);
        System. out. println("体重:"+one.weight);
        System. out . println("品种:"+one.species);
        one.run(one.name);
        hao3 two=new hao3("花",3,900,"英长");
        System. out. println("昵称: "+two.name);
        System. out . println("年龄:"+two.month);
        System. out. println("体重:"+two.weight);
        System. out . println("品种:"+two.species);
    }
}
