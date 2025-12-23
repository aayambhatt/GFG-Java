package gemDsaPractice;

import java.util.ArrayList;

class myStack {
    private ArrayList<Integer> stack;  // store elements
    private int n;                     // maximum capacity

    // Constructor
    public myStack(int n) {
        this.n = n;
        this.stack = new ArrayList<>();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    // Check if stack is full
    public boolean isFull() {
        return stack.size() == n;
    }

    // Push element to top of stack
    public void push(int x) {
        if (!isFull()) {
            stack.add(x);
        }
        // silently ignore if full
    }

    // Pop element from top of stack
    public int pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return -1; // return -1 if empty
    }

    // Peek top element without removing
    public int peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return -1; // return -1 if empty
    }
}

// Test class with main method
public class StackImplementation {
    public static void main(String[] args) {
        myStack s = new myStack(5);

        // Example usage
        s.push(10);
        s.push(20);
        System.out.println(s.pop());  // Output: 20
        System.out.println(s.peek()); // Output: 10
        System.out.println(s.isEmpty()); // Output: false
        System.out.println(s.isFull());  // Output: false
    }
}
