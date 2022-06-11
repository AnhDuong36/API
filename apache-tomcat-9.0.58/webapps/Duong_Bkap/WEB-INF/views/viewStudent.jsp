<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>View</h1>
	<table>
		<tr>
			<td>Student ID:</td>
			<td>${stu.stuId}</td>
		</tr>
		<tr>
			<td>Full Name:</td>
			<td>${stu.fullName}</td>
		<tr>
			<td>Gender:</td>
			<td><${stu.gender?"Male":"Female"}</td>
		</tr>
		<tr>
			<td>Birthday:</td>
			<td>${stu.birthday}</td>
		<tr>
			<td>Address:</td>
			<td>${stu.address}</td>
		</tr>
	</table>

</body>
</html>