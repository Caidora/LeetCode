import java.util.*;
class MyQueue {
    Deque<Integer> mainStack;
    Deque<Integer> tempStack;
    public MyQueue() {
        mainStack = new ArrayDeque<Integer>();
        tempStack = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        while(mainStack.peekFirst()!=null){
            tempStack.addFirst(mainStack.removeFirst());
        }
        mainStack.addFirst(x);
        while(tempStack.peekFirst()!=null){
            mainStack.addFirst(tempStack.removeFirst());
        }
    }
    
    public int pop() {
        return(mainStack.removeFirst());
    }
    
    public int peek() {
        return(mainStack.peekFirst());
    }
    
    public boolean empty() {
        return(mainStack.peekFirst()==null);
    }
}

/** Use the second stack to hold the first stacks info when adding. Move all prior data into the temp stack. push to main stack. then move everything back ontop of the first stack. Keeping fifo order
 * pop peek and empty are all standard.
 */