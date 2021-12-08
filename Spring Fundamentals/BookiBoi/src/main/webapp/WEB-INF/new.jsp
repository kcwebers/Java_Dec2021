<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title Here</title>
  <!-- Bootstrap -->
  <link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous">
</head>
<body>
    <div class="container">
        
		<h1>New Book</h1>
		<form:form action="/create" method="post" modelAttribute="banana">
		    <p>
		        <p><form:label path="title">Title</form:label></p>
		        <p class="text-danger" ><form:errors path="title"/></p>
		        <form:input path="title"/>
		    </p>
		    <p>
		        <form:label path="description">Description</form:label>
		        <form:errors path="description"/>
		        <form:textarea path="description"/>
		    </p>
		   	<p>
		        <form:label path="language">Language</form:label>
		        <form:errors path="language"/>
		        <form:textarea path="language"/>
		    </p>
		    <p>
		        <form:label path="numberOfPages">Pages</form:label>
		        <form:errors path="numberOfPages"/>     
		        <form:input type="number" path="numberOfPages"/>
		    </p>    
		    <input type="submit" value="Submit"/>
		</form:form>   
		
		<c:forEach var="book" items="${books}">
        	<h2><c:out value="${book.title}"></c:out></h2>
        	<p>Number of Pages: <c:out value="${book.numberOfPages}"></c:out></p>
        	<p>Written in: <c:out value="${book.language}"></c:out></p>
        	<p>Description: <c:out value="${book.description}"></c:out></p>
        </c:forEach>
         



	</div>
</body>
</html>