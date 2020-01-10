import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StackArrayLists {

    private ArrayList<Integer> list;

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }
        int element = list.remove(list.size() - 1);
        return element;
    }

    public int peek(){
        return list.get(list.size() - 1);
    }

    public boolean isEmpty(){
        // cheeky answer - return list.isEmpty();
        return list.size() == 0;
    }


}
