<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.book {
    margin: 10px;
    border: 2px solid black;
    padding: 21px;
    height: 225px;
    position: relative;
    display: block;
    background-color: #eff5f4;
}

.buy {
    background-color: grey;
    color: white;
    border: 1px solid #670606;
    padding: 10px;
}
</style>
</head>
<body>

<jsp:include page="header.jsp" ></jsp:include>
<jstl:forEach var="books" items="${sessionScope.books}">
	
			<div class="book">
			<div style="float: left; width: 23%; text-align: center;">
				<img src="images/${books.link}" height="200" width="150">
			</div>
			<div style="float: left;width: 42%;border-right: 1px dashed;height;height: 100%;">
				<h3 align="left">${books.bookName}</h3>
				<h4 align="left">${books.authorName}</h4>
				<h6>${books.description}</h6>
			</div>
			<div style="float: left;width: 33%;text-align: center;padding-top: 35px;">
				<h2 style="color:green">Rs. ${books.price}</h2>
				<a class="buy" href="add.app?bookId=${books.bookId}">Buy</a>
			</div>
			 
			
			</div>
		
		</jstl:forEach>
	
</body>
<jsp:include page="footer.jsp" ></jsp:include> 
</html>