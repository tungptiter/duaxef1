<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.springbootjsp.dao.DoiDuaDAO584"
        import="com.example.springbootjsp.model.*, java.util.*"
%>
<%@ page import="com.example.springbootjsp.dao.ChangDuaDAO584" %>
<%@ page import="com.example.springbootjsp.model.ThanhVien584" %>
<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chon chang dua</title>
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
            }
            .dd-container {
                display: flex;
                flex-direction: column;
                align-items: center;
                padding-top: 5%;
                border-radius: 10px;
                background-color: #d9fff2;
                width: 30%;
                height: 500px;
            }

            .form-select {
                min-width: 250px;
                height: 50px;
            }

            .btn-cancel {
                background-color: white;
                border-color: #828A99!important;
            }
            .link-back {
                color: black;
                text-decoration: none;
                cursor: pointer;
            }
            h5 {
                font-weight: 400;
            }
        </style>
    </head>

    <body>
        <%
            int  idChangDua = 1;
            if(request.getParameter("changdua") != null) {
                idChangDua = Integer.parseInt(request.getParameter("changdua"));
            }
            ChangDuaDAO584 daoCd = new ChangDuaDAO584();
            String diadiem = daoCd.getChangDuaTheoId(idChangDua);

            DoiDuaDAO584 dao = new DoiDuaDAO584();
            ArrayList<DoiDua584> listDoiDua584 = dao.getDSDoiDua();
        //    String tendangnhap = request.getParameter("tendangnhap");
        %>

        <div class="dd-container">
            <h2> Chọn Đội Đua </h2>
            <div class="info">
                <h5> Chặng đua: <%=diadiem%>  </h5>
            </div>
            <form class="mt-3" name="chondoidua" action="taydua" method="post"  modelAttribute="doidua">
                <select class="form-select" id="floatingSelectDd" name="doidua">
                    <option value="1" id="dd" selected>Chọn đội đua</option>
                    <%
                        for (DoiDua584 dd : listDoiDua584) {
                            %>
                            <option value="<%=dd.getId()%>"><%=dd.getTen()%></option>
                            <%
                        }
                    %>
                </select>
                <input value="<%=idChangDua%>" hidden name="idChangDua">
        <%--        <input value="<%=tendangnhap%>" hidden name="tendangnhap">--%>
                <button type="button" class="mt-3 btn btn-cancel" style="float:left">
                    <a class="link-back" href="changdua">Quay Lại</a>
                </button>
                <button type="submit" class="mt-3 btn btn-primary" style="float:right">Tiếp tục</button>
            </form>
        </div>

        <script>
            function validateForm() {
                let dd = document.getElementByName("doidua").value;
                if(dd === ""){
                    alert("Vui lòng chọn đội đua");
                    return false;
                }
                return true;
            }
        </script>

    </body>
</html>
