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
  <div id="manager_nav">
  	<div class="manager_nav_item">经理中心</div>
  	<div class="manager_nav_item">放映计划</div>
  	<div class="manager_nav_item">票房统计</div>
  	<div class="manager_nav_item">影院统计</div>
  	<div class="manager_nav_item">会员统计</div>
  </div>
  <div id="manager_content">
    <div id="check_date_select_area">
      <label for="select">请选择审核的放映计划:</label>
      <select name="select" id="select">
        <option value="2015-3-3">2015-3-3</option>
        <option value="2015-3-4">2015-3-4</option>
      </select>
    </div>
    <div id="plan_area">
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
    <div id="check_area">
      <input type="button" name="button" id="pass_button" value="通过">
      <input type="button" name="button2" id="no_pass_button" value="不通过">
    </div>
      </div>
  </div>
  <br class="clear" />
</div>
<footer id="footer">Content for  id "footer" Goes Here</footer>
        
</body>
</html>
