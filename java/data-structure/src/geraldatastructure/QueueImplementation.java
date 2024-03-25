package geraldatastructure;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueImplementation{
    Queue<String> queue = new LinkedList<String>();

    public void addElements(){
        queue.add("Coffee");
        queue.add("Chocolate");
        queue.add("Caramel");
        printQueue();
    }
    public void offerElements(){
        queue.offer("Milk");
        queue.offer("Cinnamon");
        queue.offer("Cardamon");
        queue.offer("Soy Milk");
        queue.offer("Honey");
        queue.offer("Oat Milk");
        queue.offer("Coconut Milk");
    }
    public void removeElement(){
        String result;
        try{
            retrievesBeginning();
            result = queue.remove();
            System.out.println(result +" erased");
            printQueue();
        }catch (NoSuchElementException e){
            System.out.println("This queue is empty");
        }
    }
    public void poll(){
        String result;
        if(queue.poll()==null){
            System.out.println("This queue is empty");
        }
        else{
            result=queue.poll();
            System.out.println(result +" erased");
        }
    }
    public void retrievesBeginning(){
        String result;
        try{
            System.out.println("Retrieves beginning of the queue, but does not remove");
            result = queue.element();
            System.out.println("Head of queue: " + result);
        }catch (NoSuchElementException e){
            System.out.println("this queue is empty");
        }

    }
    public void peekBeginning(){
        System.out.println("Retrieves beginning of the queue, but does not remove. Returns null.");
        if(queue.peek()==null){
            System.out.println("This queue is empty");
        }
        else {
            String result;
            result = queue.peek();
            System.out.println("Head of queue: " + result);
        }
    }
    public void printQueue(){
        System.out.println(queue);
    }
}
