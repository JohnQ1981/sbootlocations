<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<% String [] testCforEach = {"A","B","c","D"}; %>
<table>
<c:forEach var = "item" items = "${testCforEach}" >
<tr>
<td>${var}</td>

</tr>
</c:forEach>
</table><h2>Hellos This is Test Page</h2>
</body>
</html> 