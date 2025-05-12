<%-- 
    Document   : edit-student-form
    Created on : 12 May 2025, 4:56:43 PM
    Author     : Dikot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit Student</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Edit Student</h2>
            <form method="POST" action="../AdminServlet?action=editStudent" class="mt-3">
                <input type="hidden" name="studentId" value="${student.studentId}">
                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" name="name" value="${student.name}" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" value="${student.email}" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password" value="${student.password}" required>
                </div>
                <button type="submit" class="btn btn-primary">Update Student</button>
            </form>
            <a href="admin-dashboard.jsp" class="btn btn-secondary mt-3">Back</a>
        </div>
    </body>
</html>
