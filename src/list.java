
import java.util.Arrays;

public class list {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            int key = arr[i];
            int j= i-1;
            while ((j>-1) && (arr[j]>key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void TimTrungLap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={1,2,4,3,2,10,11,10};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));// in mảng
        System.out.print("\n"+arr1[0] +"\n");// xuất phần tử đầu
        TimTrungLap(arr1);
    }

}
