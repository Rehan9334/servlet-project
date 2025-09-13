<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
 <div class="container">
        <h2 class="mt-4">Registered Students</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Course</th>
                </tr>
            </thead>
            <tbody>
                
                    <tr>
                        <td>${student.name}</td>
                        <td>${student.email}</td>
                        <td>${student.age}</td>
                        <td>${student.course}</td>
                    </tr>
                
            </tbody>
        </table>
        <a href="/StudentForm" class="btn btn-primary">Back to Form</a>
    </div>
</body>
</html>