import java.util.Arrays;
import java.util.Scanner;

public class Sub_Array_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int iterator = 0; iterator < size; iterator++) {
            array[iterator] = scanner.nextInt();
        }
        int left= scanner.nextInt();
        int right= scanner.nextInt();
        System.out.println(Arrays.toString(subarray(array, left ,right)));
    }

    static int[] subarray(int[] array, int left, int right) {
        int result_size=right-left+1;
        int[] result = new int[result_size];
        for (int i=0;i<result_size;i++){
            if(left<=right){
                result[i]=array[left];
                left++;
            }
        }
        return result;
    }
}
