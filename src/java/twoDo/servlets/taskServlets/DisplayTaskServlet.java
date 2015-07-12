package twoDo.servlets.taskServlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twoDo.ApplicationWrapper;
import twoDo.api.Task;
import twoDo.services.UserTaskService;

/**
 *
 * @author robert
 */
public class DisplayTaskServlet extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		UserTaskService service = new UserTaskService(
			ApplicationWrapper.GetUserTaskService());
		
		int userId = -1;
		List<Task> tasks = service.getTasks(userId);
				
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
