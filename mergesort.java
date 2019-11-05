//Merge Sort by Isabella Rolfe
//11/05/19
import java.util.Random;
public class mergesort {

    public static void merge(int array1[], int array2[], int result[]) {
        //result is sum of array1 and array2
        int y=0;
        int i=0;
        int j=0;
        //i increments every time place array1 elements into total
        //j increments every time place something from array2 into total
        while(i+j<array1.length+array2.length){
            //if all of array1 elements have been put into array
            if (i==array1.length){
                //been through array1, all array1 into total
                while(j<array2.length){
                    //put array2, go through and put it into total
                    result[y]=array2[j];
                    //Increments j and i
                    j++;
                    y++;
                }
                break;
            }
            //if all of array 2 has been put in, then put in array 1
            else if(j==array2.length){
                while(i<array1.length){
                    result[y]=array1[i];
                    i++;
                    y++;
                }
                break;
            }
            //looks at left most location in 1 and leftmost location in 2
            //if array1 element less than array2 than put array 1 into total
            if (array1[i]<array2[j]){
                result[y]=array1[i];
                i++;
                y++;
            }
            else{
                //otherwise put array2 in
                result[y]=array2[j];
                j++;
                y++;
            }
        }
    }
    public static void msort(int total[]) {
        int var;
        if(total.length==1){
            return;
        }
        else if(total.length==2){
            //only 2 numbers left, sorting those two numbers
            if(total[0]>total[1]){
                var=total[0];
                total[0]=total[1];
                total[1]=var;
            }
        }
        else{
            //splits into 2
            int array2[]=new int[total.length/2];
            int array1[]=new int[total.length-total.length/2];
            //for loop loops through and puts first half into total x
            for(int x=0;x<total.length/2; x++){
                array2[x]=total[x];
            }
            //for loop loops through and puts second half into array1
            for(int y=0;y<array1.length; y++){
                array1[y]=total[y+total.length/2];
            }
            msort(array2);
            msort(array1);
            //keeps calling above till it gets to base case
            merge(array2,array1,total);
        }
    }

    public static void main(String[]args){
        System.out.print("Unsorted: ");
        Random rand=new Random();
        int[]array=new int[10];
        //randomly fills up array
        for(int x=0; x<10; x++){
            array[x]=rand.nextInt(10);
        }
        //prints array
        for(int l=0; l<10; l++){
            System.out.print(array[l]);
            System.out.print(" ");
        }
        //sorts array
        msort(array);
        System.out.println(" ");
        System.out.print("Sorted: ");
        //prints sorted array
        for(int x=0; x<10; x++){
            System.out.print(array[x]);
            System.out.print(" ");
        }
    }
}