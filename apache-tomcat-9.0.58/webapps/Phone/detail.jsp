<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.center {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}
.col{
display: flex;
}
.grid-container {
  display: grid;
  grid-template-columns: auto auto auto;
  padding: 10px;
}
.grid-item {
	border: 1px solid rgba(0, 0, 0, 0.8);
	padding: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<div class="center">
		<h1>Detail Employee</h1>
		<div class="grid-item col">
			<div style="width: 50%">
				<img alt=""
					src="/images/${p.image }"
					width="50%">
			</div>
			<div>

				<h3>${p.mobileName}</h3>
				<h3>
					<fmt:formatNumber value="${p.price}" />
				</h3>
				<h3>${p.warranty}</h3>
				<h3>${p.accessories}</h3>
				<h3>${p.status?"In Stock":"Out Stock"}</h3>
			</div>
		</div>
		<a href="index.jsp">Home</a>
	</div>
</body>
</body>
</html>