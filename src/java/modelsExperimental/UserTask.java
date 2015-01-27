package modelsExperimental;

public class UserTask implements Task
{
	private final String name;
	private final String content;
	// private final int userId;
	
	public UserTask(String name, String content)
	{
		this.name = name;
		this.content = content;
	}

	@Override
	public String getName() { return this.name; }
	
	@Override
	public String getContent() { return this.content; }
}
