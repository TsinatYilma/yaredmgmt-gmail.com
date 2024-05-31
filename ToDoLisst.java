package todolist;
class ToDoList {
    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markTaskAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markAsCompleted();
                System.out.println("Task '" + title + "' marked as completed.");
                return;
            }
            current = current.getNext();
        }
        //System.out.println("Task '" + title + "' not found in the to-do list.");
    }

    public void displayTasks() {
        Node current = head;
        System.out.println("To-Do List:");
        while (current != null) {
            Task task = current.getTask();
            System.out.println("- " + task.getTitle() + " (" + (task.isCompleted() ? "Completed" : "Pending") + ")");
            current = current.getNext();
        }
    }
}