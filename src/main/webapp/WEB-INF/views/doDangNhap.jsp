
<%@ page language="java" contentType="text/html"
         pageEncoding="UTF-8"
         import="java.util.ArrayList,com.example.springbootjsp.dao.*, com.example.springbootjsp.model.*"%>
<%@ page import="com.example.springbootjsp.model.ThanhVien584" %>
<%@ page import="com.example.springbootjsp.dao.ThanhVienDAO584" %>
<%
    String username = (String) request.getParameter("username");
    String password = (String) request.getParameter("password");

    System.out.println("in nnnnneee");
    System.out.println(username);
    System.out.println(password);
    console.log("hello");

    ThanhVien584 tv = new ThanhVien584();
    tv.setTendangnhap(username);
    tv.setMatkhau(password);

    ThanhVienDAO584 dao = new ThanhVienDAO584();
    boolean check = dao.dangNhap(tv);


    if (check) {
//        session.setAttribute("btc", tv);
        response.sendRedirect("gdChinhBTC.jsp");
    } else {
        response.sendRedirect("gdDangNhap.jsp?err=fail");
    }

//    if (check && (tv.getChucvu().equalsIgnoreCase("btc"))) {
//        session.setAttribute("btc", tv);
//        response.sendRedirect("gdChinhBTC.jsp");
//    } else if (check && (tv.getChucvu().equalsIgnoreCase("ql"))) {
//        session.setAttribute("ql", tv);
//        response.sendRedirect("gdChinhQL.jsp");
//    } else {
//        response.sendRedirect("gdDangNhap.jsp?err=fail");
//    }
%>
