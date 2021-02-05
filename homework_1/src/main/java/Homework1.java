import java.util.Random;

public class Homework1 {
    public static void main(String[] args){
        Homework1 instance = new Homework1();
        int length =15;
        int [] array = new int[length];
        array = instance.getRandomArray(length);
        instance.printArray(array);

        System.out.print("\n");
        System.out.println(instance.chet(array));
        instance.printArray(instance.sortArray(array));
    }
    private int chet (int [] arr){
        int counter =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) counter++;
        }
        return counter;
    }
    private int[] getRandomArray(int lenght) {
        Random rn = new Random();
        int[] result = new int[lenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = rn.nextInt(10);
        }
        return result;
    }
    private int[] sortArray(int [] arr){
        int temp;
        for(int i =0; i< arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[ ");
            }
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
            if (i == array.length - 1) {
                System.out.print(" ]");
            }
        }
    }
}
