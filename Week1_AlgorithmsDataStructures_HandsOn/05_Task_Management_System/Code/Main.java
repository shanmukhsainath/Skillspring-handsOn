public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Complete Java practice", "Pending"));
        manager.addTask(new Task(2, "Upload assignment", "In Progress"));

        System.out.println("All tasks:");
        manager.displayTasks();

        System.out.println("Search result:");
        Task task = manager.searchTask(2);
        task.displayTask();
    }
}
