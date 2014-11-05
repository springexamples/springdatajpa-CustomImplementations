<html>
<body>
	<h2>Air Condition Management</h2>

	<p>
	<fieldset>
		<legend>Audit</legend>
		<a href="AirConditionServlet?action=audit" target="_blank">audit</a>
	</fieldset>
	<fieldset>
		<legend>Add new Air Condition</legend>
		<a href="AirConditionServlet?action=add" target="_blank">add</a>
	</fieldset>

	<fieldset>
		<legend>Show Air Condition</legend>
		<form action="AirConditionServlet" target="_blank">
			<input type="hidden" name="action" value="show" />
			<table>
				<tr>
					<td>id</td>
					<td><input name="id"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Show"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<fieldset>
		<legend>Update Air Condition</legend>
		<form action="AirConditionServlet" target="_blank">
			<input type="hidden" name="action" value="update" />
			<table>
				<tr>
					<td>id</td>
					<td><input name="id"></td>
				</tr>
				<tr>
					<td>field</td>
					<td><input type="radio" name="field" value="model">
						Model</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" name="field" value="year">
						Year</td>
				</tr>
				<tr>
					<td>value</td>
					<td><input name="value"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
