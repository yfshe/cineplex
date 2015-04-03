<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
﻿<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="styles/login.css" rel="stylesheet" type="text/css">
</head>

<body>
<div id="main_content">
<div id="login_register_form">
  <div id="login_form">
  	<form action="loginAction" method="post">
    <p>
      <label for="textfield" id="login_mail_label">邮箱：</label>
      <input name="login.email" type="text" class="field_class" id="textfield" size="25">
        </p>
    <p>
      <label id="login_pw_label">密码：	</label>
      <input name="login.password" type="password" class="field_class" id="password" size="25">
    </p>
      <p>
        <input name="submit" type="submit" class="submit_button" id="login_submit" value="登录">
  </p>
</form>
  </div>
  <div id="register_form">
  <form action="registerAction" method="post">
    <p>不是会员？注册</p>
    <p>
      <label for="textfield2" id="register_name_label">用户名：</label>
      <input name="register.name" type="text" class="field_class" id="textfield2" size="25">
      <br>
    </p>
    <p>
      <label for="textfield3" id="register_mail_label">邮箱：</label>
      <input name="register.email" type="text" class="field_class" id="textfield3" size="25">
    </p>
    <p>
      <label for="password2" id="register_pw_label">密码：</label>
      <input name="register.password" type="password" class="field_class" id="password2" size="25">
    </p>
    <p>
      <label for="password3">重复密码：</label>
      <input name="password3" type="password" class="field_class" id="password3" size="25">
    </p>
    <blockquote>
      <p>
        <input name="submit2" type="submit" class="submit_button" id="register_submit" value="注册">
      </p>
    </blockquote>
   	</form>
  </div>
</div>

<div id="introduction">
  <h1><strong>欢迎来到 多厅电影院</strong></h1>
  <p>了解最新电影放映咨询，在线订购电影票，参加丰富多彩的电影活动，赢取积分大奖。</p>
</div>
  <div id="login_background"><img src="images/cinema2.jpg"  alt=""/></div>
</div>
</body>
</html>
