import java.util.Scanner;
//Binary Search by Isabella Rolfe
//11/05/19
public class binarysearch {
   public static int binarysearch(int[] arr, int input, int startindex, int endindex) {
        //trying to get middle
        if(endindex-startindex>=0) {
            //inside this if statement is checking that it's not down to one string to search through
            int midindex=(endindex-startindex)/2+startindex;
            if(input==arr[midindex]) {
                return midindex;
            }
            else {
                if(input>arr[midindex]) {
                    //this time it'll start halfway through at mid index
                    return binarysearch(arr, input,midindex+1,endindex);
                }
                else {
                    //start 0, halfway
                    return binarysearch(arr,input, startindex, midindex-1);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What number would you like to check to see if it's in the array?");
        int choice=scan.nextInt();
        int[]arr={ 3, 5, 6, 8, 11, 14, 20, 21, 22, 29 };
        int index=binarysearch(arr,choice,0, arr.length-1);
        if (index == -1) {
            System.out.println("Not found in array!");
        } else {
            System.out.println("The number " + choice  + " is in index " + index);
        }
    }
}
