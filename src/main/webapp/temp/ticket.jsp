<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="styles/main.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" />
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/themes/base/jquery-ui.css" />
<link type="text/css" rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css" />
<link rel="stylesheet" href="http://gregfranko.com/jquery.selectBoxIt.js/css/jquery.selectBoxIt.css" />
</head>

<body class="index_body">
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
  <div id="ticket_area">
    <div id="ticket_area_content">
      <div id="film_selection">
        <div id="film_name">
            <select name="select" id="film_name_select">
              <option value="none">请选择电影</option>
              <option value="蝙蝠侠">蝙蝠侠：黑暗骑士崛起</option>
              <option value="星际穿越">星际穿越</option>
              <option value="盗梦空间">盗梦空间</option>
              <option value="辩护人">辩护人</option>
            </select>
        </div>
        <div id="film_date">
          <select name="select2" id="film_date_select">
          	<option value="none">请选择日期</option>
            <option value="3月1日">3月1日</option>
            <option value="3月2日">3月2日</option>
            <option value="3月3日">3月3日</option>
            <option value="3月4日">3月4日</option>
            <option value="3月5日">3月5日</option>
          </select>
        </div>
		
        <div id="film_session">
        	<div id="session_title">请选择场次：</div>
            <div id="session_list">
	        	<a class="session">8:00-9:00</a>
				<a class="session">9:00-10:00</a>
				<a class="session">7:00-8:00</a>
				<a class="session">6:00-7:00</a>
				<a class="session">5:00-6:00</a>
				<a class="session">3:00-4:00</a>
   				<a class="session">3:00-4:00</a>
            </div>
        </div>
        <div id="film_seatNo">
          <div id="seatNo_title">请选择座位号：</div>
          <div>
          	<table id="seatNo_table" border="1">
				<tr>
					<td class="seatNo">29</td>
				  <td class="seatNo">30</td>
				  <td class="seatNo">31</td>
				  <td class="seatNo">32</td>
				  <td class="seatNo">33</td>
					<td class="seatNo">34</td>
					<td class="seatNo">35</td>
				  <td class="seatNo">36</td>
				  <td class="seatNo">37</td>
				  <td class="seatNo">38</td>
				</tr>
                <tr>
                	<td class="seatNo">19</td>
                	<td class="seatNo">20</td>
                	<td class="seatNo">21</td>
                	<td class="seatNo">22</td>
                	<td class="seatNo">23</td>
                    <td class="seatNo">24</td>
                    <td class="seatNo">25</td>
                    <td class="seatNo">26</td>
                    <td class="seatNo">27</td>
                    <td class="seatNo">28</td>
                </tr>
                <tr>
                	<td class="hide_td">&nbsp; </td>
                	<td class="seatNo">11</td>
                	<td class="seatNo">12</td>
                	<td class="seatNo">13</td>
                	<td class="seatNo">14</td>
	                <td class="seatNo">15</td>
	                <td class="seatNo">16</td>
	                <td class="seatNo">17</td>
	                <td class="seatNo">18</td>
	                <td class="hide_td">&nbsp; </td>
                    </tr>
                    <tr>
                    	<td class="hide_td">&nbsp; </td>
                    	<td class="hide_td">&nbsp; </td>
                    	<td class="seatNo">5</td>
                    	<td class="seatNo">6</td>
                    	<td class="seatNo">7</td>
                        <td class="seatNo">8</td>
                        <td class="seatNo">9</td>
                        <td class="seatNo">10</td>
                        <td class="hide_td">&nbsp; </td>
                        <td class="hide_td">&nbsp; </td>
                   	</tr>
                    <tr>
                    	<td class="hide_td">&nbsp; </td>
                    	<td class="hide_td">&nbsp; </td>
                    	<td class="hide_td">&nbsp; </td>
                    	<td class="seatNo">1</td>
                    	<td class="seatNo">2</td>
                        <td class="seatNo">3</td>
                        <td class="seatNo">4</td>
                        <td class="hide_td">&nbsp; </td>
                        <td class="hide_td">&nbsp; </td>
                        <td class="hide_td">&nbsp; </td>
                    </tr>
            	<tr>
                	<td id="screen_td" colspan="10">屏幕</td>
                </tr>
          	</table>
          </div>
        </div>
      </div>
      <div id="film_post"><img id="film_post_picture" src="images/post/blank.jpg"  alt=""/></div>
      <br class="clear" />
      <div id="ticket_result">
        <div id="ticket_result_title">购票信息：</div>
        <table id="ticket_table" border="1">
          <tr>
            <th>电影名</th>
            <th>日期</th>
            <th>场次</th>
            <th>座位号</th>
            <th>票价</th>
          </tr>
          <tr>
            <td id="name_td">&nbsp;</td>
            <td id="date_td">&nbsp;</td>
            <td id="session_td">&nbsp;</td>
            <td id="seatNo_td">&nbsp;</td>
            <td id="price_td">&nbsp;</td>
          </tr>
        </table>
        <div id="ticket_buy">
          <input type="button" name="button" id="button" value="购买">
        </div>
        <div id="recharge"><a href="#">去充值？</a></div>
      </div>
    </div>
  </div>
	
</div>
<footer id="footer">Content for  id "footer" Goes Here</footer>
        
</body>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>
<script src="http://gregfranko.com/jquery.selectBoxIt.js/js/jquery.selectBoxIt.min.js"></script>

<script type="text/javascript" >
  $(function() {
    var selectBox = $("select").selectBoxIt();
  });
  $(document).ready(function(){
	$("#film_date_seleect").attr("disabled", "disabled");
	$("#film_session a").hide();
	$("#seatNo_table").hide();
  });
$("#film_name_select").change(function () {
	$("#name_td").text($("#film_name_select").val());
	$("#film_post_picture").attr("src", "images/post/" + $("#film_name_select").val() + ".jpg");
	$("#film_date_select").attr("disabled", false);
	$("#film_session a").hide();
	$("#seatNo_table").hide();
	$("#date_td").empty();
	$("#session_td").empty();
	$("#seatNo_td").empty();
});
$("#film_date_select").change(function () {
	$("#date_td").text($("#film_date_select").val());
	$("#film_session a").show();
	$("#seatNo_table").hide();
	$("#session_td").empty();
	$("#seatNo_td").empty();
});
$(".session").click(function () {
	$("#session_td").text($(this).text());
	$("#seatNo_table").show();
	$(".seatNo").css("background", "white");
	$("#seatNo_td").empty();	
});
$(".seatNo").click(function () {
	$(".seatNo").css("background", "white");
	$(this).css("background", "#0066FF");
	$("#seatNo_td").text($(this).text());
});
</script>
</html>
