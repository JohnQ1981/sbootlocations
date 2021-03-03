<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div><h2>Locations</h2></div>
<table>
<tr>
<th>Id:</th>
<th>code:</th>
<th>name:</th>
<th>type:</th>


<c:forEach var ="location" items = "${locations}" >
<tr>
<td> ${location.id}   </td>
<td> ${location.code}  </td>
<td> ${location.name}  </td>
<td> ${location.type}  </td>
<td><a href="deleteLocation?id=${location.id}">Delete Location</a></td>
<td><a href="showUpdate?id=${location.id}">Edit/Update Location</a></td>

</tr>


</c:forEach>

</table>

<div> <h2> <a href="create">Add Record to Location Table</a></h2></div>

<div><a href="test">Go to Test Page</a></div>

</body>
</html>