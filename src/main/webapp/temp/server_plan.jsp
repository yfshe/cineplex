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
    <div id="pass_plan_area">
   	  <label>已通过放映计划：</label>
    	<span class="passed_plan_date">2015-3-6</span>
      	<span class="passed_plan_date">2015-3-7</span>
    </div>
    <div id="wait_plan_area">
    	<label> 待审核放映计划：</label>
       	<span class="waited_plan_date">2015-3-8</span>
      	<span class="waited_plan_date">2015-3-9</span>
    </div>
    <div id="add_plan_button">
      <input type="button" name="button" id="add_new_plan" value="添加放映计划">
    </div>
    <div id="add_plan_area">
    	<hr/>
      <div id="date_select_area">
        <label for="datetime">放映日期:</label>
        <input type="date" name="date" id="date">
      </div>
      <div id="plan_detail_select_area">
        <span><label for="select">放映厅:</label>
        <select name="select" id="hall_select">
          <option value="0">放映厅</option>
          <option value="1">1号厅</option>
          <option value="2">2号厅</option>
          <option value="3">3号厅</option>
          <option value="4">4号厅</option>
          <option value="5">5号厅</option>
        </select></span><br/>
        <span><label for="textfield">开始时间:</label>
        <input name="textfield" type="text" id="start_time" size="10"></span>
        <span><label for="textfield2">结束时间:</label>
        <input name="textfield2" type="text" id="end_time" size="10"></span>
        <span><label for="select2">电影:</label>
        <select name="select2" id="film_select">
          <option value="0">选择电影</option>
          <option value="1">蝙蝠侠：黑暗骑士崛起</option>
          <option value="2">星际穿越</option>
        </select></span>
        <input type="button" name="button2" id="add_new_plan_item" value="添加">
      </div>
      <div id="plan_detail_area">
        <table width="780" border="1">
          <tr>
            <th width="161" scope="col">放映厅</th>
            <th width="220" scope="col">时段</th>
            <th width="197" scope="col">电影</th>
          </tr>
          <tr>
            <td>1号厅</td>
            <td id="session_hall_1"></td>
            <td id="film_hall_1"></td>
          </tr>
          <tr>
            <td>2号厅</td>
            <td id="session_hall_2"></td>
            <td id="film_hall_2"></td>
          </tr>
          <tr>
            <td>3号厅</td>
            <td id="session_hall_3"></td>
            <td id="film_hall_3"></td>
          </tr>
          <tr>
            <td>4号厅</td>
            <td id="session_hall_4"></td>
            <td id="film_hall_4"></td>
          </tr>
          <tr>
            <td>5号厅</td>
            <td id="session_hall_5"></td>
            <td id="film_hall_5"></td>
          </tr>
        </table>
      </div>
      <div id="plan_add_button">
        <input type="button" name="button3" id="new_plan_commit" value="提交放映计划">
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
	$("#add_plan_area").hide();
});
$("#add_new_plan").click(function () {
	$("#hide_bland_area").hide();
	$("#add_plan_area").show();
});
$("#add_new_plan_item").click(function(){
	var hall = $("#hall_select").val();
	var start = $("#start_time").val();
	var end = $("#end_time").val();
	var film = $("#film_select").find("option:selected").text();
	$("#session_hall_" + hall).append(start + "-" + end + "<br/>");
	$("#film_hall_" + hall).append(film + "<br/>");
});
$("#new_plan_commit").click(function(){

})
</script>


</html>
