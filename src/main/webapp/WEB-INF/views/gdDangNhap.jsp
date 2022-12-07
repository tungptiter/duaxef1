<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dang nhap</title>
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
            .login-container {
                display: flex;
                flex-direction: column;
                align-items: center;

                padding-top: 5%;
                border-radius: 10px;
                background-color: #d9fff2;
                width: 30%;
                height: 500px;
            }
            .login-title {
                max-width: fit-content;
            }
            .login-btn {
                margin-top: 10px;
                margin-left: 50px;
            }
        </style>
    </head>
    <body>
        <%
            if (request.getParameter("err") != null && request.getParameter("err").equalsIgnoreCase("timeout")) {
        %> <h4>Hết phiên làm việc. Làm ơn đăng nhập lại!</h4><%
        } else if (request.getParameter("err") != null && request.getParameter("err").equalsIgnoreCase("fail")) {
        %> <h4 color="red">Sai tên đăng nhập/mật khẩu!</h4><%
            }
        %>
        <div class="login-container">
            <h3 class="login-title ">Đăng nhập</h3>
            <form class="login-input-container " name="dangnhap" action="btc" method="post">
                <input type="text" name="username" id="username" required placeholder="Nhập tên tài khoản"/><br>
                <input type="password" name="password" id="password" placeholder="Nhập mật khẩu" required class="mt-2"/><br>
                <button type="submit" class="login-btn btn btn-primary">Đăng nhập</button>
            </form>
        </div>
    </body>
</html>
