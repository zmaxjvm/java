<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>

</head>


<html>
<body>
	<h1> ${groupName}</h1>

<br>
List products:
<br>
<c:forEach items="${list}" var="item">
    name -> ${item.getName()} &nbsp price -> ${item.getPrice()}
    <br>
</c:forEach>

</body>
</html>