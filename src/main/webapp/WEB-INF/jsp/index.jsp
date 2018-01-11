<%--
  Created by IntelliJ IDEA.
  User: pavlo
  Date: 11.01.18
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agile Board</title>
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
                <a class="navbar-brand" href="${pageContext.request.contextPath}">Agile Board</a>
            </div>

            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class=""><a href="${pageContext.request.contextPath}/login">Log In</a></li>
                    <li class=""><a href="${pageContext.request.contextPath}/sign-up">Sign Up</a></li>
                    <li class=""><a href="${pageContext.request.contextPath}/about">About</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div id="headerwrap">
        <div class="container">
            <div class="row centered">
                <div class="col-lg-8 col-lg-offset-2">
                    <h1>Agile Board</h1>
                    <h2>Make your thinks more structured!!!</h2>
                </div>
            </div>
        </div>
    </div>

    <div class="container w">
        <div>
            <div class="col-lg-4">
                <h4>Some Title</h4>
                <p>Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!</p>
            </div>
        </div>
        <div>
            <div class="col-lg-4">
                <h4>Some Title</h4>
                <p>Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!</p>
            </div>
        </div>
        <div>
            <div class="col-lg-4">
                <h4>Some Title</h4>
                <p>Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!Some text!!!</p>
            </div>
        </div>
    </div>

    <div id="footer">
        <div class="container">
            <div class="row centered">
                <p>&copy; Pavlo Ritskii 2017</p>
            </div>
        </div>
    </div>


    <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
