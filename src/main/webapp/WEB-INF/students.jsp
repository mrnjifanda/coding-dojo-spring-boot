<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title><c:out value="${title}" /></title>

		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>

		<ul class="card m-5 p-5">
			 <c:forEach var="student" items="${students}">
			 	<c:choose>
			 		<c:when test="${student==\"Google\"}">
			 			<li class="alert alert-danger pb-2"><c:out value="${student}"></c:out></li>
			 		</c:when>
			 		<c:otherwise>
			 			<li class="alert alert-primary pb-2"><c:out value="${student}"></c:out></li>
			 		</c:otherwise>
			 	</c:choose>
		    </c:forEach>
		</ul>
	
	</body>
</html>
