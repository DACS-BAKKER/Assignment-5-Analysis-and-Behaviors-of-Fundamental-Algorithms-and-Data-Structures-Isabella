//Stack by Isabella Rolfe
//11/05/19
//by: Isabella Rolfe
public class Stack{
    private Node top;
    private Node next;
    private int size;

    public class Node {
        public int item;
        public Node next;
    }


    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void Push(int item) {
        if (top == null) {
            top = new Node();
            top.item = item;
        } else {
            Node temp = top;
            top = new Node();
            top.next = temp;
            top.item=item;
        }
        size++;
    }

    public Node Pop() {
        Node temp = top;
        if (top != null) {
            top = top.next;
        }
        size--;
        return temp;
    }

    public Node Peek(){
        return top;
    }

    public int size() {
        return size;
    }
}





