<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Spring Tag lib--%>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<center>
    <h1 style="color:red; text:center">Registration Application</h1>
    <from method = "post" id = "/register">
        <table>
            <tr>
                <th>Person Id</th>
                <td> <input type = 'text' name = "id"></td>
            </tr>
            <tr>
                <th>First Name</th>
                <td> <input type = 'text' name = "firstName"></td>
            </tr>
            <tr>
                <th>Last Name</th>
                <td> <input type = 'text' name = "lastName"></td>
            </tr>
            <tr>
                <th>City</th>
                <td> <input type = 'text' name = 'city'></td>
            </tr>
            <tr>
                <th>Salary</th>
                <td> <input type = 'Number' name = 'salary'></td>
            </tr>

            <tr>
                <td> <input type = 'submit' value = "Register"></td>
            </tr>
        </table>

    </from>
</center>

</body>
</html>