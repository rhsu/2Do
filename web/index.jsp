<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2Do</title>
		<link rel="stylesheet" href="/2Do/css/bootstrap.css" />
		<link rel="stylesheet" href="/2Do/css/dashboard.css" />
		
		<!--scripts -->
		<script src="/2Do/js/jquery.js"></script>
		<script src="/2Do/js/bootstrap.js"></script>
		<script src="/2Do/js/AddTaskForm.js"></script>
    </head>
    <body>
		<jsp:include page="/includes/TopNavbar.jsp"/>
		
		<!-- TODO: Template this as as Sidebar -->
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 sidebar">
					<ul class="nav nav-sidebar">
						<li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
						<li><a href="#">Reports</a></li>
						<li><a href="#">Analytics</a></li>
						<li><a href="#">Export</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
										
					<c:import url="/DisplayTask" />
					
					<h2 class="sub-header">2Dos</h2>
					
					<jsp:include page="/includes/AddTaskForm.jsp" />

					<form method="post" action="EditTasks">					
						<table class="table table-striped">
							<thead>
								<tr>
									<th>#</th>
									<th><input type="checkbox" /> Name</th>
									<th>Description</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items= "${tasks}" varStatus="i">
									<tr>
										<td>${i.getIndex()+1}</td>
										<td>
											<input type="checkbox" name="id" value={item.getName()}/>
											${item.getName()}
										</td>
										<td>${item.getContent()}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</form>
			</div>
		</div>
    </body>
</html>