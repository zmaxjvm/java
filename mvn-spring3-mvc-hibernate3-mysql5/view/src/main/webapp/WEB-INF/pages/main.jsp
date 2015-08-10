<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
</head>

<html>
<body>
	<h1>Message : ${message}</h1>
<br>
Group list:
<br>

<c:forEach items="${list}" var="item">
<a href="<c:url value="/product"/>?id=${item.getId()}">${item.getName()}</a>
  <br>
</c:forEach>

</body>
</html>