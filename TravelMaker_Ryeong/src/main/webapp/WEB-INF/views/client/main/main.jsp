<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
    <title>Travel Maker</title>
    <style>
    </style>

    <script>
    </script>
<%@ include file="/WEB-INF/include/include-bodyHeader.jspf" %>

    <%request.getRequestDispatcher("/test/testMain.do").forward(request, response);%>

<%@ include file="/WEB-INF/include/include-bodyFooter.jspf" %>
