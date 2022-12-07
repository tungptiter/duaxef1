<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.springbootjsp.dao.ChangDuaDAO584"
        import="com.example.springbootjsp.model.*, java.util.*"
%>
<%@ page import="com.example.springbootjsp.model.ThanhVien584" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trang chu BTC</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300;400&display=swap" rel="stylesheet">

    <style>
        body {

            display: flex;
            align-content: center;
            justify-content: center;
            padding-top: 5%;
        }

        .btc-container {
            display: flex;
            flex-direction: column;
            align-items: center;

            padding-top: 5%;
            border-radius: 10px;
            background-color: #d9fff2;
            width: 30%;
            height: 500px;
        }

        .btc-title {
            max-width: fit-content;
        }
        .option-container {
            width: 200px;
        }
        .link-move {
            color: black;
            text-decoration: none;
            cursor: pointer;
        }
    </style>
</head>

<body>
<%--<%--%>
<%--    ThanhVien tv = (ThanhVien) session.getAttribute("btc");--%>
<%--    if (tv == null) {--%>
<%--        response.sendRedirect("dangnhap.jsp?err=timeout");--%>
<%--    }--%>
<%--%>--%>

<div class="btc-container">
    <h2 class="btc-title">Danh sách thi đấu</h2>
<%--    <h3>Welcome, <%=tv.getHoten()%></h3>--%>
    <div class="option-container">

        
        <a class="link-move" href="changdua">Đăng ký thi đấu</a> <br>
        <a class="link-move" href="dsthidau">Đăng ký thi đấu</a> <br>
    </div>


</div>
</body>
</html>

