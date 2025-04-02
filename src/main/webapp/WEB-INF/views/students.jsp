<!DOCTYPE html>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h2>Students</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>