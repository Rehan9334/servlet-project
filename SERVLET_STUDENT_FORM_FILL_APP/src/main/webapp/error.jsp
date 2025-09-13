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
        <h2 class="mt-4 text-danger">Error Occurred</h2>
        <p>${errorMessage}</p>
        <a href="/StudentForm" class="btn btn-primary">Back to Form</a>
    </div>
</body>
</html>