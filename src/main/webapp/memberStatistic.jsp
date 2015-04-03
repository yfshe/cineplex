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
<script src="script/Chart.js"></script>
</head>

<body class="member_body">
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div id="main_content">
  <%@ include file="man_nav.jsp" %>
  <div id="manager_content" class="radius_border">
  	<div id="age_chart" class="chart_pie_area">
  		<h3>会员年龄分布</h3>
  		<canvas id="ageChart" width="400" height="300"></canvas>
  	</div>
  	<div id="gender_chart" class="chart_pie_area">
  		<h3>会员性别分布<h3>
  		<canvas id="genderChart" width="400" height="300"></canvas>
  	</div>
  	<div id="state_chart" class="chart_pie_area">
  		<h3>会员状态分布<h3>
  		<canvas id="stateChart" width="400" height="300"></canvas>
  	</div>
  	<div id="interest_chart" class="chart_pie_area">
  		<h3>会员爱好分布<h3>
  		<canvas id="interestChart" width="400" height="300"></canvas>
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
    $("#man_member_nav").addClass("active");
	var gender_data = [
	            {
	                value: 56,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "男"
	            },
	            {
	                value: 44,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: "女"
	            },
	            ];
	var interest_data = [
	            {
	                value: 56,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "动作片"
	            },
	            {
	                value: 56,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: "爱情片"
	            },
	            {
	                value: 56,
	                color: "#FDB45C",
	                highlight: "#FFC870",
	                label: "科幻片"
	            },
	            {
	                value: 56,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "惊悚片"
	            },
	            {
	                value: 56,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: "战争片"
	            },
	            {
	                value: 44,
	                color: "#FDB45C",
	                highlight: "#FFC870",
	                label: "喜剧片"
	            },
	            ];
	var state_data = [
	            {
	                value: 6,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "未激活"
	            },
	            {
	                value: 74,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: "正常"
	            },
	            {
	                value: 20,
	                color: "#FDB45C",
	                highlight: "#FFC870",
	                label: "暂停"
	            },
	            ];
	var age_data = [
	            {
	                value: 16,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "<20"
	            },
	            {
	                value: 36,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: "20-30"
	            },
	            {
	                value: 30,
	                color: "#FDB45C",
	                highlight: "#FFC870",
	                label: "30-40"
	            },
	            {
	                value: 10,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "40-50"
	            },
	            {
	                value: 8,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: ">50"
	            }
	        ]
	
	var options = {
			segmentShowStroke : true,
			segmentStrokeColor : "#fff",
			segmentStrokeWidth : 2,
			animation : true,
			animationSteps : 100,
			animationEasing : "easeOutBounce",
			animateRotate : true,
			animateScale : false,
			onAnimationComplete : null
		}
	var age_ctx = $("#ageChart").get(0).getContext("2d")
	var gender_ctx = $("#genderChart").get(0).getContext("2d")
	var state_ctx = $("#stateChart").get(0).getContext("2d")
	var interest_ctx = $("#interestChart").get(0).getContext("2d")
	new Chart(age_ctx).Pie(age_data,options)
	new Chart(gender_ctx).Pie(gender_data,options)
	new Chart(state_ctx).Pie(state_data,options)
	new Chart(interest_ctx).Pie(interest_data,options)
});
</script>
</html>