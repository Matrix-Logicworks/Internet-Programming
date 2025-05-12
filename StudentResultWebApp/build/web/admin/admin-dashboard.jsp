<%-- 
    Document   : admin-dashboard
    Created on : 12 May 2025, 4:53:35 PM
    Author     : Dikot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Dashboard</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Admin Dashboard</h2>
            <div class="list-group">
                <a href="add-student.jsp" class="list-group-item list-group-item-action">Add Student</a>
                <a href="edit-student.jsp" class="list-group-item list-group-item-action">Edit Student</a>
                <a href="delete-student.jsp" class="list-group-item list-group-item-action">Delete Student</a>
                <a href="add-result.jsp" class="list-group-item list-group-item-action">Add Result</a>
                <a href="../AdminServlet?action=viewAll" class="list-group-item list-group-item-action">View All Students</a>
            </div>
        </div>
    </body>
</html>