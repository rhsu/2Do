package twoDo.api;

public interface Task 
{
	public String getName();
	public String getContent();
	public boolean isDeleted();
	public boolean isCompleted();
	
	public void setDeleted(boolean deleted);
	public void setCompleted(boolean completed);
}
