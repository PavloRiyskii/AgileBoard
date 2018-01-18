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
                <h4 >Update element ${element.name}</h4>
                    <table>
                        <tr>
                            <td>
                                <label>Element Name</label>
                            </td>
                            <td>
                                <input type="text" value="${element.name}" name="name" id="name">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Element Description</label>
                            </td>
                            <td>
                                <input type="text" value="${element.description}" name="description" id="description">
                            </td>
                        </tr>
                        <tr>
                            <td/>
                            <td>
                                <input type="submit" value="Update" onclick="sendPatchRequest('${pageContext.request.contextPath}', '${boardId}', '${element.id}')"><br>
                            </td>
                        </tr>
                    </table>
            </div>
        </div>
    </div>

    <!--script>
        function sendPatchRequest() {
            var xhr = new XMLHttpRequest();
            var body = '?name=' +document.getElementById("name").value +
                '&description=' + document.getElementById("description").value + "&boardId=${boardId}";
            xhr.open("PATCH", "${pageContext.request.contextPath}/boards/${boardId}/elements/${element.id}" + body, false);
            xhr.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            xhr.send(null);
            window.location.href = '${pageContext.request.contextPath}/boards';
        }
    </script -->

    <script src="${pageContext.request.contextPath}/resources/js/update.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>

</body>
</html>
