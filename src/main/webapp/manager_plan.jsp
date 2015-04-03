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
  <%@ include file="man_nav.jsp" %>
  <div id="manager_content">
    <div id="check_date_select_area">
      <select class="form-control" id="plan_date_select">
        <option value="">请选择审核的放映计划</option>
        <option value="2015-4-3">2015-4-3</option>
      </select>
    </div>
    <div id="plan_area">
    <div id="plan_detail_area">
        <table class="table table-condensed">
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
      <button type="button" class="btn btn-default" id="pass_button" >通过</button>
      <button type="button" class="btn btn-default" id="no_pass_button" ">不通过</button>
    </div>
      </div>
  </div>
  <br class="clear" />
</div>
<%@ include file="foot.jsp" %>
        
</body>
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#manager_nav .active").removeClass("active");
    $("#man_plan_nav").addClass("active");
	$("#plan_date_select").change(function(){
		$.ajax({
			type:"post",
			url:"checkPlanAction",
			data:{
				date:$("#plan_date_select").val()
			},
			dataType:"json",
			success:function(data){
				var plan = eval("(" + data + ")");
				$("#session_hall_1").html(plan.session_hall_1);
				$("#film_hall_1").html(plan.film_hall_1);
				$("#session_hall_2").html(plan.session_hall_2);
				$("#film_hall_2").html(plan.film_hall_2);
				$("#session_hall_3").html(plan.session_hall_3);
				$("#film_hall_3").html(plan.film_hall_3);
				$("#session_hall_4").html(plan.session_hall_4);
				$("#film_hall_4").html(plan.film_hall_4);
				$("#session_hall_5").html(plan.session_hall_5);
				$("#film_hall_5").html(plan.film_hall_5);
			}
		});
	});
});
$("#pass_button").click(function(){
	$.post("passPlanAction",
			{
				date:$("#plan_date_select").val(),
			},
			function(data,status){
				alert("审核成功！");
			  });
});
</script>
</html>