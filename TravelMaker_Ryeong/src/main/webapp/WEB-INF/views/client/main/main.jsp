<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
    <title>Main</title>
    <style>
    </style>

    <script>
    </script>
<%@ include file="/WEB-INF/include/include-bodyHeader.jspf" %>
<%@ include file="/WEB-INF/views/common/include/left_.jsp" %>
<%@ include file="/WEB-INF/views/common/include/top_.jsp" %>
    <section class="vbox main">
   <%-- <jsp:include page="/test/testMain.do"/>--%>
        <iframe src="/test/testMain.do" width="100%" height="100%"/>
    </section>
<%@ include file="/WEB-INF/views/common/include/bottom_.jsp" %>
<%@ include file="/WEB-INF/include/include-bodyFooter.jspf" %>

