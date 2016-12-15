
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Country</title>
    <script type="text/javascript" src="/resources/js/jquery-3.1.1.min.js"></script>
</head>
<body>

<input type="hidden" name="csrf_name"
       value="${_csrf.parameterName}" />
<input type="hidden" name="csrf_value"
       value="${_csrf.token}" />


<a href="home">home</a>

    <div style="text-align: center; margin-top: 20%">
        <input id="nameCountry" placeholder="country name">
        <br>
        <button id="saveCountry">save country</button>
    </div>



<script>
    $(function () {
        $('#saveCountry').click(function () {

            var country = {
                name : $('#nameCountry').val()
            }

            $('#nameCountry').val("");

            $.ajax({
                url : "/newCountry?"+$('input[name=csrf_name]').val()+"="+$('input[name=csrf_value]').val(),
                contentType: "application/json; charset=UTF-8",
                type: "POST",
                data: JSON.stringify(country),
                success: function (res) {
                    alert(res.name)
                }
            });

        })
    });
</script>


    <%--<div style="text-align: center; margin-top: 20%">--%>
        <%--<form action="newCountry" method="post">--%>
            <%--<input name="name" placeholder="country name">--%>
            <%--<br>--%>
            <%--<br>--%>
            <%--<button>save country</button>--%>
        <%--</form>--%>
    <%--</div>--%>
</body>
</html>