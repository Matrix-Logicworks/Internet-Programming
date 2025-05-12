<%-- 
    Document   : delete-student
    Created on : 12 May 2025, 4:57:33 PM
    Author     : Dikot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Delete Student</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5 Search for Student">
            <h2>Delete Student</h2>
            <form method="POST" action="../AdminServlet?action=deleteStudent" class="mt-3">
                <div class="mb-3">
                    <label for="studentId" class="form-label">Student ID</label>
                    <input type="text" class="form-control" id="studentId" name="studentId" required>
                </div>
                <button type="submit" class="btn btn-danger">Delete Student</button>
            </form>
            <a href="admin-dashboard.jsp" class="btn btn-secondary mt-3">Back</a>
        </div>
    </body>
</html>