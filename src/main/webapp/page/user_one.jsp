<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/23 0023
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserOne</title>
    <link rel="stylesheet" href="../css/user_one.css">
</head>
<body>
<p id="userName">${user.userName}</p>
<p id="userPassword">${user.userPassword}</p>
<p id="userSex">${user.userSex}</p>
<p id="userHome">${user.userHome}</p>
<p id="userInfo">${user.userInfo}</p>
<p id="userEmail">${user.userEmail}</p>

<div class="ajax-all">
    <div id="ajax1">
        <p>路径传参</p>
        <p class="url">/user_ajax_one/ajax1/ajax1</p>
        <p class="method">get</p>
        <button>AJAX1</button>
    </div>

    <div id="ajax2">
        <p>Query传参</p>
        <p class="url">/user_ajax_two?name=ajax2</p>
        <p class="method">get</p>
        <button>AJAX2</button>
    </div>

    <div id="ajax3">
        <p>表单格式提交数据</p>
        <p class="url">/user_ajax_three</p>
        <p class="content-type">application/x-www-form-urlencoded; charset=UTF-8</p>
        <p class="method">POST</p>
        <button>AJAX3</button>
    </div>

    <div id="ajax4">
        <p>JSON格式提交数据</p>
        <p class="url">/user_ajax_four</p>
        <p class="content-type">application/json</p>
        <p class="method">POST</p>
        <button>AJAX4</button>
    </div>
</div>

<div class="form_all">
    <form id="form_get" action="/user_form" method="get">
        <input name="userName" type="text">
        <input name="userPassword" type="text">
        <input name="userSex" type="text">
        <input name="userHome" type="text">
        <input name="userInfo" type="text">
        <input name="userEmail" type="text">
        <button id="submit_get">
            提交
        </button>
    </form>
    <form id="form_post" action="/user_form" method="post">
        <input name="userName" type="text">
        <input name="userPassword" type="text">
        <input name="userSex" type="text">
        <input name="userHome" type="text">
        <input name="userInfo" type="text">
        <input name="userEmail" type="text">
        <button id="submit_post">
            提交
        </button>
    </form>
</div>



</body>
<script src="../lib/jquery/dist/jquery.min.js"></script>
<script src="../javascript/user_one.js"></script>
</html>