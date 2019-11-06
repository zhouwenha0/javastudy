public class hao3 {
    //成员属性:昵称、年龄、体重、品种
        String name ;//昵称String类型默认值null
        int month;//年龄 int类型默认值0
        double weight;//体重double类型默认值0.0
        String species;//品种
        //跑动的方法
        public void run(){
            System.out.println("小猫快跑");
        }
        public void run(String name){
            System.out.println(name+"快跑");
        }
        //吃东西的方法
        public void eat(){
            System.out.println("小猫吃鱼");
        }
    }