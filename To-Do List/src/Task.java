public class Task {

	private String description;
	private boolean isCompleted;
	
	public Task(String description) {
		this.description = description;
		this.isCompleted = false;
	}
	
	
	public String getDescription() {
		return this.description;
	}
	
	public boolean isCompleted() {
		return this.isCompleted;
	}
	
	public void MarkasCompleted() {
		this.isCompleted = true;
	}
	
	@Override
	public String toString() {
		return (isCompleted ? "[Completed] " : "[Anticipated] ") + description;
	}
}
