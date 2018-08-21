<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Qualitb"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8");
	ArrayList<Qualitb> QualiList = (ArrayList<Qualitb>)request.getAttribute("select");%>

	<table border="2">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Genre</th>
			<th>Price</th>
		</tr>
		<%for (Qualitb result : QualiList) {%>
		<tr align = "center">
		<td><%=result.getId()%></td>
		<td><%=result.getSname()%></td>
		<td><%=result.getDate()%></td>
		<td><%=result.getResult()%></td>
		</tr>
		<%} %>
	</table>
</body>
</html>