<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Welcome To Users Of 53by97</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>
<body>
	<ul class="toplinks">
		<li class="toplinks"><a href="/">Home</a></li>
		<li class="toplinks"><a href="/53by97app/interface/services">Services</a></li>
		<li class="toplinks"><a href="">About Us</a></li>
		<li class="toplinks lastli"><a href="mailto:admin@53by97.com">Contact
				Us</a></li>
	</ul>
	<!-- <img class="logo" alt="Old Books - Sell Them For Cash"
		src="resources/images/books_logo.jpg" /> -->
	<p class="pagedesc">
		Welcome to <span class="iob">53by97</span>.com
	</p>
	<div class="tabledesc">
		<h1>Contact List</h1>
		<table class="center" border="1">
			<tr>
				<th>No</th>
				<th>Username</th>
				<th>Email</th>
			</tr>

			<c:forEach var="user" items="${userList}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${user.username}</td>
					<td>${user.email}</td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
