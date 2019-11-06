public class hao1 {
        public static void main(String[] args) {
            int[] numbers = new int[]{1,5,24,56,65,0};  //这个数组的长度是6，最后一个元素0是为数据插入预留的空间
            int num = 6;    //用我们的6做例子，当然可以进行键盘输入
        /*键盘输入的方式
            Scanner input = new Scanner(System.in);
            System.out.println("请输入插入的数据:");
            int num = input.nextInt();
        */
            int index = numbers.length-1;   //用来保存插入的下标，默认是最后一个位置
            //遍历数组，寻找插入的位置
            for(int i = 0;i < numbers.length-1;i++)     //我们不需要比较那个预留的空间，所以i < numbers.length-1
            {
                if(numbers[i] > num)    //一旦找到某个数比num大的，就表示num要插入到它的位置上
                {
                    index = i;      //记录下标并退出循环
                    break;
                }
            }
            //这个循环实现元素后移
            for(int i = numbers.length-1;i > index;i--) //要从倒数的最后一个元素开始后移
            {
                numbers[i] = numbers[i-1];  //把前一个元素后移
            }
            numbers[index] = num;
            for(int n:numbers){
                System.out.print(" "+n);
            }
        }
    }

