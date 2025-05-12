<%-- 
    Document   : view-result
    Created on : 12 May 2025, 5:01:45 PM
    Author     : Dikot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>My Results</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>My Results</h2>
        <h4>Student: ${student.name}</h4>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Subject</th>
                    <th>Marks</th>
                    <th>Grade</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="result" items="${results}">
                    <tr>
                        <td>${result.subject}</td>
                        <td>${result.marks}</td>
                        <td>${result.grade}</td>
                    </tr>
                </c:forEach>
                <c:if test="${empty results}">
                    <tr>
                        <td colspan="3">No Results Available</td>
                    </tr>
                </c:if>
            </tbody>
        </table>
        <a href="student-dashboard.jsp" class="btn btn-secondary">Back</a>
    </div>
</body>
</html>
