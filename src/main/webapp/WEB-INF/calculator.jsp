<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
<h2>Hello ${name}!</h2>
<form>
    <input name="number1"/>
    +
    <input name="number2"/>
    <input type="submit" value="calculate"/>
</form>

Result: ${param.number1} + ${param.number2} = ${result}
</body>
</html>
