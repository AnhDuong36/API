<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Product</title>
<style>
.center {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;

}
h1 {
	color: green;
}
</style>
</head>
<body>
	<div class="center">
		<h1>Mobile Web Shop</h1>
		<h3>Input Information Of Mobile</h3>
		<h3 style="color: red">${err }</h3>
		<form action="InsertPhone" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>Mobile name:</td>
					<td><input type="text" name="mobileName" required="required" /></td>
				</tr>
				<tr>
					<td>Price:</td>
					<td><input type="text" name="price" required="required" />
					</td>
				</tr>
				
				<tr>
					<td>Warranty:</td>
					<td><input type="text" name="warranty" required="required" /></td>
				</tr>
				<tr>
					<td>In_Out_Stock:</td>
					<td><input type="radio" name="status" value="true" />In <input
						type="radio" name="status" value="false" />Out </td>
				</tr>
				<tr>
					<td>Accessories:</td>
					<td><input type="text" name="accessories" required="required"/></td>
				</tr>
				<tr>
					<td>Image:</td>
					<td><input type="file" name="imglink" required="required"/></td>
				</tr>
				<tr>
					<td></td>

					<td><input type="submit" value="Insert" /> <input
						type="reset" value="Clear" /></td>
				</tr>
			</table>
		</form>
		<a href="index.jsp">Home</a>
	</div>
</body>
</html>