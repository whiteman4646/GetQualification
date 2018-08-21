<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	Student result = (Student)request.getAttribute("insert");
	%>
	<p>登録完了しました</p>
	<p>ログイン画面へ</p>
</body>
</html>