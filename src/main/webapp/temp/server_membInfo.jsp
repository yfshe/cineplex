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
    <div id="member_id_search">
      <label for="textfield">请输入会员号:</label>
      <input type="text" name="textfield" id="member_id_text">
      <input type="button" name="button" id="member_search_button" value="查询">
    </div>
    <div id="member_info_area">
    	<p>姓名：<label id="name"></label></p>
    	<p>级别：<label id="level"></label></p>
    	<p>余额：<label id="balance"></label></p>
    	<p>积分：<label id="points"></label></p>
    	<p>有效期：<label id="validdate"></label></p>
    	<p>性别：<label id="gender"></label></p>
    	<p>住址：<label id="location"></label></p>
    	<p>爱好：<label id="interests"></label></p>
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
	$("#member_info_area").hide();
});
$("#member_search_button").click(function () {
	$("#hide_bland_area").hide();
	$("#member_info_area").show();
});
</script>
</html>
