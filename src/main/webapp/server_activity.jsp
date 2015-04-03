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
    <div id="activity_film_select">
      <label for="select">选择电影:</label>
      <select class="form-control" id="select">
        <option value="1">蝙蝠侠：黑暗骑士崛起</option>
        <option value="7">星际穿越</option>
      </select>
    </div>
    <div id="activity_add">
      <button type="button" class="btn btn-success" id="activity_add_button">添加活动</button>
    </div>
    <div id="new_activity_area">
    	<hr/>
      <div class="question_area">
        <label for="textfield">问题:</label>
        <input type="text" class="form-control" id="question"  placeholder="请输入问题">
      </div>
      <div class="question_area">
        <label for="textfield2">选项1:</label>
        <input type="text" class="form-control" id="option1"  placeholder="请输入选项1">
      </div>
      <div class="question_area">
        <label for="textfield3">选项2:</label>
        <input type="text" class="form-control" id="option2"  placeholder="请输入选项2">
      </div>
      <div class="question_area">
        <label for="textfield4">选项3:</label>
        <input type="text" class="form-control" id="option3" placeholder="请输入选项3">
      </div>
      <div class="question_area">
        <label for="textfield5">答案:</label>
        <input type="text" class="form-control" id="answer" placeholder="请输入答案">
      </div>
      <div id="new_activity_commit">
        <button type="button" class="btn btn-primary" id="activity_commit_button">提交</button>
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
    $("#activity_nav").addClass("active");	
	$("#new_activity_area").hide();
});
$("#activity_add_button").click(function () {
	$("#hide_bland_area").hide();
	$("#new_activity_area").show();
});
$("#activity_commit_button").click(function(){
	$.post("addActivityAction",
			{
				film_id:$("#select").val(),
				question:$("#question").val(),
				option1:$("#option1").val(),
				option2:$("#option2").val(),
				option3:$("#option3").val(),
				answer:$("#answer").val()
			},
			function(data,status){
				alert("添加成功！");
			  });	
});
</script>
</html>