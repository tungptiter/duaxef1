
<%@ page language="java" contentType="text/html"
         pageEncoding="UTF-8"
         import="java.util.ArrayList,com.example.springbootjsp.dao.*, com.example.springbootjsp.model.*"%>
<%@ page import="com.example.springbootjsp.model.ThanhVien584" %>
<%@ page import="com.example.springbootjsp.dao.ThanhVienDAO584" %>
<%
    String username = (String) request.getParameter("username");
    String password = (String) request.getParameter("password");

    ThanhVien584 tv = new ThanhVien584();
    tv.setTendangnhap(username);
    tv.setMatkhau(password);

    ThanhVienDAO584 dao = new ThanhVienDAO584();
    String check = dao.dangNhap(username, password);

    if (check != "") {
        response.sendRedirect("gdChinhBTC.jsp");
    } else {
        response.sendRedirect("gdDangNhap.jsp?err=fail");
    }
%>
