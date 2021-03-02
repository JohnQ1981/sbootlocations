<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
<form action="saveLoc" method="post">
<div>
Id: <input type="text" name="id"/></div>

Code: <input type="text" name="code"/>

Name: <input type="text" name="name"/>
<div>
Type: Urban <input type="radio" name="type" value="URBAN"/>

Type: Rural <input type="radio" name="type" value="RURAL"/></div>

<input type="submit" value="save"/>
</pre>
</form>
${message}

</body>
</html>