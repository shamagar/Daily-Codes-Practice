<%--
  Created by IntelliJ IDEA.
  User: shamagar
  Date: 8/11/25
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Response Page</title>
</head>
<body>
<center>
    <h1>Displaying the data from the array</h1>
    <b>Name of the Books are: </b>
    <c:forEach var = "nameOfBook" items = "${bookSet}">${nameOfBook}</c:forEach>

</center>


</body>
</html>
