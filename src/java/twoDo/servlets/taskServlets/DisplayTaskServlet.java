package twoDo.servlets.taskServlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twoDo.models.TaskTemp;
import twoDo.providers.TaskTempProvider;

/**
 *
 * @author robert
 */
public class DisplayTaskServlet extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		TaskTempProvider provider = new TaskTempProvider();
		int userId = -1;
		List<TaskTemp> tasks = provider.getTasks(userId);
		
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
