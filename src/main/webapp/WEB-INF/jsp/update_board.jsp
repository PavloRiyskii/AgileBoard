<%--
  Created by IntelliJ IDEA.
  User: pavlo
  Date: 16.01.18
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Boards</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
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
                    <li class=""><a href="${pageContext.request.contextPath}/boards">Boards</a></li>
                    <li class=""><a href="${pageContext.request.contextPath}/logout">Log Out</a></li>
                </ul>
            </div>
        </div>
    </div>

    <div class="container">
        <br>
        <br>
        <div class="col-lg-4 col-lg-offset-4">
            <div class="row centered create-board">
                <h>Add new board</h>
                    <table>
                        <tr>
                            <td>
                                <label>Board Name</label>
                            </td>
                            <td>
                                <input type="text" value="${board.name}" name="name" id="name">
                            </td>
                        </tr>
                        <tr>
                            <td/>
                            <td>
                                <input type="submit" value="Update" onclick="sendPatchRequest('${pageContext.request.contextPath}', '${board.id}')"><br>
                            </td>
                        </tr>
                    </table>
            </div>
        </div>
    </div>

    <script src="${pageContext.request.contextPath}/resources/js/update_board.js"></script>
</body>
</html>
