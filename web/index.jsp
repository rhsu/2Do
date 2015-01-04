<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2Do</title>
		<link rel="stylesheet" href="/2Do/css/bootstrap.css" />
		<link rel="stylesheet" href="/2Do/css/dashboard.css" />
    </head>
    <body>
		<!-- TODO: Template This as Top Navbar -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">2Do</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Dashboard</a></li>
					<li style="display: none"><a href="#">Settings</a></li>
					<li style="display: none"><a href="#">Profile</a></li>
					<li style="display: none"><a href="#">Help</a></li>
				</ul>
				<form hidden class="navbar-form navbar-right">
					<input class="form-control" placeholder="Search..." type="text">
				</form>
				</div>
			</div>
		</nav>
		
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
					<h2 class="sub-header">2Dos</h2>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>#</th>
								<th>Name</th>
								<th>Description</th>
							</tr>
						</thead>
						<tbody>
							<% for(int i = 0; i < 3; i++) { %>
							<tr>
								<td><%= i+1 %></td>							
								<td>Name</td>							
								<td>Description</td>
							</tr>
							<% } %>
						</tbody>
					</table>
			</div>
		</div>
		
		<!--scripts -->
		<script src="/2Do/js/jquery.js"></script>
		<script src="/2Do/js/bootstrap.js"></script>
    </body>
</html>
