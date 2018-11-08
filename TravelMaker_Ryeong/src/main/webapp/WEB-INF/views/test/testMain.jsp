<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
    <title>Test Main</title>

    <style>

    </style>

    <script>
        var data = {testCol : "Json Test Data"};

        $(document).ready(function(){
            $("#ajaxBtn").on("click",function(){
                $.ajax({
                    url: "<c:url value='/test/ajaxTest.do'/>",
                    type: "post",
                }).done(function(result){
                    console.log(result);
                    alert("Ajax 통신성공!\n" + result);
                    $("#ajaxExample").text( result );
                }).fail(function(){
                    alert("통신이 원할하지 않습니다.");
                });
            });

            $("#jsonBtn").on("click",function(){
                $.ajax({
                    url: "<c:url value='/test/jsonTest.do'/>",
                    type: "post",
                    contentType: "application/json;charset=UTF-8", // Json형식의 데이터를 보내준다고 명시하기 위해 선언.
                    data: JSON.stringify(data),                       // 서버로 전송할 데이터를 넣어줌 JavaScript객체를 Json객체로 변환시켜 줌.
                    dataType: "json"                               //return할 데이터 타입이 json거라면 사용
                }).done(function(result){
                    console.log(result);
                    alert("Json 통신성공!\n" + result.key);
                    $("#jsonExample").text(result.key);
                }).fail(function(){
                    alert("통신이 원할하지 않습니다.");
                });
            });
        });
    </script>
<%@ include file="/WEB-INF/include/include-bodyHeader.jspf" %>
<%@ include file="/WEB-INF/views/common/include/left_.jsp" %>
<%@ include file="//WEB-INF/views/common/include/top_.jsp" %>
    <section class="vbox main">
        <span>ㅇ${test}</span> <br><br>

        <span>ㅇAjax 통신 예제</span><br>
        <p id="ajaxExample"></p><br>
        <button type="button" id="ajaxBtn">클릭 시 Ajax통신으로 DB에서 데이터를 가져옵니다.</button>
        <br><br>

        <span>ㅇJson 예제</span><br>
        <p id="jsonExample"></p><br>
        <button type="button" id="jsonBtn">클릭 시 Ajax통신 + Json형태로 데이터를 보내고 DB에서 데이터를 가져와 JSON객체 형태로 가져옵니다.</button>
        <br><br>
    </section>
<%@ include file="/WEB-INF/include/include-bodyFooter.jspf" %>
