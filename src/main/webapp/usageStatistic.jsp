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
  	<div id="day_seat_rate" class="chart_bar_area">
  		<h3>每日平均上座率变化</h3>
  		<canvas id="dayChart" width="600" height="400"></canvas>
  	</div>
  	<div id="film_seat_rate" class="chart_bar_area">
  		<h3>各影片平均上座率</h3>
  		<canvas id="filmChart" width="600" height="400"></canvas>
  	</div>
  <div id="film_seat_rate" class="chart_bar_area">
  	<h3>每日观影人数</h3>
  	<canvas id="peopleChart" width="600" height="400"></canvas>
  </div>
  <br class="clear" />
</div>
</div>
<%@ include file="foot.jsp" %>
        
</body>
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#manager_nav .active").removeClass("active");
    $("#man_usage_nav").addClass("active");	
	var people_data = {
			labels : ["3-20","3-21","3-22","3-23","3-24","3-25","3-26","3-27","3-28","3-29"],
			datasets : [
				{
					fillColor : "rgba(151,187,205,0.5)",
					strokeColor : "rgba(151,187,205,1)",
					pointColor : "rgba(151,187,205,1)",
					pointStrokeColor : "#fff",
					data : [20,48,40,19,56,27,30,56,27,30]
				}
			]
		}	
	
	var day_data = {
			labels : ["3-20","3-21","3-22","3-23","3-24","3-25","3-26","3-27","3-28","3-29"],
			datasets : [
				{
					fillColor : "rgba(151,187,205,0.5)",
					strokeColor : "rgba(151,187,205,1)",
					pointColor : "rgba(151,187,205,1)",
					pointStrokeColor : "#fff",
					data : [48,58,40,69,76,47,30,56,67,50]
				}
			]
		}	
	
	var film_data = {
			labels : ["盗梦空间","超体","蝙蝠侠","辩护人","星际穿越","雪国列车","一代宗师","后会无期"],
			datasets : [
				{
					fillColor : "rgba(151,187,205,0.5)",
					strokeColor : "rgba(220,220,220,1)",
					pointColor : "rgba(220,220,220,1)",
					pointStrokeColor : "#fff",
					data : [84,76,73,68,61,56,42,39]
				}
			]
		}
	
	var options = {
			scaleOverlay : false,
			scaleOverride : false,
			scaleSteps : null,
			scaleStepWidth : null,
			scaleStartValue : null,
			scaleShowLine : true,
			scaleLineColor : "rgba(0,0,0,.1)",
			scaleLineWidth : 1,
			scaleShowLabels : false,
			scaleFontFamily : "'Arial'",
			scaleFontSize : 12,
			scaleFontStyle : "normal",
			scaleFontColor : "#666",
			scaleShowLabelBackdrop : true,
			scaleBackdropColor : "rgba(255,255,255,0.75)",
			scaleBackdropPaddingY : 2,
			scaleBackdropPaddingX : 2,
			angleShowLineOut : true,
			angleLineColor : "rgba(0,0,0,.1)",
			angleLineWidth : 1,			
			pointLabelFontFamily : "'Arial'",
			pointLabelFontStyle : "normal",
			pointLabelFontSize : 12,
			pointLabelFontColor : "#666",
			pointDot : true,
			pointDotRadius : 3,
			pointDotStrokeWidth : 1,
			datasetStroke : true,
			datasetStrokeWidth : 2,
			datasetFill : true,
			animation : true,
			animationSteps : 60,
			animationEasing : "easeOutQuart",
			onAnimationComplete : null
		}
	var people_ctx = $("#peopleChart").get(0).getContext("2d");
	var day_ctx = $("#dayChart").get(0).getContext("2d");
	var film_ctx = $("#filmChart").get(0).getContext("2d");
	var peopleChart = new Chart(people_ctx);
	new Chart(day_ctx).Bar(day_data,options);
	new Chart(people_ctx).Bar(people_data,options);
	new Chart(film_ctx).Bar(film_data,options);
});
</script>
</html>