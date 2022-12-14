<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.springbootjsp.dao.ChangDuaDAO584"
        import="com.example.springbootjsp.model.*, java.util.*"
%>
<%@ page import="com.example.springbootjsp.model.ThanhVien584" %>
<%@ page import="com.example.springbootjsp.dao.ThanhVienDAO584" %>
<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

                background-image: url(https://d9n64ieh9hz8y.cloudfront.net/wp-content/uploads/20180525120241/codemasters-cong-bo-tro-choi-dua-xe-f1-2018-tin-game.jpg);
                display: flex;
                align-content: center;
                justify-content: center;
                padding-top: 5%;
                position: relative;
            }
            .nav-bar {
                position: absolute;
                top: 10px;
                right: 20px;
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
                font-size: 1.3rem;
            }
        </style>
    </head>

    <body>
    <%
        String  username = "";
        String  password = "";
        if(request.getParameter("username") != null) {
            username = request.getParameter("username");
        }
        if(request.getParameter("password") != null) {
            password = request.getParameter("password");
        }
        String tendangnhap = "BTC";
        if(request.getParameter("password") != null && request.getParameter("username") != null) {
            ThanhVienDAO584 daoTv = new ThanhVienDAO584();
            tendangnhap = daoTv.dangNhap(username, password);
            if(tendangnhap == "") {
                %>
                    <script type="text/javascript">
                        alert("L???i ????ng nh???p! Vui l??ng ????ng nh???p l???i");
                        history.back();
                    </script>
                <%
            }
        }
    %>
    <div class="nav-bar">
        <!-- <h3><a href="btc">Trang ch???</a></h3> -->
        <h3 class="tenDangNhap">  <%=tendangnhap%> </h3>
    </div>
    <%--<input value="<%=tendangnhap%>" hidden name="tendangnhap">--%>
    <div class="btc-container">
        <h2 class="btc-title">Trang ch??? Ban T??? Ch???c ??ua Xe F1</h2>
        <div class="option-container">
            <a class="link-move" href="changdua">????ng k?? tay ??ua</a> <br>
            <a class="link-move" href="dsthidau">Danh s??ch thi ?????u</a> <br>
            <a class="link-move" href="#">C???p nh???t k???t qu??? ch???ng ??ua</a> <br>
            <a class="link-move" href="#">Xem b???ng x???p h???ng</a> <br>
            <a class="link-move" href="#">Qu???n l?? gi???i ??ua</a> <br>
            <a class="link-move" href="#">Qu???n l?? ch???ng ??ua</a> <br>
            <a class="link-move" href="#">Qu???n l?? ?????i ??ua</a> <br>
            <a class="link-move" href="#">Qu???n l?? tay ??ua</a> <br>
        </div>
    </div>
    </body>
</html>

