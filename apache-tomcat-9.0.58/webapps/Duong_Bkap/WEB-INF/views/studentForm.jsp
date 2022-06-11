<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
<form:form action="insertStudent" modelAttribute="stu"/>
<table>
  <tr>
    <td>Student ID:</td>
    <td><form:input path="stuId"/></td>
  </tr>
  <tr>
    <td>Full Name:</td>
    <td><form:input path="fullName"/></td>
    <tr>
    <td>Gender:</td>
    <td>
    	<form:input path="gender" value="true" label="Male"/>
    	<form:input path="gender" value="false" label="Female"/>
    </td>
  </tr>
  <tr>
    <td>Birthday:</td>
    <td><form:input path="birthday" type="date"/></td>
    <tr>
    <td>Address:</td>
    <td><form:input path="address"/></td>
  </tr>
</table>

</body>
</html>