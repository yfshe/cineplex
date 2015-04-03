<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="styles/main.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="styles/bootstrap.min.css">
<script src="script/jquery-1.11.2.min.js"></script>
<script src="script/bootstrap.min.js"></script>
</head>

<body class="index_body">
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>

<div id="main_content">
  <div id="ticket_area" class="radius_border">
    <div id="ticket_area_content">
      <div id="film_selection">
        <div id="film_name">
            <select class="form-control" id="film_name_select">
              <option value="none">请选择电影</option>
              <option value="1">蝙蝠侠：黑暗骑士崛起</option>
              <option value="7">星际穿越</option>
              <option value="4">盗梦空间</option>
              <option value="2">辩护人</option>
            </select>
        </div>
        <div id="film_date">
          <select class="form-control" id="film_date_select">
          	<option value="none">请选择日期</option>
            <option value="2015-3-30">2015-3-30</option>
            <option value="2015-3-31">2015-3-31</option>
            <option value="2015-4-1">2015-4-1</option>
            <option value="2015-4-2">2015-4-2</option>
            <option value="2015-4-3">2015-4-3</option>
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
        <table id="ticket_table" class="table table-striped">
        <thead>
          <tr>
            <th>电影名</th>
            <th>日期</th>
            <th>场次</th>
            <th>座位号</th>
            <th>票价</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td id="name_td">&nbsp;</td>
            <td id="date_td">&nbsp;</td>
            <td id="session_td">&nbsp;</td>
            <td id="seatNo_td">&nbsp;</td>
            <td id="price_td">&nbsp;</td>
          </tr>
        </tbody>
        </table>
        <div id="ticket_buy">
          <input type="button" name="button" class="btn btn-primary" id="purchase_button" value="购买">
        </div>
        <div id="recharge"><a href="#">去充值？</a></div>
      </div>
    </div>
  </div>
	
</div>
<%@ include file="foot.jsp" %>
        
</body>
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/jquery-ui.min.js"></script>
<script type="text/javascript" src="script/jquery.selectBoxIt.min.js"></script>

<script type="text/javascript" >
  $(document).ready(function(){
	  $(".active").removeClass("active");	
		$("#ticket_nav").addClass("active");
	$("#film_date_seleect").attr("disabled", "disabled");
	$("#film_session a").hide();
	$("#seatNo_table").hide();
  });
$("#film_name_select").change(function () {
	$("#name_td").text($("#film_name_select").find("option:selected").text());
	$("#film_post_picture").attr("src", "images/post/" + $("#film_name_select").val() + ".jpg");
	$("#film_date_select").attr("disabled", false);
	$("#film_session a").hide();
	$("#seatNo_table").hide();
	$("#date_td").empty();
	$("#session_td").empty();
	$("#seatNo_td").empty();
	$("#price_td").text("50");
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
$("#purchase_button").click(function(){
	$.post("ticketAction",
			{
				filmId:$("#film_name_select").val(),
				filmName:$("#name_td").text(),
				date:$("#date_td").text(),
				session:$("#session_td").text(),
				seatNo:$("#seatNo_td").text(),
				price:$("#price_td").text()
			},
			function(data,status){
				alert("购票成功");
				$("#film_date_seleect").attr("disabled", "disabled");
				$("#film_session a").hide();
				$("#seatNo_table").hide();
				$("#date_td").empty();
				$("#session_td").empty();
				$("#seatNo_td").empty();
				$("#price_td").text("50");
			  });
});
</script>
</html>