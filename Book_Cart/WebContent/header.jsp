<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.foot {
	background-color: #80808061;
	color: white;
}
</style>
</head>


<body>
	<div class="foot" align="center">
		<h1><a href="index.jsp">Book Shopping Cart</a></h1>
	</div>

		<div align="right">
			<h3>
				<a href="view.app">Go to cart (${sessionScope.cart.size()}) </a>
			</h3>
		</div>
	

</body>

</html>