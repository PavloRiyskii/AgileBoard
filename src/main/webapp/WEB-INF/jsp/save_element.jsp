<%--
  Created by IntelliJ IDEA.
  User: pavlo
  Date: 15.01.18
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add new element</title>
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

        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class=""><a href="${pageContext.request.contextPath}/boards" >Boards</a></li>
                <li class=""><a href="${pageContext.request.contextPath}/logout">Log Out</a></li>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <br>
    <br>
    <div class="col-lg-4 col-lg-offset-4">
        <div class="row centered create-element ">
            <h4 >Add new element</h4>
            <form action="${pageContext.request.contextPath}/boards/${boardId}/elements" method="post">
                <br>
                <table>
                    <tr>
                        <td>
                            <label>Element Name</Label>
                        </td>
                        <td>
                            <input type="text" value="Element Name" name="name">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Element Description</label>
                        </td>
                        <td>
                            <input type="text" value="Element Description" name="description">
                        </td>
                    </tr>
                    <tr>
                        <td/>
                        <td>
                            <input type="submit" value="Save"><br>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
