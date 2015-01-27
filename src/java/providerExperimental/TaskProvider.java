package providerExperimental;

import java.util.List;
import modelsExperimental.Task;

public interface TaskProvider<T extends Task>
{
	public void createTask(String name, String content);
	public void deleteTask();
	public List<T> getTasks(int userId);
}
