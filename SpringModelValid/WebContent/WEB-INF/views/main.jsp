<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="product">
	
		<label>Nombre: </label>
		<form:input type="text" name="name" path="name"/>
		<form:errors path="name" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Marca: </label>
		<form:input type="text" name="brand" path="brand"/><br>
		<form:errors path="brand" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Descripcion: </label>
		<form:input type="text" name="desc" path="desc"/>
		<form:errors path="desc" cssStyle="color:#E81505;"></form:errors><br><br>	
		
		<label>Categoria: </label>
		<form:input type="text" name="category" path="category"/>
		<form:errors path="category" cssStyle="color:#E81505;"></form:errors><br><br>	
		
		<label>Precio: </label>
		<form:input type="text" name="price" path="price"/>
		<form:errors path="price" cssStyle="color:#E81505;"></form:errors><br><br>	
		
		<label>Fecha de expiracion: </label>
		<form:input type="text" name="expire_date" path="expire_date"/>
		<form:errors path="expire_date" cssStyle="color:#E81505;"></form:errors><br><br>	
		
		
		<input type="submit" value="Agregar producto">
	</form:form>

</body>
</html>