$(document).ready(function () {
    
    function isEmptyString(str) {
        return str.replace(/^\s+|\s+$/gm,'').length === 0;
    }
           
    var state = 'initial';
    
	var display = function () {
        
        $('#AddTaskForm_ErrorMessage').hide();
        
        if (state === 'form') {
            $('#initialPageState_AddTaskForm').hide();
            $('#formPageState_AddTaskForm').show();
        } else if (state === 'initial') {
            $('#initialPageState_AddTaskForm').show();
            $('#formPageState_AddTaskForm').hide();
        } else if (state === 'errorChecking') {
            $('#initialPageState_AddTaskForm').hide();
            errorChecking();
        } else {
            console.log(state);
            throw 'Invalid state' + state;
        }
    };
        
    // error checking
    var errorChecking = function () {
                
        var isNameEmpty = isEmptyString($('#AddTaskForm_txtName').val()),
            // isContentEmpty = isEmptyString($('#AddTaskForm_txtContent').val()),
            addTaskFormErrorMessage = '';

        if (isNameEmpty) {
            addTaskFormErrorMessage += 'Name cannot be empty <br />';
        }

        // content is an optional field but this is nice to have to demonstrate 
        // how easy it is to disable this error checking
        /*if (isContentEmpty) {
            addTaskFormErrorMessage += 'Content cannot be empty<br />';
        }*/

        if (addTaskFormErrorMessage === '') {
            $('#AddTaskForm').submit();
        } else {
            $('#AddTaskForm_ErrorMessage').show();
            $('#AddTaskForm_ErrorMessage').html(addTaskFormErrorMessage);
        }
    };
    
    // main
    display();
    
    // event listeners -- these transition the state
    $('#btnAddTask_AddTaskInitial').click(function (event) {
        state = 'form';
        display();
    });
    
    $('#btnX_AddTaskForm').click(function (event) {
        state = 'initial';
        display();
    });
    
    $('#btnAddTask_AddTaskForm').click(function (event) {        
        event.preventDefault();
        
        state = 'errorChecking';
        display();
    });
});