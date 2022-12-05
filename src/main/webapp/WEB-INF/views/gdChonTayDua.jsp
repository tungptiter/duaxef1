<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.springbootjsp.dao.ChangDuaDAO584"
        import="com.example.springbootjsp.model.*, java.util.*"
%>
<%@ page import="com.example.springbootjsp.dao.ChangDuaDAO584" %>
<%@ page import="com.example.springbootjsp.model.ThanhVien584" %>
<%@ page import="com.example.springbootjsp.dao.TayDuaDAO584" %>
<%@ page import="com.example.springbootjsp.dao.DoiDuaDAO584" %>
<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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

            display: flex;
            align-content: center;
            justify-content: center;
            padding-top: 5%;
        }
        .td-container {
            display: flex;
            flex-direction: column;
            align-items: center;

            padding-top: 5%;
            border-radius: 10px;
            background-color: #acf9df;
            width: 30%;
            height: 500px;
        }

        .form-select {
            min-width: 250px;
            height: 150px;
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
    </style>
</head>

<body>
<%
    int  idDoiDua = Integer.parseInt(request.getParameter("doidua"));
    DoiDuaDAO584 daodd = new DoiDuaDAO584();
    String tenDd = daodd.getTenDoiDuaTheoId(idDoiDua);
    TayDuaDAO584 dao = new TayDuaDAO584();
    ArrayList<TayDua584> listTayDua= dao.getDSTayDuaTheoDoiDua(idDoiDua);

    int  idChangDua = Integer.parseInt(request.getParameter("idChangDua"));
    ChangDuaDAO584 daoCd = new ChangDuaDAO584();
    String diadiem = daoCd.getChangDuaTheoId(idChangDua);
%>

<div class="td-container">
    <h2> Chọn Tay Đua </h2>
    <h4> Chặng đua: <%=diadiem%></h4>
    <h4> Đội đua: <%=tenDd%> </h4>
    <form name="chontaydua" action="doLuu" method="post"  modelAttribute="taydua">
        <select multiple size="2" class="form-select" id="floatingSelectTD" name="taydua">
            <option value="nguyen tung" selected>-Chọn tay đua-</option>
            <%
                for (TayDua584 td : listTayDua) {
                    %>
                    <option value="<%=td.getId()%>"><%=td.getTen()%></option>

                    <%
                }
            %>
        </select>

        <input value="<%=idChangDua%>" hidden name="idChangDua">
        <input value="<%=idDoiDua%>" hidden name="idDoiDua">

        <button type="button" class="mt-3 btn btn-cancel" style="float:left">
            <a class="link-back" href="doidua">Quay Lại</a>
        </button>
        <button type="submit" class="mt-3 btn btn-primary" style="float:right">Lưu</button>
    </form>
</div>
</body>
</html>
