<%--
  Created by IntelliJ IDEA.
  User: pavlo
  Date: 12.01.18
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>


<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/index">Agile Board</a>
        </div>
    </div>
</div>

<div class="container signup_form">
    <br>
    <br>
    <div class="col-lg-4 col-lg-offset-4">
        <div class="row cenxtered ">
            <h4 >Sign Up</h4>
            <form action="${pageContext.request.contextPath}/sign-up" method="post">
                <label>Email</label><br>
                <input type="text" value="your@email.com" name="email"><br>
                <label>Password</label><br>
                <input type="password" value="password" name="password"><br>
                <label>Repeat password</label><br>
                <input type="password" value="repeat_password" name="repeat_password"><br>
                <input type="submit" value="Sign Up"><br>
            </form>
        </div>
    </div>
</div>



<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
