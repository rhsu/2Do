package twoDo.servlets.taskServlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twoDo.models.Task;
import twoDo.models.UserTask;
import twoDo.services.UserTaskService;

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
		UserTaskService service = new UserTaskService();
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		boolean isDeleted = false;
		boolean isCompleted = false;
		int userId = -1;
		
		Task task = new UserTask(userId, name, content, isDeleted, isCompleted);
		
		service.insertTask(task);
		processRequest(request, response);
	}
}
