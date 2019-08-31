<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image form</title>
</head>
<body>

	<form:form method="post" modelAttribute="iob" action="re">

		<label>Id</label>

		<form:input path="id" />

		<label>Name</label>

		<form:input path="name" />

		<label>img</label>


		<form:label for="itemImage" path="img">itemImage:</form:label>
		<form:input path="img" type="file" />

		<input type="submit" value="submit">

	</form:form>


</body>
</html>