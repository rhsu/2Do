$(document).ready(function() {

    var state = 'initial';
    
	var display = function () {
        
        if (state === 'form') {
            $('#initialPageState_AddTaskForm').hide();
            $('#formPageState_AddTaskForm').show();
        }
        else if (state === 'initial') {
            $('#initialPageState_AddTaskForm').show();
            $('#formPageState_AddTaskForm').hide();
        }
        else {
            console.log(state);
        }
    };
    
    display();
    
    // event listeners
    
    $('#btnAddTask_AddTaskInitial').click(function () {
        state = 'form';
        display();
    });
    
    $('#btnX_AddTaskForm').click(function () {
        state = 'initial';
        display();
    });
    
    $('#btnAddTask_AddTaskForm').click(function () {
        event.preventDefault();
        console.log('error checking');
    });
});