$( document ).ready(function() {
	var formState = 'readonly';
	
	var determineNextState = function (state) {
		if (state === 'readonly') {
			state = 'post';
		} else if (state === 'post') {
			console.log('error checking!');
			// state = 'readonly'
			// do nothing for now maybe clean this up later
			// posting to the server will trigger a reload so no need to determine the next state
		} else {
			throw 'Invalid State';
		}
		
		return state;
	};
	
	var determineStateFunctionality = function (event) {
		event.preventDefault();
		
		if (formState === 'readonly') {
			readonlyState();

		} else if (formState === 'post') {
			postToServerState();
		} else {
			throw 'Invalid State';
		}
	
	};
	
	var readonlyState = function () {
		// hide form fields
		$('#AddTaskForm label').hide();
		$('#errorMessage_AddTaskForm').hide();
		$('#btnX_AddTaskForm').hide();
	};
	
	var postToServerState = function () {
		// display form fields
		$('#AddTaskForm label').show();
		// $('#errorMessage_AddTaskForm').hide();
		$('#btnX_AddTaskForm').show();
	};
	
	// end of variable declaration..
	
	readonlyState();
	
	$('#btnAddTask_AddTaskForm').click(function (event) {
		event.preventDefault();
		
		// clicking on the button transitions the state
		formState = determineNextState(formState);
		
		determineStateFunctionality(event);
	});	
	
	
	$('#btnX_AddTaskForm').click(function () {
		readonlyState();
	});
});
