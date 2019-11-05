//Insertion Sort by Isabella Rolfe
//11/05/19
import java.util.Random;
import java.util.ArrayList;

public class insertionsort {

    public static ArrayList<Integer> ssort(ArrayList <Integer> arr) {
        int size = arr.size();
        for (int i=1; i<size; i++) {
            int key = arr.get(i);
            int j = i-1;
            while (j>=0 && arr.get(j)>key) {
                //shifting to right
                arr.set(j+1, arr.get(j)) ;
                //j-1 because needs to go back one space
                j = j-1;
            }
            //inserting key into spot j+1
            arr.set(j+1, key);
        }
        return arr;
    }

    public static void printarray(ArrayList <Integer> random) {
        for(int x=0;x<random.size(); x++) {
            System.out.print(random.get(x));
        }
    }
    public static ArrayList<Integer> randomlyfillup (ArrayList<Integer> random ){
        Random rand = new Random();
        for(int x=0;x<10;x++) {
            int n = rand.nextInt(10);
            random.add(n);
        }
        return random;
    }

    public static void main(String[] args) {
        ArrayList <Integer> random=new ArrayList<Integer>();
        randomlyfillup(random);
        System.out.println("Unsorted:  ");
        printarray(random);
        System.out.println();
        System.out.println("Before Time: " + System.currentTimeMillis());
        ssort(random);
        System.out.println("After Time: " +System.currentTimeMillis());
        System.out.println();
        System.out.println("Sorted:  ");
        printarray(random);
    }
}
