<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/24 0024
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>交易页面</title>
    <style>
        input{
            display:block;
        }
    </style>
</head>
<body>
    <div>
        <input id="tradeFrom" type="number" value="11">
        <input id="tradeTo" type="number" value="12">
        <input id="tradeMoney" type="number" value="100">
        <button id="btn_add">增加交易</button>
    </div>
</body>
<script src="../lib/jquery/dist/jquery.min.js"></script>
<script>
    $('#btn_add').click(function(){

        var data={
            tradeFrom:$("#tradeFrom").val(),
            tradeTo:$("#tradeTo").val(),
            tradeMoney:$("#tradeMoney").val()
        };

        fetch("/trade/add",{
            method:'POST',
            headers:{
                'content-type':'application/json'
            },
            body:JSON.stringify(data)
        })
            .then(function(res){
                return res.json()
            })
            .then(function(json){
                console.log(json)
            })
    })
</script>
</html>
