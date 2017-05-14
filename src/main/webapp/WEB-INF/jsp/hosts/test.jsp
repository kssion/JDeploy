<%--
  Created by IntelliJ IDEA.
  User: Chance
  Date: 2017/5/13
  Time: 下午12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <title>test</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/materialize/0.97.0/css/materialize.min.css">
    <link href="${pageContext.request.contextPath}/resources/css/icon.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/materialize/0.97.0/js/materialize.min.js"></script>
</head>
<body style="font-family: 'Roboto', 'Droid Sans Fallback', '微软雅黑'; min-height: 100vh;display: flex;flex-direction: column;">

<nav>
    <div class="nav-wrapper">
        <a href="${pageContext.request.contextPath}/" class="brand-logo center">JDeploy自动化部署平台</a>
    </div>
</nav>

<div class="container" style="padding-top: 20px; width: 90%;flex: 1 0 auto;">
    <div id="java-web-deploy" class="row">
        <div class="row">
            <div class="input-field col s12 m4">
                <a class="waves-effect waves-light btn red lighten-2" href="${pageContext.request.contextPath}/hosts/new" style="line-height: 64px; height: 64px;">创建</a>
            </div>
        </div>
        <table class="hoverable">
            <thead>
            <tr>
                <td>主机名称</td>
                <td>主机ID</td>
                <td>路径</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${javaHostList}">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.hostId}</td>
                    <td>${item.path}</td>
                    <td><a href="${pageContext.request.contextPath}/hosts/${item.hostId}" class="btn waves-effect waves-light red lighten-2">管理</a></td>
                    <%--<td><a href="${pageContext.request.contextPath}/${item.path}" class="btn waves-effect waves-light red lighten-2">管理</a></td>--%>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<footer class="page-footer" style="padding-top: 0; margin-top: 40px;">
    <div class="footer-copyright">
        <div class="container">
            Copyright © 2016 <a class="grey-text text-lighten-4" href="http://xxgblog.com" target="_blank">http://xxgblog.com</a>. All rights reserved.
            <a class="grey-text text-lighten-4 right" href="https://github.com/wucao/JDeploy" target="_blank">GitHub</a>
        </div>
    </div>
</footer>

</body>
</html>
