<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style>
			* {
				box-sizing?: border-box;
			}
			
			html,
			body {
				width:100%;
				height:100%;
				margin:0;
				background-color: #cccef7;
				font-family: 'Roboto', sans-serif;
			}
			
			.shopping-cart {
				width: 750px;
				height: auto;
				margin: 80px auto;
				background: #FFFFFF;
				box-shadow: 1px 2px 3px 0px rgba(0,0,0,10);
				border-radius: 6px;
				display: flex;
				flex-direction:column;
			}
			
			.title {
			    height: 60px;
			    border-bottom: 1px solid #E1E8EE;
			    padding: 16px;
			    font-size: 28px;
			}
			
			.item {
			padding: 20px 30px;
			height: 120px;
			display:flex;
			border-top: 2px solid;
			}
			
			.buttons {
			position: relative;
			padding-top: 30px;
			margin-right:60px;
			}
			
			.delete-btn {
			display: inline-block;
			cursor: pointer;
			width; 18px;
			height:17px;
			color: #c51919;
			}
			
			.description{
				padding-top: 10px;
				margin-right: 60px;
				width: 115px;
				padding-left: 66px;
			}
			
			.description span {
				display: block;
				font-size: 14px;
				color: #43484D;
				font-weight: 400;
			}
			
			.description span: first-child {
				margin-bottom: 5px;
			}
			
			.quantity {
				padding-top: 20px;
				margin-right: 60px;
			}
			
			.total-price {
				 width: 83px;
				 padding-top: 27px;
				 text-align: center;
				 font-size: 16px;
				 color: #43484D;
				 font-weight: 300;
			}
		</style>
	</head>
	<body>
		<jsp:include page="header.jsp" ></jsp:include>
		<div class="shopping-cart">
			<div class="title">
				Shopping Bag
			</div>
			<jstl:if test="${sessionScope.cart.size()>0 }">
			<jstl:set var="total" value="0"/>
			<jstl:forEach var="cart" items="${sessionScope.cart}">
				<div class="item">
					<div class="buttons">
						<a href="remove.app?bookId=${cart.bookId}" class="delete-btn">Remove</a>
					</div>
					<div class="image">
						<img src="images/${cart.link}" height="100" width="75">
					</div> 
					<div class="description">
						<span style=" font-size: 15px;font-weight: bold;">${cart.bookName}</span>
						<span>${cart.authorName}</span>
					</div>
					<div class="quantity">
						<span>Count: ${cart.count}</span>
					</div>
					<div class="total-price">
						<span>Rs. ${cart.price*cart.count}</span>
					</div>
					<jstl:set var="total" value="${total+cart.price*cart.count}"/>
			
				</div>
			</jstl:forEach>
			<h3 style="color:green;align-content:  right;text-align: right;padding-right: 20px;">Total Amount: ${total}</h3>
			</jstl:if>
			<jstl:if test="${sessionScope.cart.size()<=0 }">
			<div class="item">
			<h3 align="center">Your Cart is Empty...</h3>
			</div>
			</jstl:if>
			
		</div>
			
	</body>
	<jsp:include page="footer.jsp" ></jsp:include>
</html>