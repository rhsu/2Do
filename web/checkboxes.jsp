<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<script src="/2Do/js/jquery.js"></script>
		<script src="/2Do/js/bootstrap.js"></script>
		<script>
			$(document).ready(function () {
				var parentState = $(this).prop('checked');
				
				$('#table-mater-checkbox-1').click(function () {
					
					if ($(this).prop('checked') !== parentState) {
						$(this).trigger('click');
					}
					
					$('table-checkbox-1').each(function () {
						if ($(this).prop('checked') !== parentState) {
							$(this).trigger('click');
						}
					});
				});
				
			});
		</script>
    </head>
    <body>
		<table>
			<tr>
				<th><input id="table-master-checkbox-1" type="checkbox" /></th>
				<th>Name</th>
				<th>Content</th>
			</tr>
			<tr>
				<td><input class="table-checkbox-1" type="checkbox" name="id" value="Shaq"/></td>
				<td>Shaq</td>
				<td>Content Here</td>
			</tr>
			<tr>
				<td><input type="checkbox" class="table-checkbox-1" name="id" value="Kobe"/></td>
				<td>Kobe</td>
				<td>More Content Here</td>
			</tr>
		</table>
    </body>
</html>