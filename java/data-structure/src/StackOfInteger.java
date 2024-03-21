import java.util.Stack;
import java.util.Vector;

public class StackOfInteger{
    Stack<Integer> stack = new Stack<>();
    public void pushFromStack(Integer integer){
        stack.push(integer);
    }
    public void popFromStack(){
        stack.pop();
    }
    public void printStack(){
        for (Integer itgr : stack){
            System.out.println(itgr);
        }
    }
}
