<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/StudentQualification/QualiInsertServlet" method="post">
		資格ID:<input type="text" name="id">
		資格名:<input type="text" name="sname">
		受験日:<input type="text" name="date">
		受験結果：<input type="text" name="result">
		<input type="submit" value="送信">
	</form>
</body>
</html>