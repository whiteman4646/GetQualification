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
		else if(("muri").equals(obj) || ("Num").equals(obj)){%>
		<p style=" color:red">IDが文字型じゃないじゃないですかやだー</p>
		<%}
		s.setAttribute("login", null);
		%>
	<form action="LoginServlet" method="post">
		学籍番号：<input type="text" name="id">
		パスワード：<input type="password" name="password">
		<input type="submit" value="ログイン">
	</form>
	<p><a href="/StudentQualification/InsertServlet">新規ユーザー登録はこちら</a></p>
</body>
</html>