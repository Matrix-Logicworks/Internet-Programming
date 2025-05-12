<%-- 
    Document   : edit-student
    Created on : 12 May 2025, 4:55:22 PM
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
            <form method="GET" action="../AdminServlet" class="mt-3">
                <input type="hidden" name="action" value="findStudent">
                <div class="mb-3">
                    <label for="studentId" class="form-label">Student ID</label>
                    <input type="text" class="form-control" id="studentId" name="studentId" required>
                </div>
                <button type="submit" class="btn btn-primary">Find Student</button>
            </form>
            <a href="admin-dashboard.jsp" class="btn btn-secondary mt-3">Back</a>
        </div>
    </body>
</html>