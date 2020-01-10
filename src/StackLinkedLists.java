import java.util.EmptyStackException;

public class StackLinkedLists {

    private Node node = new Node(1);

    public void push(int data){
        Node item = new Node(data);
        node.next = item;
        item = node;
    }

    public int pop(){
        if(node == null){
            throw new EmptyStackException();
        }
        int item = node.data;
        node = node.next;
        return item;
    }

    public int peek(){
        if(node == null){
            throw new EmptyStackException();
        }
        return node.data;
    }

    public boolean isEmpty(){
        return node == null;
    }
}
