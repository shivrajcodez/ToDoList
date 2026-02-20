import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> tasks = new ArrayList<>();
        int taskCount = 1;

        while (true) {

            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Show Tasks");
            System.out.println("Q. Quit Application");

            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter the index to add the task:");
                    //when i press multiple enter it throw error
                    int addIndex = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter Task to add or (Press Enter to Exit):");
                    String addTaskLine = sc.nextLine();
                    while (!addTaskLine.isEmpty()) {

                        if (addIndex >= 1 && addIndex <= tasks.size() + 1) {
                            tasks.add(addIndex - 1, taskCount + ". " + addTaskLine);
                            taskCount++;
                            System.out.println("Task Added Successfully!");
                        } else {
                            System.out.println("Invalid Index. Task not added.");
                        }
                        System.out.println("Enter the index to add the task:");
                        addIndex = Integer.parseInt(sc.nextLine());

                        System.out.println("Enter Task to add or (Press Enter to Exit):");
                        addTaskLine = sc.nextLine();
                    }
                    break;
                case "2":
                    if (tasks.isEmpty()) {
                        System.out.println("No Task to remove");
                    } else {
                        System.out.println("Tasks to Remove:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + 1 + ". " + tasks.get(i));
                        }

                        System.out.println("Enter index of task to Remove");

                        int index = Integer.parseInt(sc.nextLine());
                        if (index >= 1 && index <= tasks.size()) {
                            tasks.remove(index - 1);
                            System.out.println("Task Removed Successfully");
                        } else {
                            System.out.println("Invalid Task");
                        }
                    }
                    break;

                case "3":
                    if (tasks.isEmpty()) {
                        System.out.println("Empty Task");
                    } else {
                        System.out.println();
                        System.out.println("Tasks: ");
                        System.out.println();
                        for (String task : tasks) {
                            System.out.println(task);
                        }
                    }
                    break;
                case "q":
                case "Q":
                    System.out.println("Quitting Application");
                    return;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
