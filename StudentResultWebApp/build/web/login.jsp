<%-- 
    Document   : login
    Created on : 12 May 2025, 4:50:32 PM
    Author     : Dikot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Login</h2>
            <form method="POST" action="j_security_check" class="mt-3">
                <div class="mb-3">
                    <label for="j_username" class="form-label">Student ID</label>
                <input type="text" class="form-control" id="j_username" name="j_username" required>
            </div>
            <div class="mb-3">
                <label for="j_password" class="form-label">Password</label>
                <input type="password" class="form-control" id="j_password" name="j_password" required>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</body>
</html>
