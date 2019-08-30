<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form here</title>
</head>
<body>

	<form:form method="post" modelAttribute="em" action="r">

		<label>Id</label>

		<form:input path="id" />

		<label>Name</label>

		<form:input path="name" />

		<label>salary</label>

		<form:input path="salary" />

		<input type="submit" value="submit">

	</form:form>

</body>
</html>