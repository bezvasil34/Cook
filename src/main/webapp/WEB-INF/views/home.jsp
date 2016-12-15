<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib  uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <link  rel="stylesheet" href="resources/css/reset.css"/>

    <link  rel="stylesheet" href="resources/css/main-style-sheet.css"/>

    <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
    <script src="resources/js/chosen.jquery.min.js"></script>

    <link rel="shortcut icon" type="image/png" href="resources/images/logo-small.png"/>

    <link rel="stylesheet" href="resources/css/chosen.min.css">
    <link rel="stylesheet" type="text/css" href="resources/css/home.css">
    <link rel="stylesheet" type="text/css" href="resources/css/login_register_form.css">
    <script>
        $(function () {
            $("select[name=search]").chosen();
        })
    </script>
</head>

<body style="height: 2000px;">
<sec:authentication property="name"/>
<form:form action="logout" method="post">
    <button>logout</button>
</form:form>
<sec:authorize access="hasRole('ROLE_ADMIN')">
    <a href="admin">admnin</a>
</sec:authorize>


<div class="main" ng-app="myApp" ng-controller="mainCtrl as ctrl">
    <div class="search el1">

        <img src="resources/images/cookbook-big-logo.png" height="150"/>
        <br>
        <img src="resources/images/type-in-ingredients.png" height="100"/>
        <br>
        <div id="mainInput">
            <form:form action="/" method="GET">
                <select name="search" multiple style="width: 200px;">
                    <c:forEach var="ingredient" items="${ingredients}">
                        <option value="${ingredient.id}">${ingredient.name}</option>
                    </c:forEach>
                </select>
                <button type="submit" class="img-responsive center-block">Search</button>
            </form:form>
        </div>

    </div>
    <sec:authorize access="!isAuthenticated()">
    <div class="login-page el2">
        <div class="form">
            <form:form modelAttribute="user" action="registration" class="register-form">
                <form:input path="username" value="" type="text" placeholder="name"/>
                <form:input path="email" type="email" placeholder="email"/>
                <form:input path="password" type="password" placeholder="password"/>
                <button>create</button>
                <p class="message">Already registered? <a href="#">Sign In</a></p>
            </form:form>
            <form:form action="loginprocesing" class="login-form">
                <input name="username" type="text" placeholder="username"/>
                <input name="password" type="password" placeholder="password"/>
                <button>login</button>
                <p class="message">Not registered? <a href="#">Create an account</a></p>
            </form:form>
        </div>
    </div>
    </sec:authorize>
</div>


<script src="resources/js/login_register_form.js"></script>
</body>
</html>