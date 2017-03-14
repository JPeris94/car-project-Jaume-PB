<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar</title>
</head>
<body>
<h1>Todos los coches: </h1>
<table>
        <tr>
            <th>Matricula</th>
            <th>Modelo</th>
            <th>Fecha Matriculación</th>
            <th>Km</th>
            <th>Precio</th>
            <th>Editar</th>
        </tr>
        <c:forEach items="${Coche}" var="coche">
            <tr>
                
                <td><c:out value="${coche.matricula}"></c:out></td>
                <td><c:out value="${coche.modelo}"></c:out></td>
                <td><c:out value="${coche.fechaMatriculacion}"></c:out></td>
                <td><c:out value="${coche.km}"></c:out></td>      
            	<td><c:out value="${coche.precio}"></c:out></td>
            	<td><a href="AddCarrito?id=${coche.matricula}" >Editar</a></td>
                
            </tr>
        </c:forEach>
    </table>
    <a href="crear.jsp" >Crear coche</a>
</body>
</html>