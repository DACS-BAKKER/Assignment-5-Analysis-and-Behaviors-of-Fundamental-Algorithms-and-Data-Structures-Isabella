//Quick Sort by Isabella Rolfe
//11/05/19
import java.util.Random;
public class quicksort {

    public void qsort(int[] arr, int beginindex, int lastindex) {
        if(beginindex>=lastindex){
            return;
        }
        int midOfArr = beginindex + (lastindex - beginindex) / 2;
        int pivot = arr[midOfArr];
        int first = beginindex;
        int last = lastindex;
        while (first <= last) {
            //Check until all values on left side array are lower than pivot
            while (arr[first] < pivot) {
                first++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[last] > pivot) {
                last--;
            }

            if (first <= last) {
                swapping(arr, first, last);
                last--;
                first++;
            }
        }
            if (beginindex < last) {
                qsort(arr, beginindex, last);
            }
            if (lastindex > first) {
                qsort(arr, first, lastindex);
            }
        }

    public void swapping(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        quicksort q=new quicksort();
        System.out.print("Unsorted: ");
        Random rand = new Random();
        int[] array = new int[10];
        //randomly fills up array
        for (int x = 0; x < 10; x++) {
            array[x] = rand.nextInt(10);
        }
        //prints array
        for (int l = 0; l < 10; l++) {
            System.out.print(array[l]);
            System.out.print(" ");
        }
        q.qsort(array,0, array.length-1);
        System.out.println();
        System.out.print("sorted:");
        for (int w = 0; w < 10; w++) {
            System.out.print(array[w]);
            System.out.print(" ");
        }
    }
}
