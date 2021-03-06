package twoDo.servlets.taskServlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twoDo.ApplicationWrapper;
import twoDo.api.Task;
import twoDo.api.TaskService;

/**
 *
 * @author robert
 */
public class DisplayTaskServlet extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		TaskService service = ApplicationWrapper
				.GetUserTaskServiceFactory()
				.createTaskService();
		
		List<Task> tasks = service.getTasks();
				
		request.setAttribute("tasks", tasks);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		processRequest(request, response);
	}
}
