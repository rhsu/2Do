package twoDo.servlets.taskServlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twoDo.models.TaskTemp;
import twoDo.providers.TaskTempProvider;

public class AddTaskServletPoC extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{			
		String url = "/tempIndex.jsp";
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
		TaskTemp task = new TaskTemp(name, content);
		
		provider.createTask(0, task);
		processRequest(request, response);
	}
}
