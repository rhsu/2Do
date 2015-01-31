package providerExperimental;

import java.util.List;
import modelsExperimental.UserTask;

public class UserTaskProvider implements TaskProvider<UserTask>
{
	
	@Override
	public void createTask(String name, String content) 
	{
		UserTask task = new UserTask(name, content);
	}

	@Override
	public void deleteTask() 
	{
		// TODO: database call that deletes task
	}

	@Override
	public List<UserTask> getTasks(int userId) 
	{
		return null;
	}
}
