<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
		
		<h1>List of Products From Server</h1>
		
		<c:import url="/DisplayTaskServlet" />
		
		<c:out value="${products}"></c:out>
		
		
		<form method="post" action="AddTaskServlet">
			<label>Name<input type="text" name="name"/></label> <br />
			<label>Content<input type="text" name="content"/></label> <br />
			<button>Save</button>
		</form>
		
		<!--table>
			<td></td>
			
		</table-->
    
</html>
