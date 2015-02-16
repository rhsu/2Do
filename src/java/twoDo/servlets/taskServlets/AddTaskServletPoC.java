package twoDo.servlets.taskServlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twoDo.models.TaskTemp;
import twoDo.models.TaskTempBuilder;
import twoDo.providers.TaskTempProvider;

public class AddTaskServletPoC extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{			
		String url = "/index.jsp";
        RequestDispatcher dispatcher =
             getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);   
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
		TaskTempProvider provider = new TaskTempProvider();
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		int userId = -1;
		
		TaskTemp task = new TaskTempBuilder()
			.setUserId(userId)
			.setContent(content)
			.setName(name)
			.buildTaskTemp();
		
		provider.insertTask(task);
		processRequest(request, response);
	}
}
