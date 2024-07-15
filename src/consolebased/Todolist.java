package consolebased;
import java.util.Scanner;
public class Todolist {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] tasks = new String[10];
            int taskCount = 0;

            System.out.println("Welcome to Task List!");
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Add a task");
                System.out.println("2. View tasks");
                System.out.println("3. Mark a task as completed");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the task:");
                        scanner.nextLine(); 
                        String task = scanner.nextLine();
                        if (taskCount < tasks.length) {
                            tasks[taskCount] = task;
                            taskCount++;
                            System.out.println("Task added successfully!");
                        } else {
                            System.out.println("Task list is full. Cannot add more tasks.");
                        }
                        break;
                    case 2:
                        if (taskCount == 0) {
                            System.out.println("No tasks in the list.");
                        } else {
                            System.out.println("Tasks:");
                            for (int i = 0; i < taskCount; i++) {
                                System.out.println((i + 1) + ". " + tasks[i]);
                            }
                        }
                        break;
                    case 3:
                        if (taskCount == 0) {
                            System.out.println("No tasks in the list.");
                        } else {
                            System.out.println("Enter the index of the task to mark as completed:");
                            int index = scanner.nextInt();
                            if (index >= 1 && index <= taskCount) {
                                for (int i = index - 1; i < taskCount - 1; i++) {
                                    tasks[i] = tasks[i + 1];
                                }
                                tasks[taskCount - 1] = null;
                                taskCount--;
                                System.out.println("Task marked as completed!");
                            } else {
                                System.out.println("Invalid index.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Exiting Task List. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        }
    }