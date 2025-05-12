<%-- 
    Document   : add-result
    Created on : 12 May 2025, 4:58:25 PM
    Author     : Dikot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add Result</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Add Result</h2>
            <form method="POST" action="../AdminServlet?action=addResult" class="mt-3">
                <div class="mb-3">
                    <label for="studentId" class="form-label">Student ID</label>
                    <input type="text" class="form-control" id="studentId" name="studentId" required>
                </div>
                <div class="mb-3">
                    <label for="subject" class="form-label">Subject</label>
                    <input type="text" class="form-control" id="subject" name="subject" required>
                </div>
                <div class="mb-3">
                    <label for="marks" class="form-label">Marks</label>
                    <input type="number" class="form-control" id="marks" name="marks" required>
                </div>
                <button type="submit" class="btn btn-primary">Add Result</button>
            </form>
            <a href="admin-dashboard.jsp" class="btn btn-secondary mt-3">Back</a>
        </div>
    </body>
</html>