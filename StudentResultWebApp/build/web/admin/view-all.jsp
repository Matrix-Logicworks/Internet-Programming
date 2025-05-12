<%-- 
    Document   : view-all
    Created on : 12 May 2025, 4:59:11 PM
    Author     : Dikot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>All Students</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <h2>All Students and Results</h2>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Student ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Subject</th>
                        <th>Marks</th>
                        <th>Grade</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="student" items="${students}">
                    <c:set var="rowspan" value="${student.results.size() > 0 ? student.results.size() : 1}"/>
                    <c:forEach var="result" items="${student.results}" varStatus="status">
                        <tr>
                        <c:if test="${status.first}">
                            <td rowspan="${rowspan}">${student.studentId}</td>
                            <td rowspan="${rowspan}">${student.name}</td>
                            <td rowspan="${rowspan}">${student.email}</td>
                        </c:if>
                        <td>${result.subject}</td>
                        <td>${result.marks}</td>
                        <td>${result.grade}</td>
                        </tr>
                    </c:forEach>
                    <c:if test="${empty student.results}">
                        <tr>
                            <td>${student.studentId}</td>
                            <td>${student.name}</td>
                            <td>${student.email}</td>
                            <td colspan="3">No Results</td>
                        </tr>
                    </c:if>
                </c:forEach>
                </tbody>
            </table>
            <a href="admin-dashboard.jsp" class="btn btn-secondary">Back</a>
        </div>
    </body>
</html>
