<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<form method="post" action="AddTaskServlet">
			<label>Name<input type="text" name="name"/></label> <br />
			<label>Content<input type="text" name="content"/></label> <br />
			<button>Save</button>
		</form>
		
		<table>
			<td></td>
			
		</table>
    </body>
</html>
