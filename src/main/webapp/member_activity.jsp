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
	<%@ include file="mem_nav.jsp" %>
  <div id="member_content" class="radius_border">
    <div id="member_activity_area">
      <div id="activity_film_area">
        <div id="activity_film_title"> 
          <h2>您可以参加一以下电影的活动</h2>
        </div>
        <div id="activity_film_list">
          <div class="activity_film">
            <div class="activity_film_post">
            <a href="film?id=1">
            <img src="images/post/1.jpg" width="150" height="222"  alt=""/></a></div>
            <div class="activity_film_join">
            <a href="film?id=1">
        	<input type="button" name="button" class="btn btn-default" value="参加活动">
        	</a>
            </div>
            <br class="clear" />
          </div>
          <div class="activity_film">
            <div class="activity_film_post"><img src="images/post/2.jpg" width="150" height="222"  alt=""/></div>
            <div class="activity_film_join">
        	<input type="button" name="button" class="btn btn-default" value="参加活动">
            </div>
            <br class="clear" />
          </div>
          <div class="activity_film">
            <div class="activity_film_post"><img src="images/post/4.jpg" width="150" height="222"  alt=""/></div>
            <div class="activity_film_join">
        	<input type="button" name="button" class="btn btn-default" value="参加活动">
            </div>
            <br class="clear" />
          </div>
          <div class="activity_film">
            <div class="activity_film_post"><img src="images/post/7.jpg" width="150" height="222"  alt=""/></div>
            <div class="activity_film_join">
        	<input type="button" name="button" class="btn btn-default" value="参加活动">
            </div>
            <br class="clear" />
          </div>
        </div>
      </div>
    </div>
  </div>
  <br class="clear" />
</div>
<%@ include file="foot.jsp" %>
        
</body>
<script type="text/javascript">
$(document).ready(function(){
	$(".active").removeClass("active");
	$("#activity_nav").addClass("active");
});
</script>
</html>