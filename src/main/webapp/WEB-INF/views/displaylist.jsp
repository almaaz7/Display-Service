<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.almaaz.displayservice.model.Employee" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
    <h2>Employee List</h2>
    
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Number</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Employee> employees = (List<Employee>)request.getAttribute("employees");
                if (employees != null) {
                    for (Employee employee : employees) {
            %>
                <tr>
                    <td><%= employee.getId() %></td>
                    <td><%= employee.getName() %></td>
                    <td><%= employee.getSalary() %></td>
                    <td><%= employee.getNumber() %></td>
                </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>
</body>
</html>
