
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Dish</title>
</head>
<body>

    <form:form modelAttribute="dish" action="newDish" method="post">

        <form:input path="name" placeholder="dish name"/>
        <br>
        <form:input path="recipe" placeholder="recipe"/>
        <br>
        <form:input path="story" placeholder="dish story"/>
        <br>
        <button>save dish</button>

    </form:form>




</body>
</html>
