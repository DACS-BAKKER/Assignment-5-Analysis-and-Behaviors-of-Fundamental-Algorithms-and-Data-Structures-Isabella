//Selection Sort by Isabella Rolfe
//11/05/19
import java.util.Random;
public class selectionsort   {

    public static void ssort(int isabellasarray[]) {
        int num=isabellasarray.length;
        for(int x=0; x<num;x++) {
            int small=x;
            for(int z=x; z<num;z++) {
                if(isabellasarray[z]<isabellasarray[small]) {
                    small=z;
                }
            }
            int temp=isabellasarray[small];
            isabellasarray[small]=isabellasarray[x];
            isabellasarray[x]=temp;

        }
    }

    public static void stablessort(int isabellasarray[]) {
        int num=isabellasarray.length;
        for(int x=0; x<num;x++) {
            int small=x;
            for(int z=x; z<num;z++) {
                if(isabellasarray[z]<isabellasarray[small]) {
                    small=z;
                }
            }
            int temp=isabellasarray[small];
            for(int y=small;y>x;y--){
                isabellasarray[small]=isabellasarray[small-1];
            }
            isabellasarray[x]=temp;
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + "");
        }
    }

    public static void main(String args[]) {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int x=0;x<10;x++) {
            int n = rand.nextInt(10);
            arr[x]=n;
        }
        System.out.println("This is presorted: ");
        printArray(arr);
        System.out.println();
        System.out.println("Before Time: " +System.currentTimeMillis());
        stablessort(arr);
        System.out.println("After Time: " +System.currentTimeMillis());
        System.out.print("Sorted Array: ");
        printArray(arr);
    }


}

