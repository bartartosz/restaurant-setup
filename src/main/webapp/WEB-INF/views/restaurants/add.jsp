<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="pages.add.restaurant.title"/></title>
</head>
<body>
<h1>Dodaj swoją restaurację</h1>
<form:form modelAttribute="restaurant" method="post">
    <p>Nazwa: <form:input path="name" required="true"/><form:errors path="name"/></p>cols
    <p>Opis: <form:textarea path="description" rows="6" ="80"/><form:errors path="description"/></p>
    <p>Adres: <form:input path="simpleAddress"/><form:errors path="simpleAddress"/></p>
    <p><form:button type="submit">Zarejestruj</form:button></p>
</form:form>
</body>
</html>
