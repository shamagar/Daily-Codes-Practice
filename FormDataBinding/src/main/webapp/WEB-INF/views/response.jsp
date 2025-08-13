<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Success</title>
</head>
<body>
<center>
    <h1>Your information has been received in the backend application, and we could able to get that data</h1>
    <h2 style="color:red">ID:: ${info.id}</h2>
    <h2 style="color:purple">First Name:: ${info.firstName}</h2>
    <h2 style="color:green">Last Name:: ${info.lastName}</h2>
    <h2 style="color:deeppink">city:: ${info.city}</h2>
    <h2 style="color:cyan">Salary :: ${info.salary}</h2>
</center>

</body>
</html>