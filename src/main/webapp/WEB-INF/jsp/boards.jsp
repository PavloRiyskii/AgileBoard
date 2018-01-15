<%--
  Created by IntelliJ IDEA.
  User: pavlo
  Date: 13.01.18
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Boards</title>
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
                    <li class=""><a href="${pageContext.request.contextPath}/logout">Log Out</a></li>
                </ul>
            </div>
        </div>
    </div>

    <br>
    <br>
    <div class="container boards_zone centered">
        <div class="row">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Your Boards</h3>
                    <span class="pull-right"></span>
                </div>
                <div class="panel-body">
                    <div class="tab-content">
                        <div class="tab-pane active">
                            <table>
                                <tr>
                                    <c:forEach items="${boards}" var="board">
                                        <td class="table-data">
                                            <div>
                                                <div class="col-lg-4">
                                                    <div class="panel panel-default">
                                                        <!-- style="min-height: 40px; min-width: 250px; -->
                                                        <div class="panel-heading">
                                                            <h3>${board.name}</h3>
                                                        </div>
                                                        <div class="panel-body">
                                                            asd
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </td>
                                        </c:forEach>
                                    </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>





    <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
