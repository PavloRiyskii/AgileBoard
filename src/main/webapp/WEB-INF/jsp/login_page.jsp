<%--
  Created by IntelliJ IDEA.
  User: pavlo
  Date: 12.01.18
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>

    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${pageContext.request.contextPath}/index">Agile Board</a>
            </div>
        </div>
    </div>

    <div class="container login_form">
        <br>
        <br>
       <div class="col-lg-4 col-lg-offset-4">
           <div class="row cenxtered ">
           <h4 >Log In</h4>
                <form action="${pageContext.request.contextPath}/login" method="post">
                    <input type="text" value="your@email.com" name="username"><br>
                    <input type="password" value="password" name="password" >
                    <br>
                    <input type="submit" value="Log In"><br>
                </form>
           </div>
       </div>
    </div>

</body>
</html>
