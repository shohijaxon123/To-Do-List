import java.util.ArrayList;
import java.util.Iterator;


public class ToDoList {
	private  ArrayList<Task> list = new ArrayList<>();
	
	public void addTask(String description) {
		Task newtask = new Task(description);
		list.add(newtask);
		System.out.println("Task added: " + description);
	}
	
	public void viewTasks() {
		if (list.isEmpty()) {
			System.out.println("No tasks");
		}
		else
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Task " + (i+1) + ": " + list.get(i));
			
			}
	}
	
	public void markTaskAsComplete(int index) {
		if(index < 1 || index > list.size()) {
			System.out.println("No task with such number");
		}
		else {
			Task task = list.get(index - 1);
			task.MarkasCompleted();
			System.out.println("Task marked as complete: " + task.getDescription());
			
		}
			
			
	}
	
	public void removeTask(int index){
		if(index < 1 || index > list.size()) {
			System.out.println("No task with such number");
		}
		else {
			Task task = list.remove(index - 1);
			System.out.println("Task removed: " + task.getDescription());
		}
	}
	
	
}
