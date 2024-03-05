<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form action="${pageContext.request.contextPath}/add">
		<table border="1" width="540px">
			<tr>
				<td>이름</td><td><input type="text" name="name"></td>
				<td>비밀번호</td><td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="4"><textarea cols="72" rows="5" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><button type="">등록</button></td>
			</tr>
		</table>
	</form>
	<br>

	<c:forEach items="${guestlist }" var="guestVo">
		<table border="1" width="540px">
			<tr>
				<td>${guestVo.bookId }</td>
				<td>${guestVo.name }</td>
				<td>${guestVo.date }</td>
				<td><a href="${pageContext.request.contextPath}/deleteform?no=${guestVo.bookId }">삭제</a></td>
			</tr>
			<tr>
				<td colspan="4">${guestVo.content }</td>
			</tr>
		</table>
	</c:forEach>

	<br>
</body>
</html>