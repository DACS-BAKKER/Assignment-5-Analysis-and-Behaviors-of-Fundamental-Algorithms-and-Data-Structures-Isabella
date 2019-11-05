//Stack with Array by Isabella Rolfe
//11/05/19
//by: Isabella Rolfe
import java.util.NoSuchElementException;
public class stackarray {
    private int size;
    private int top;
    private int arr[];


    public stackarray() {
        size=2;
        top=0;
        arr=new int[size];
    }

    public boolean isEmpty() {
        return (top==0);
    }

    public void Push(int item) {
        if (top < size) {
            arr[top] = item;
        } else {
            //create new array
            int[] newarray = new int[size * 2];
            //copy over values from other array
            for (int x = 0; x < arr.length; x++) {
                newarray[x] = arr[x];
            }
            arr = newarray;
            size = newarray.length;
        }
        top++;
    }

    public int Pop() {
        if(top==0) {
            throw new NoSuchElementException("Stack is empty!");
        }
        top--;
        return arr[top];
    }

    public int Peek(){
        if(top==0) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return(arr[top-1]);
    }

    public int size() {
        return top;
    }
}



