<div id='initialPageState_AddTaskForm'>
	<button id='btnAddTask_AddTaskInitial' class='btn btn-primary'>Add Task</button>
</div>
<div id='formPageState_AddTaskForm'>
	<form id='AddTaskForm' method='post' action='AddTask'>
		<label>Name
			<input id='AddTaskForm_txtName' type='text' name='name' />
		</label>			
		<label>Content
			<input id='AddTaskForm_txtContent' type='text' name='content'/>
		</label>
		<button id='btnAddTask_AddTaskForm' class='btn btn-success'>
			<span class='glyphicon glyphicon-ok'></span>
		</button>
		<button type='reset' id='btnX_AddTaskForm' class='btn btn-danger'>
			<span class='glyphicon glyphicon-remove'></span>
		</button>
	</form>
	<p id="AddTaskForm_ErrorMessage" class="bg-danger"></p>
</div>