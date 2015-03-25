<!--button class="btn btn-primary" id="btnToggle_AddTaskForm">Create Task</button -->

<form id="AddTaskForm" method="post" action="AddTask"> <!--Action is AddTask -->
	<label>
		Name
		<input type="text" name="name" />
	</label>						
	<label>
		Content
		<input type="text" name="content"/>
	</label>
	<button id="btnDone_AddTaskForm" class="btn btn-primary">Add Task</button>
</form>

<p id="AddTaskForm_ErrorMessage" class="bg-danger">Please fill out both fields</p>

<script>
	
	var state = 'on';
	
	$("#AddTaskForm label").hide();
	$("#AddTaskForm_ErrorMessage").hide();
	
	$("#btnDone_AddTaskForm").click(function () {

		if (state === 'on') {
			$("#AddTaskForm label").show();
			state = 'off';
		} else {
			state = 'on';
		}
	});
	
	$("#btnDone_AddTaskForm").click(function () {
		event.preventDefault();
		
		var formElements = $("#AddTaskForm").serializeArray(),
			hasErrors = false;
		
		for (var i = 0; i < formElements.length; i++) {
			var elem = formElements[i];
			if (elem.value === '') {
				hasErrors = true;
			}
		};
		
		if (!hasErrors) {
			$("#AddTaskForm").submit();
		} else if (state === 'on') {
			$("#AddTaskForm_ErrorMessage").show();
		}
		
	});

</script>