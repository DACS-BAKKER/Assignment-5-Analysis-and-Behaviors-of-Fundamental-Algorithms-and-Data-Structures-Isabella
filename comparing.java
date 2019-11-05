//Class for Comparing Stack with Linked List, and Stack with Array, by Isabella Rolfe
//11/05/19
public class comparing {
    public static void main(String args[]) {
        Stack stack = new Stack();
        stackarray stackar = new stackarray();
        System.out.println("Time at start: " + System.currentTimeMillis());
        for (int x = 0; x < 100000; x++) {
            stack.Push(x);
        }
        System.out.println("Time after stack pushed: " + System.currentTimeMillis());
        for (int y = 0; y < 100000; y++) {
            stackar.Push(y);
        }

        System.out.println("Time after stackarr pushed: " + System.currentTimeMillis());
        for (int y = 0; y < 900; y++) {
            stack.Pop();
        }

        System.out.println("Time after stack popped: " + System.currentTimeMillis());
        for (int y = 0; y < 900; y++) {
            stackar.Pop();
        }
        System.out.println("Time after stackarr popped: " + System.currentTimeMillis());
    }
}
