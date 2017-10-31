<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="Vaibhav Naik">
	<link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/materialize.css"/>"  media="screen,projection"/>
	<title>Mavericks : Home</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main>
		<div class="row">
			<h4>Message Coming soon</h4>
		</div>
	</main>
	<jsp:include page="footer.jsp"></jsp:include>
	<script type="text/javascript"
		src="<c:url value="/resources/js/api/jquery-3.1.1.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/api/materialize.js"/>"></script>
</body>
</html>