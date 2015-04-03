<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:useBean id="film" type="edu.nju.cineplex.vo.FilmDetailInfoVO" scope="session"></jsp:useBean>
<jsp:useBean id="activity" type="edu.nju.cineplex.vo.ActivityVO" scope="session"></jsp:useBean>
<%-- <jsp:useBean id="activity" type="edu.nju.cineplex.vo.ActivityVO" scope="session"></jsp:useBean> --%>
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
<div id="film_this">
  <div id="film_area" class="radius_border">
  	<div id="film_name"> 
  	  <h2><jsp:getProperty name="film" property="name"/></h2>
    </div>
    <div id="film_post"><img src="images/post/<jsp:getProperty name="film" property="id"/>.jpg" width="200" height="296"  alt=""/></div>
    <div id="film_staff"><span class="title">导演:</span> <jsp:getProperty name="film" property="director"/><br>
      <span class="title">编剧:</span> <jsp:getProperty name="film" property="writer"/><br>
      <span class="title">主演:</span> <jsp:getProperty name="film" property="actor"/><br>
      <span class="title">类型:</span> <jsp:getProperty name="film" property="film_type"/><br>
      <span class="title">官方网站:</span> <jsp:getProperty name="film" property="site"/><br>
      <span class="title">制片国家/地区:</span> <jsp:getProperty name="film" property="country"/><br>
      <span class="title">语言:</span> <jsp:getProperty name="film" property="language"/><br>
      <span class="title">片长:</span> <jsp:getProperty name="film" property="length"/><br>
    </div>
    <br class="clear" />
    <div id="film_plot"><span class="title">剧情简介：</span><br>
    <jsp:getProperty name="film" property="plot"/>
       </div>
    <div id="film_pre_video">
    <span class="title">预告片：</span><br/>
    <video width="700" height="400" id="pre_video" controls >
      <source src="video/<jsp:getProperty name="film" property="id"/>.mp4" type="video/mp4">
    </video>
    </div>
  </div>
  <div id="film_activity" class="radius_border">
    <div id="join_activity">
  	<p>当您购买该电影票时，您可以：</p>
    	<button type="button" class="btn btn-primary">参加活动</button>
    </div>
    <div id="activity_content">
    <form> 
    <h3><jsp:getProperty name="activity" property="question"/></h3>
    <div class="radio">
      <input type="radio" name="optionsRadios" id="optionsRadios1" 
         value="option1" ><jsp:getProperty name="activity" property="option1"/>
   </div>
    <div class="radio">
      <input type="radio" name="optionsRadios" id="optionsRadios1" 
         value="option1" ><jsp:getProperty name="activity" property="option2"/>
   </div>
    <div class="radio">
      <input type="radio" name="optionsRadios" id="optionsRadios1" 
         value="option1" ><jsp:getProperty name="activity" property="option3"/>
   </div>
   <div id="submit_activity">
    	<button type="button" class="btn btn-default">提交活动</button>
        </div>
      </form>
    </div>
  </div>
 </div>
  <div id="film_recommand_area" class="radius_border">
    <div id="recommand_title">
      <h3>推荐影片</h3>
    </div>
    <div class="recommand_film">
      <figure><a href="film?id=4"><img src="images/post/4.jpg" width="200" height="296"  alt=""/></a>
        <figcaption>盗梦空间</figcaption>
      </figure>
    </div>
    <div class="recommand_film">
      <figure><a href="film?id=7"><img src="images/post/7.jpg" width="200" height="296"  alt=""/></a>
        <figcaption>星际穿越</figcaption>
      </figure>
    </div>
    <div class="recommand_film">
      <figure><a href="film?id=3"><img src="images/post/3.jpg" width="200" height="296"  alt=""/></a>
        <figcaption>超体</figcaption>
      </figure>
    </div>
  </div>
  <br class="clear" />
</div>
<%@ include file="foot.jsp" %>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$(".active").removeClass("active");	
	$("#filmlist_nav").addClass("active");
	$("#activity_content").hide();
	$("#join_activity button").click(function(){
        $("#activity_content").show();
	});
	$("#submit_activity button").click(function(){
		alert("完成活动！")	
        $("#activity_content").hide();
	});
});
</script>
</html>