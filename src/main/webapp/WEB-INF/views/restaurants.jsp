<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista restauracji</title>
</head>
<body>
<h1>Lista restauracji</h1>
<table>
    <tr>
        <th>Lp.</th>
        <th>Nazwa</th>
        <th>Menu</th>
        <th>Akcje</th>
    </tr>
    <c:forEach items="${restaurants}" var="restaurant" varStatus="stat">
      <tr>
          <td>${stat.count}</td>
          <td>${restaurant.name}</td>
          <td>${restaurant.menu}</td>
          <td></td>
      </tr>
    </c:forEach>
</table>
</body>
</html>
