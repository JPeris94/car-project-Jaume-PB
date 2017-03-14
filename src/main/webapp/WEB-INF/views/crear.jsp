<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear coche</title>
</head>
<body>
	<form:form modelAttribute="coche">
        <div>
            <form:label path="modelo">modelo</form:label>
         	<div>
                <form:input path="modelo" />
            </div>
             <form:label path="fechaMatriculacion">fechaMatriculacion</form:label>
         	<div>
                <form:input path="fechaMatriculacion" />
            </div>
             <form:label path="precio">precio</form:label>
         	<div>
                <form:input path="precio" />
            </div>
            
            
            
            
            <button type="submit" >Buscar</button>
        </div>
    </form:form>
</body>
</html>