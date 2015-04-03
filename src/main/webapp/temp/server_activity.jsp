<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="styles/main.css" rel="stylesheet" type="text/css">
</head>

<body class="member_body">
<header id="header"><div id="logo"><img src="images/logo1.jpg"  alt="" width="320" height="70"/></div>
  <div id="member_nav">欢迎，tachikoma，进入<a href="#">会员中心</a></div><br class="clear" /></header>

<nav id="navigation">
  <ul>
    <li><a href="#">首页</a></li>
    <li><a href="#">在映电影</a></li>
    <li><a href="#">放映计划</a></li>
    <li><a href="#">购票</a></li>
    <li><a href="#">最新消息</a></li>
    <li><a href="#">了解会员</a></li>
  </ul>
</nav>
<div id="main_content">
	<div id="server_nav">
  	<div class="server_nav_item">服务员中心</div>
  	<div class="server_nav_item">放映计划</div>
  	<div class="server_nav_item">电影活动</div>
  	<div class="server_nav_item">会员信息</div>
  </div>
  <div id="server_content">
    <div id="activity_film_select">
      <label for="select">选择电影:</label>
      <select name="select" id="select">
        <option value="1">蝙蝠侠：黑暗骑士崛起</option>
        <option value="2">星际穿越</option>
      </select>
    </div>
    <div id="activity_add">
      <input type="button" name="button" id="activity_add_button" value="添加活动">
    </div>
    <div id="new_activity_area">
    	<hr/>
      <div class="question_area">
        <label for="textfield">问题:&nbsp;</label>
        <input type="text" name="textfield" id="textfield">
      </div>
      <div class="question_area">
        <label for="textfield2">选项1:</label>
        <input type="text" name="textfield2" id="textfield2">
      </div>
      <div class="question_area">
        <label for="textfield3">选项2:</label>
        <input type="text" name="textfield3" id="textfield3">
      </div>
      <div class="question_area">
        <label for="textfield4">选项3:</label>
        <input type="text" name="textfield4" id="textfield4">
      </div>
      <div class="question_area">
        <label for="textfield5">答案:&nbsp;</label>
        <input type="text" name="textfield5" id="textfield5">
      </div>
      <div id="new_activity_commit">
        <input type="button" name="button2" id="activity_commit_button" value="提交">
      </div>
    </div>
    <div id="hide_bland_area"></div>
  </div>
  <br class="clear" />
</div>
<footer id="footer">Content for  id "footer" Goes Here</footer>
        
</body>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>

<script type="text/javascript" >
$(document).ready(function(){
	$("#new_activity_area").hide();
});
$("#activity_add_button").click(function () {
	$("#hide_bland_area").hide();
	$("#new_activity_area").show();
});
$("#activity_commit_button").click(function () {
});
</script>
</html>
