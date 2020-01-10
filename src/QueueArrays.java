import java.util.NoSuchElementException;

//Remember circular queues
public class QueueArrays {
    private int SIZE = 50;
    private int[] array = new int[SIZE];
    private int frontIndex = -1;
    private int endIndex = -1;


    public void enqueue(int data){
        if(endIndex == array.length - 1){
            array = new int[SIZE * SIZE];
        }
        else if(isEmpty()){
            frontIndex = endIndex = 0;
        }
        else{
            endIndex = (endIndex + 1) % array.length;
        }
        array[endIndex] = data;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else if(frontIndex == endIndex){
            frontIndex = endIndex = 1;
        }
        else{
            frontIndex = frontIndex + 1 % array.length;
        }
        return array[frontIndex];
    }

    public boolean isEmpty(){
        return array.length == 0;
    }

}
