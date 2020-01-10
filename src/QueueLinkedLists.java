import java.util.NoSuchElementException;

public class QueueLinkedLists {

    private Node first;
    private Node last;

    public void enqueue(int data){
        Node element = new Node(data);
        if(last != null){
            last.next = element;
        }
        last = element;
        if(first == null){
            first = last;
        }
    }

    public int dequeue(){
        if(first == null){
            throw new NoSuchElementException();
        }
        int element = first.data;
        first = first.next;
        if(first == null){
            last = null;
        }
        return element;
    }

    public int peek(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return last == null;
    }
}
