
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>


<html>
<head>
    <title>Ingredient</title>
</head>
<body>
<a href="home">home</a>
    <div style="text-align: center; margin-top: 20%">
        <sf:form action="saveIngredient" method="post">
            <input name="name" placeholder="dish name">
            <br>
            <br>
            <input name="amount" placeholder="amount">
            <br>
            <br>
            <button>save ingredient</button>
        </sf:form>
    </div>
</body>
</html>
