package models;

public class FakeTask implements Task
{
	private final String name;
	private final String content;
	
	public FakeTask(String name, String content)
	{
		this.name = name;
		this.content = content;
	}
	
	@Override
	public String getName() { return this.name; }
	
	@Override
	public String getContent() { return this.content; }
}
