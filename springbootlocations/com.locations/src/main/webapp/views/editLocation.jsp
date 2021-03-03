<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Location</title>
</head>
<body>
<pre>
<form action="editLocation" method="post">
<div>
Id: <input type="text" name="id" value="${locations.id}" readonly/></div>

Code: <input type="text" name="code" value="${locations.code}"/>

Name: <input type="text" name="name" value="${locations.name}"/>
<div>
Type: Urban <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''} />

Type: Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/></div>

<input type="submit" value="save"/>
</pre>
</form>


</body>
</html>