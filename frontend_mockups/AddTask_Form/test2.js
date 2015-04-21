$(document).ready(function () {
    
    function isEmptyString(str) {
        return str.replace(/^\s+|\s+$/gm,'').length === 0;
    }
        
    // state machine
    
    var state = 'initial';
    
	var display = function () {
        
        if (state === 'form') {
            $('#initialPageState_AddTaskForm').hide();
            $('#formPageState_AddTaskForm').show();
        } else if (state === 'initial') {
            $('#initialPageState_AddTaskForm').show();
            $('#formPageState_AddTaskForm').hide();
        } else if (state === 'errorChecking') {
            $('#initialPageState_AddTaskForm').hide();
        } else {
            console.log(state);
        }
    },
        
    // error checking
    var errorChecking = function () {
        
        var isNameEmpty = isEmptyString($('#AddTaskForm_txtName').val()),
            isContentEmpty = isEmptyString($('#AddTaskForm_txtContent').val()),
            addTaskFormErrorMessage = '';

        if (isNameEmpty) {
            addTaskFormErrorMessage += 'Name is empty<br/>';
        }

        // content is an optional field but this is nice to have to demonstrate 
        // how easy it is to disable this error checking
        /*if (isContentEmpty) {
            addTaskFormErrorMessage += 'Content is empty<br/>';
        }*/

        if (addTaskFormErrorMessage === '') {
            
        } else {
            
        }
    };
    
    // main
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
        errorChecking();
    });
});