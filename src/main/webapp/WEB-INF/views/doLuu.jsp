
<%@page import="java.util.Arrays"%>
<%@page import="java.lang.String"%>
<%@ page language="java" contentType="text/html"
         pageEncoding="UTF-8"
         import="java.util.ArrayList,com.example.springbootjsp.dao.*, com.example.springbootjsp.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">

    <style>
        body{
            background-image: url(https://d9n64ieh9hz8y.cloudfront.net/wp-content/uploads/20180525120241/codemasters-cong-bo-tro-choi-dua-xe-f1-2018-tin-game.jpg);
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .container-form {
            margin-top: 200px;
            height: 200px;
            background: #d9fff2;
            border-radius: 10px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .message-success {
            font-size: 25px;
        }
        .link-back {
            color: black;
            text-decoration: none;
            cursor: pointer;
        }
        .btn-ok {
            width: 130px;
            height: 50px;
            border-radius: 10px;
            background: white;
            margin-left: 60px;
            border: none;
        }
    </style>
</head>
<body>
    <%
        int  idChangDua = Integer.parseInt(request.getParameter("idChangDua"));

        if(request.getParameter("taydua") == null || request.getParameter("taydua2") == null) {
            %>
                <script type="text/javascript">
                    alert("Vui lòng chọn thêm tay đua nha");
                    history.back();
                </script>
            <%
        }
        else {
            int  idTayDua = Integer.parseInt(request.getParameter("taydua"));
            int  idTayDua2 = Integer.parseInt(request.getParameter("taydua2"));

            TayDuaChang584 tdc = new TayDuaChang584(4,"4","s4",0,0,0, idChangDua, idTayDua);
            TayDuaChang584DAO dao = new TayDuaChang584DAO();
            String check = dao.luuDangKy(tdc);
            System.out.println(check);
            if (check == "Lỗi đăng ký tay đua") {
                %>
                <script type="text/javascript">
                    alert("Lỗi lưu đăng ký tay đua 1! Vui lòng đăng ký lại");
                    history.back();
                </script>
                <%
            } else if (check == "Đã đăng ký") {
                %>
                    <script type="text/javascript">
                        alert("Tay đua 1 đã được đăng ký! Vui lòng chọn tay đua khác");
                        history.back();
                    </script>
                <%
            }

            TayDuaChang584 tdc2 = new TayDuaChang584(5,"55","s55",0,0,0, idChangDua, idTayDua2);
            String check2 = dao.luuDangKy(tdc2);
            if (check2 == "Lỗi đăng ký tay đua") {
                %>
                <script type="text/javascript">
                    alert("Lỗi lưu đăng ký tay đua 2! Vui lòng đăng ký lại");
                    history.back();
                </script>
                <%
            } else if (check2 == "Đã đăng ký") {
                %>
                    <script type="text/javascript">
                        alert("Tay đua 2 đã được đăng ký! Vui lòng chọn tay đua khác");
                        history.back();
                    </script>
                <%
            }

            if (check == "ok" && check2 == "ok") {
            }
        }
    %>

    <div class="container-form" style="width: 500px;">
        <div>
            <span class="message-success">Đăng ký tay đua thành công!</span>
        </div>
        <button type="button" class="mt-3 btn btn-ok " style="float:left">
            <a class="link-back" href="btc">OK</a>
        </button>
    </div>
</body>
</html>