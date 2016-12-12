<%--
  Created by IntelliJ IDEA.
  User: koko
  Date: 15.10.16
  Time: 5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ingredient</title>
</head>
<body>
<a href="home">home</a>
    <div style="text-align: center; margin-top: 20%">
        <form action="newIngredient" method="post">
            <input name="name" placeholder="dish name">
            <br>
            <br>
            <input name="amount" placeholder="amount">
            <br>
            <br>
            <button>save dish</button>
        </form>
    </div>
</body>
</html>
