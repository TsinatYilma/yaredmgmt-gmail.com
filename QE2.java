package DSA;
import java.util.Scanner;
public class QE2 {
    private int[] stack;
    private int top;
    private int maxSize;

    public QE2(int size) {
        this.maxSize = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element " + value);
        } else {
            stack[++top] = value;

        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return a sentinel value or throw an exception to indicate an empty stack
        } else {
            int value = stack[top--];
            System.out.println("Popped element " + value + " from the stack.");
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of the stack;");
        int size = ob.nextInt();
        QE2 stack = new QE2(size);
      for(int i = 0; i < size; i++){
          System.out.print("enter the value; ");
          int value = ob.nextInt();
          stack.push(value);
      }
    }
}