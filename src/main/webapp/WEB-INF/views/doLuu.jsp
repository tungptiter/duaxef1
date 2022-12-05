
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
    String[] listThoigianvedich = request.getParameterValues("thoigianvedich");
    String[] listSovongduahoanthanh = request.getParameterValues("sovongduahoanthanh");
    String[] listDktdId = request.getParameterValues("dktdId");

    ArrayList<TayDuaChang584> list = new ArrayList<>();
    for (int i = 0; i < listDktdId.length; i++) {
        TayDuaChang584 dk = new TayDuaChang584();
        dk.setId(Integer.parseInt(listDktdId[i]));
        dk.setSovongduahoanthanh(Float.parseFloat(listSovongduahoanthanh[i]));
        dk.setThoigianvedich(Integer.parseInt(listThoigianvedich[i]));

        list.add(dk);
    }

    TayDuaChang584 dao = new DangKiThiDauDAO();
    boolean check = dao.luuKetQuaThiDau(list);

    if (check) {
%>
<script type="text/javascript">
    confirm("Lưu kết quả thành công!");
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