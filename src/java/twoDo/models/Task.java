package twoDo.models;

public interface Task 
{
	public String getName();
	public String getContent();
	public int getUserId();
	
	public void setDeleted(boolean deleted);
	public void setCompleted(boolean completed);
	
	public boolean isDeleted();
	public boolean isCompleted();
}
