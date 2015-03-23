$( document ).ready(function() {
	var formState = 'readonly';
	
	var determineNextState = function (state) {
		if (state === 'readonly') {
			state = 'post';
		} else if (state === 'post') {
			// state = 'readonly'
			// do nothing for now maybe clean this up later
			// posting to the server will trigger a reload so no need to determine the next state
		} else {
			throw 'Invalid State';
		}
		
		return state;
	};
	
	var determineStateFunctionality = function () {
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
		$('#AddTaskForm_ErrorMessage').hide();
	};
	
	var postToServerState = function () {
	};
	
	$('#btnAddTaskForm').click(function () {
		event.preventDefault();
		
		// clicking on the button transitions the state
		pageState = determineNextState(pageState);
		
		determineStateFunctionality();
		
	});	
	
	
	/*$('#btnAddTaskForm').click(function () {

	});*/
});