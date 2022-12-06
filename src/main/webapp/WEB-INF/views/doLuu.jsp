
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
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .container-form {
            margin-top: 200px;
            height: 200px;
            background: #acf9df;
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
            boolean check = dao.luuDangKy(tdc);
            if (!check) {
                %>
                <script type="text/javascript">
                    alert("Lỗi lưu đăng ký tay đua 1! Vui lòng đăng ký lại");
                    history.back();
                </script>
                <%
            }

            TayDuaChang584 tdc2 = new TayDuaChang584(5,"55","s55",0,0,0, idChangDua, idTayDua2);
            boolean check2 = dao.luuDangKy(tdc2);
            if (!check2) {
                %>
                <script type="text/javascript">
                    alert("Lỗi lưu đăng ký tay đua 2! Vui lòng đăng ký lại");
                    history.back();
                </script>
                <%
            }

            if (check && check2) {

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