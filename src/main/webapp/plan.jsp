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
  <div id="film_plan_area" class="radius_border">
    <div id="plan_date_area">
      <div id="2015-3-30" class="plan_date">3月30日</div>
      <div id="2015-3-31" class="plan_date">3月31日</div>
      <div id="2015-4-1" class="plan_date">4月1日</div>
	  <div id="2015-4-2" class="plan_date">4月2日</div>
      <div id="2015-4-3" class="plan_date">4月3日</div>  
      <br class="clear" />
    </div>

    <div id="plan_list_area">
      <div class="plan_item">
        <div class="film_post"><img src="images/post/1.jpg" width="130" height="192"  alt=""/></div>
        <div id="plan_detail_1" class="plan_detail">
        <br class="clear" />
        <span>8:00-9:00</span><span>9:00-10:00</span><span>10:00-11:00</span><span>11:00-12:00</span>
        <span>12:00-13:00</span><span>13:00-14:00</span>
        <br class="clear" />
        </div>
        <br class="clear" />
      </div>
      <div class="plan_item">
        <div class="film_post"><img src="images/post/2.jpg" width="130" height="192"  alt=""/></div>
        <div id="plan_detail_2" class="plan_detail">
        <br class="clear" />
        <span>8:00-9:00</span><span>9:00-10:00</span><span>10:00-11:00</span><span>11:00-12:00</span>
        <span>12:00-13:00</span><span>13:00-14:00</span>
        <br class="clear" />
        </div>
        <br class="clear" />
      </div>
      <div class="plan_item">
        <div class="film_post"><img src="images/post/3.jpg" width="130" height="192"  alt=""/></div>
        <div id="plan_detail_3" class="plan_detail">
        <br class="clear" />
        <span>8:00-9:00</span><span>9:00-10:00</span><span>10:00-11:00</span><span>11:00-12:00</span>
        <span>12:00-13:00</span><span>13:00-14:00</span>
        <br class="clear" />
        </div>
        <br class="clear" />
      </div>
      <div class="plan_item">
        <div class="film_post"><img src="images/post/4.jpg" width="130" height="192"  alt=""/></div>
        <div id="plan_detail_4" class="plan_detail">
        <br class="clear" />
        <span>8:00-9:00</span><span>9:00-10:00</span><span>10:00-11:00</span><span>11:00-12:00</span>
        <span>12:00-13:00</span><span>13:00-14:00</span>
        <br class="clear" />
        </div>
        <br class="clear" />
      </div>
      <div class="plan_item">
        <div class="film_post"><img src="images/post/6.jpg" width="130" height="192"  alt=""/></div>
        <div class="plan_detail">
        </div>
        <br class="clear" />
      </div>
      <div class="plan_item">
        <div class="film_post"><img src="images/post/8.jpg" width="130" height="192"  alt=""/></div>
        <div class="plan_detail">
        </div>
        <br class="clear" />
      </div>
      <br class="clear" />
    </div>
  </div>
</div>
<%@ include file="foot.jsp" %>
        
</body>
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$(".active").removeClass("active");	
	$("#plan_nav").addClass("active");
	$(".plan_date").click(function(){
		$.ajax({
			type:"post",
			url:"planFilmAction",
			data:{
				date:$(this).attr("id")
			},
			dataType:"json",
			success:function(data){
				var plan = eval("(" + data + ")");
				var plan_1 = plan.film1;
				var plan_2 = plan.film2;
				var plan_3 = plan.film3;
				var plan_4 = plan.film4;
				
				$("#plan_detail_1").empty();
				$("#plan_detail_2").empty();
				$("#plan_detail_3").empty();
				$("#plan_detail_4").empty();
				
				$("#plan_detil_1").append("<br class=\"clear\" />");
				$("#plan_detil_2").append("<br class=\"clear\" />");
				$("#plan_detil_3").append("<br class=\"clear\" />");
				$("#plan_detil_4").append("<br class=\"clear\" />");
				
				var plan_array = plan_1.split(";");
				for(i in plan_array){
					$("#plan_detail_1").append("<span>" + plan_array[i] + "</span>");
				}
				$("#plan_detil_1").append("<br class=\"clear\" />");
				
				plan_array = plan_2.split(";");
				for(i in plan_array){
					$("#plan_detail_2").append("<span>" + plan_array[i] + "</span>");
				}
				$("#plan_detil_2").append("<br class=\"clear\" />");
				
				plan_array = plan_3.split(";");
				for(i in plan_array){
					$("#plan_detail_3").append("<span>" + plan_array[i] + "</span>");
				}
				$("#plan_detil_3").append("<br class=\"clear\" />");
				
				plan_array = plan_4.split(";");
				for(i in plan_array){
					$("#plan_detail_4").append("<span>" + plan_array[i] + "</span>");
				}
				$("#plan_detil_4").append("<br class=\"clear\" />");
			}
		})
	});
});
</script>
</html>