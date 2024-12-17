import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		ToDoList todolist = new ToDoList();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		
		do {
			System.out.println("\n \t To-Do List Menu ");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Remove Task");
			System.out.println("0. Exit");

			choice = scanner.nextInt();
			scanner.nextLine();
		
			switch(choice) {
				case 1:
					System.out.println("\t Write a task");
					String description = scanner.nextLine();
					todolist.addTask(description);
					break;
				case 2:
					todolist.viewTasks();
					break;
				case 3:
					System.out.println("Input number of task: ");
					int taskNumToComplete = scanner.nextInt();
					todolist.markTaskAsComplete(taskNumToComplete);
					break;
				case 4:
					System.out.println("Input number of task: ");
					int taskNumToRemove = scanner.nextInt();
					todolist.removeTask(taskNumToRemove);
					break;
				case 0:
                    System.out.println("Exiting program");
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			
		
		} while (choice!=0);
		
		scanner.close();
	}
}
