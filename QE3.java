package DSA;

public class QE3 {
    private Object[] stack1;
    private Object[] stack2;
    private int top1;
    private int top2;
    private int capacity;

    public QE3(int capacity) {
        this.capacity = capacity;
        this.stack1 = new Object[capacity];
        this.stack2 = new Object[capacity];
        this.top1 = -1;
        this.top2 = -1;
    }

    public boolean isEmpty() {
        return top1 == -1 && top2 == -1;
    }

    public boolean isFull() {
        return top1 == capacity - 1 && top2 == capacity - 1;
    }

    public void enqueue(Object item) {
        if (isFull()) {
            System.out.println("Queue is full. Unable to enqueue item: " + item);
            return;
        }
        if (top1 == -1) {
            while (top2 != -1) {
                Object data = stack2[top2--];
                stack1[++top1] = data;
            }
        }
        stack1[++top1] = item;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Unable to dequeue item.");
            return null;
        }
        if (top2 == -1) {
            while (top1 != -1) {
                Object data = stack1[top1--];
                stack2[++top2] = data;
            }
        }
        return stack2[top2--];
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Unable to peek item.");
            return null;
        }
        if (top2 == -1) {
            while (top1 != -1) {
                Object data = stack1[top1--];
                stack2[++top2] = data;
            }
        }
        return stack2[top2];
    }
}
