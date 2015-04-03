<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
﻿<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="styles/login.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="styles/bootstrap.min.css">
<script src="script/jquery-1.11.2.min.js"></script>
<script src="script/bootstrap.min.js"></script>
</head>

<body>
<div id="main_content">
<div id="login_register_form">
  <div id="login_form">
  	<form action="loginAction" method="post">
    <p>会员登录</p>
    <p>
      <input name="login.email" type="text" size="20" class="form-control" id="name" placeholder="请输入邮箱">
        </p>
    <p>
      <input name="login.password" type="password" size="20" class="form-control" id="password" placeholder="请输入密码">
    </p>
      <p>
        <input name="submit" type="submit" class="btn btn-primary" id="login_submit" value="登录">
  </p>
</form>
  </div>
  <div id="register_form">
  <form action="registerAction" method="post">
    <p>不是会员？注册</p>
    <p>
      <input name="register.name" type="text" size="20" class="form-control" placeholder="请输入姓名">
    </p>
    <p>
      <input name="register.email" type="text" size="20" class="form-control" placeholder="请输入邮箱">
    </p>
    <p>
      <input name="register.password" type="password" size="20" class="form-control" placeholder="请输入密码">
    </p>
    <p>
      <input type="password" size="20" class="form-control" placeholder="请再输入密码">
    </p>
    <blockquote>
      <p>
        <input name="submit2" type="submit" class="btn btn-primary" id="register_submit" value="注册">
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
