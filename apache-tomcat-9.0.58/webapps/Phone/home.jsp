<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Product</title>
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
.col{display: flex;}
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
		<h1>Mobile Web Shop</h1>
		<hr>
		<div class = "grid-container">
			<c:forEach items="${list}" var="p">
				<div class="grid-item col">
					<div style="width: 50%">
						<a href="DetailPhone?mobileId=${p.mobileId}"><img alt=""
							src="/images/${p.image }" width="100%"></a>
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
			</c:forEach>
		</div>
		<a href="insert.jsp">Insert New Product</a>
		
	</div>
</body>
</html>