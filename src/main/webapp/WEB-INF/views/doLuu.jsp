
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

</head>
<body>
<%
    int  idChangDua = Integer.parseInt(request.getParameter("changdua"));
    int  idTayDua = Integer.parseInt(request.getParameter("taydua"));


    TayDuaChang584 tdc = new TayDuaChang584(4,"4","s4",0,0,0, idChangDua, idTayDua);
    TayDuaChang584DAO dao = new TayDuaChang584DAO();
    boolean check = dao.luuDangKy(tdc);

    if (check) {
%>
<script type="text/javascript">
    confirm("Lưu kết quả thành công!");
    alert("ok con de");
</script>
<%
    //            response.sendRedirect("gdChinhBTC.jsp");
} else {
%>
<script type="text/javascript">
    alert("Lỗi lưu kết quả!");
    history.back();
</script>
<%
    }
%>
</body>
</html>