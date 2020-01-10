import java.util.NoSuchElementException;

public class StackArrays {

    private int SIZE = 100;
    private int index = -1;
    private int[] array = new int[SIZE];

    public void push(int data){
        if(index == array.length - 1){
            array = new int[SIZE * SIZE];
        }
        index ++;
        array[index] = data;
        System.out.println(index);
    }

    public int pop(){
        if(array.length < 0){
            System.out.println("Stack is empty");
            throw new NoSuchElementException();
        }
        int element = array[index];
        index--;
        return element;

    }

    public int peek(){
        return array[index];
    }

    public boolean isEmpty(){
        return array.length == 0;
    }

    public int size(){
        return array.length;
    }

}
