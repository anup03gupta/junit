<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>


	<form action="TestServlet" method="get" name="frm">

		Enter num1: <input name="txt1" type="text" /> </br> 
		Enter num2: <input name="txt2" type="text" /> </br> 
		 Operator <select name="op">
			<option value="Addition">Addition</option>
			<option value="Subtraction">Subtraction</option>
			<option value="multiplication">multiplication</option>
			<option value="division">division</option>
		</select> </br>
		Result: <input name="txt3" type="text" /> </br> <input type="submit" value="submit" />

	</form>

</body>
</html>