public class hao2 {
    public static void main(String[] args) {
        int index = 2;
        int value = 5;
        int[] array = new int[]{1,2,3,4};
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for(int n:newArray){
            System.out.print(" "+n);
        }
        System.out.println();
        for (int i=newArray.length - 1; i>index; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[index] = value;
        array = newArray;
        for(int n:array){
            System.out.print(" "+n);
        }
    }
}
