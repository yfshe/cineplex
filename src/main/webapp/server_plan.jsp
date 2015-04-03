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

<body class="member_body">
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div id="main_content">
  <%@ include file="ser_nav.jsp" %>
  <div id="server_content" class="radius_border">
    <div id="wait_plan_area">
    </div>
    <div id="add_plan_button">
      <button type="button" class="btn btn-success" id="add_new_plan">添加放映计划</button>
    </div>
    <div id="add_plan_area">
    	<hr/>
      <div id="date_select_area">
        <label for="datetime">放映日期:</label>
        <input type="date" name="date" id="new_plan_date">
      </div>
      <div id="plan_detail_select_area">
        <span><label for="select">放映厅:</label>
        <select class="form-control" name="select" id="hall_select">
          <option value="0">放映厅</option>
          <option value="1">1号厅</option>
          <option value="2">2号厅</option>
          <option value="3">3号厅</option>
          <option value="4">4号厅</option>
          <option value="5">5号厅</option>
        </select></span><br/>
        <span><label for="textfield">开始时间:</label>
        <input type="text" class="form-control" id="start_time" placeholder="请输入开始时间">
        </span>
        <span><label for="textfield2">结束时间:</label>
        <input type="text" class="form-control" id="end_time" placeholder="请输入结束时间">
        </span>
        <span><label for="select2">电影:</label>
        <select class="form-control" name="select2" id="film_select">
          <option value="0">选择电影</option>
          <option value="1">蝙蝠侠：黑暗骑士崛起</option>
          <option value="2">辩护人</option>
          <option value="3">超体</option>
          <option value="4">盗梦空间</option>
        </select></span>
        <button type="button" class="btn btn-primary" id="add_new_plan_item">添加</button>
      </div>
      <div id="plan_detail_area">
        <table class="table table-condensed" width="780" >
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
        <button type="button" class="btn btn-primary" id="new_plan_commit">提交放映计划</button>
      </div>
    </div>
    <div id="hide_bland_area" class="radius_border"></div>
  </div>
  <br class="clear" />

</div>
<%@ include file="foot.jsp" %>
        
</body>
<script src="script/jquery.min.js"></script>
<script src="script/jquery-ui.min.js"></script>

<script type="text/javascript" >
$(document).ready(function(){
	$("#server_nav .active").removeClass("active");
    $("#plan_nav").addClass("active");	
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
	var session = $("#session_hall_1").html().split("<br>").join(",") + ";" +
						$("#session_hall_2").html().split("<br>").join(",") + ";" +
						$("#session_hall_3").html().split("<br>").join(",") + ";" +
                        $("#session_hall_4").html().split("<br>").join(",") + ";" +
                        $("#session_hall_5").html().split("<br>").join(",");

	var film = $("#film_hall_1").html().split("<br>").join(",") + ";" +
						$("#film_hall_2").html().split("<br>").join(",") + ";" +
						$("#film_hall_3").html().split("<br>").join(",") + ";" +
                        $("#film_hall_4").html().split("<br>").join(",") + ";" +
                        $("#film_hall_5").html().split("<br>").join(",");
       
	$.post("addPlanAction",
			{
				date:$("#new_plan_date").val(),
				session:session,
				film:film
			},
			function(data,status){
				alert("添加成功！");
			  });
})
</script>


</html>