import java.util.ArrayList;
import java.util.NoSuchElementException;

public class QueueArrayLists {
    private ArrayList<Integer> array;

    public void enqueue(int data){
        array.add(data);
    }

    public int dequeue(){
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }
        return array.remove(0);
    }

    public int peek(){
        return array.get(0);
    }

    public boolean isEmpty(){
        return array.size() == 0;
    }
}
