package todolist;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Add tasks
        toDoList.addTask(new Task("Finish assignment", "Complete the assignment by Friday"));
        toDoList.addTask(new Task("prepare for final", "learn all the syllables ASAP"));
        toDoList.addTask(new Task("Call mom", "Remember to call mom this weekend"));

        // Display tasks
        toDoList.displayTasks();

        // Mark a task as completed
        toDoList.markTaskAsCompleted("Call mom");

        // Display tasks again
        toDoList.displayTasks();
    }
}