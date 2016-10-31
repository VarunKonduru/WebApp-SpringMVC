<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
                rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<div class = "container">
<br>Hello ${name} <br>

<table class="table table-striped">
	<thead>
	<tr>
		<th>UserID</th>
		<th>Description</th>
		<th>Date</th>
		<th>Completed</th>
	</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${todos}" var = "todo">
		<tr>
		<td>${todo.id}</td>
		<td>${todo.user_desc}</td>
		<td>${todo.targetDate}
		<td>${todo.done}</td>
		</tr>
		</c:forEach>
	</tbody>
	
</table>
<div>
	<a class="btn btn-success" href="/AddTodo">Add</a></div>
 </div>
</body>
</html>