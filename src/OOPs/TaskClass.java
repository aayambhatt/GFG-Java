package OOPs;

class Task{
    private final String title;
    private static int nextId = 1; // starts from 1
    private int id;
    private boolean completed;

    Task(String title) {
        this.title = title;
        id = nextId;
        nextId++;
        completed = false;

    }

    void markAsCompleted(){
        completed = true;
    }

    void printInfo(){
        System.out.println("id: " + id + ", title: " + title + ", completed: " + completed);

    }
}

public class TaskClass {
    public static void main(String[] args) {
        Task t1 = new Task("Backend");
        t1.printInfo();

        Task t2 = new Task("Data Structures and Algorithms");
        t2.printInfo();
    }
}
