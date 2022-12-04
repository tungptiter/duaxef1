<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.springbootjsp.dao.ChangDuaDAO584"
        import="com.example.springbootjsp.model.*, java.util.*"
%>
<%@ page import="com.example.springbootjsp.dao.ChangDuaDAO584" %>
<%@ page import="com.example.springbootjsp.model.ThanhVien584" %>

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
        .cd-container {
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
            height: 50px;
        }

        .btn-cancel {
            background-color: white;
            border-color: #828A99!important;
        }
    </style>
</head>

<body>
<%
//    ThanhVien tv = (ThanhVien) session.getAttribute("btc");
//    if (tv == null) {
//        response.sendRedirect("dangnhap.jsp?err=timeout");
//    }

    ChangDuaDAO584 dao = new ChangDuaDAO584();
    ArrayList<ChangDua584> listChangDua584 = dao.getDSChangDua();
    System.out.println(listChangDua584);
%>


<div class="cd-container">
    <h2> Chọn chặng đua </h2>
    <form name="chonchangdua" action="doidua" method="post" >
        <select class="form-select" id="floatingSelectCd" name="changdua">
            <option value="hanoi" selected>-Chọn chặng đua-</option>
            <%
                for (ChangDua584 cd : listChangDua584) {
            %>
            <option value="<%=cd.getId()%>"><%=cd.getThoigian()%></option>
            <%
                }
            %>
        </select>
        <button type="button" class="mt-3 btn btn-cancel" style="float:left">Quay lại</button>
        <button type="submit" class="mt-3 btn btn-primary" style="float:right">Tiếp tục</button>
    </form>
</div>
</body>
</html>
