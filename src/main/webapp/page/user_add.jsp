<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/24 0024
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增加用户</title>
    <style>
        input{
            display:block;
        }
    </style>
</head>
<body>
    <div>
        <input id="userName" name="userName" type="text" value="大头儿子"/>
        <input id="userPassword" name="userPassword" type="text" value="123456"/>
        <input id="userSex" name="userSex" type="text" value="男"/>
        <input id="userHome" name="userHome" type="text" value="家"/>
        <input id="userInfo" name="userInfo" type="text" value="大头大头"/>
        <input id="userEmail" name="userEmail" type="text" value="zxt_zel_npl@163.com"/>
        <input id="userMoney" name="userMoney" type="number" value="1000" />
    </div>
    <button id="add_btn">提交</button>
    <div id="show">

    </div>
</body>
<script src="../lib/jquery/dist/jquery.min.js"></script>
<script>
    var add_btn = $("#add_btn");
    add_btn.click(function(){
        $('#show').html("开始添加新用户");

        var data = {
            userName:$("#userName").val(),
            userPassword:$("#userPassword").val(),
            userSex:$("#userSex").val(),
            userHome:$("#userHome").val(),
            userInfo:$("#userInfo").val(),
            userEmail:$("#userEmail").val(),
            userMoney:$("#userMoney").val()
        };

        fetch('/user/add.do',{
            method:'POST',
            headers: {
                'content-type': 'application/json'
            },
            body:JSON.stringify(data)
        })
            .then(function(res){
                console.log(res);
                return res.json()
            })
            .then(function(json){
                console.log(json);
                $('#show').html("新用户添加成功");
            })
    })
</script>
</html>
