<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Podsumowanie</title>
</head>
<body>
<h1>Gratulację!</h1>

<h2>Twoja restauracja jest już prawie gotowa do przyjęcia gości!</h2>

<h3>Pod poniższym linkiem możesz zacząć przygotowywać menu!</h3>
<c:url value="/restaurans/latest/menu" var="startMenuURL"/>
<a href="${startMenuURL}" style="text-blink: true">Zacznij tutaj!</a>
</body>
</html>
