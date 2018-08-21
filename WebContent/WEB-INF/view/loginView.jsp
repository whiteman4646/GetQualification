<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
	<h1>ログイン情報入力</h1>
	<% HttpSession s = request.getSession(true);
		Object obj = s.getAttribute("login");
		if(("muri").equals(obj) || ("nai").equals(obj)){%>
		<p style=" color:red">ユーザ情報がありません。</p>
		<%}
		s.setAttribute("login", null);%>
	<form action="LoginServlet" method="post">
		ユーザーID<input type="text" name="id">
		パスワード<input type="text" name="pass">
	</form>
	<p><a href="/StudentQualification/InsertServlet">新規ユーザー登録はこちら</a></p>
</body>
</html>