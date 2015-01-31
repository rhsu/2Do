package twoDo.servlets.taskServlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelsExperimental.UserTask;
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
		List<TaskTemp> tasks = provider.getTasks(-1);
		
		request.setAttribute("tasks", tasks);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		processRequest(request, response);
		/*List<String> products = new ArrayList<>();
		
		products.add("Car");
		products.add("Guns");
		products.add("Shades");
		
		request.setAttribute("products", products);*/
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		//processRequest(request, response);
	}
}