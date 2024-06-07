<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../welcome.jsp"></jsp:include>
	Users list
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="u">
						<tr>
							<td>${u.id} </td>
							<td>${u.firstName}</td>
							<td>${u.lastName}</td>
							<td>${u.email}</td>
						</tr>
					</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>