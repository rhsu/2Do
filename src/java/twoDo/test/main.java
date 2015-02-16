package twoDo.test;

import java.util.List;
import twoDo.models.TaskTemp;
import twoDo.providers.TaskTempProvider;

public class main 
{
	public static void main(String[] args)
	{
		TaskTempProvider provider = new TaskTempProvider();
		
		List<TaskTemp> tasks = provider.getTasks(12);
		
		for(TaskTemp task : tasks) 
		{ 
			System.out.println(task.getContent() + " " + task.getName()); 
		}
		
		provider.insertTask("name", "Some content here");
	}
}