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
  <div id="filmlist_area" class="radius_border">
    <div class="filmlist_film">
      <div class="filmlist_post"><a href="film?id=1"><img src="images/post/1.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=1">蝙蝠侠：黑暗骑士崛起</a></div>
      </div>
    </div>
    <div class="filmlist_film">
      <div class="filmlist_post"><a href="film?id=2"><img src="images/post/2.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=2">辩护人</a></div>
      </div>
    </div>
    <div class="filmlist_film">
      <div class="filmlist_post"><a href="film?id=7"><img src="images/post/7.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=7">星际穿越</a></div>
      </div>
    </div>
    <div class="filmlist_film">      
      <div class="filmlist_post"><a href="film?id=4"><img src="images/post/4.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=4">盗梦空间</a></div>
      </div>
	</div>
    <div class="filmlist_film">      
      <div class="filmlist_post"><a href="film?id=3"><img src="images/post/3.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=3">超体</a></div>
      </div>
	</div>
    <div class="filmlist_film">      
      <div class="filmlist_post"><a href="film?id=8"><img src="images/post/8.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=8">雪国列车</a></div>
      </div>
	</div>
    <div class="filmlist_film">      
      <div class="filmlist_post"><a href="film?id=9"><img src="images/post/6.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=9">一代宗师</a></div>
      </div>
	</div>
    <div class="filmlist_film">      
      <div class="filmlist_post"><a href="film?id=5"><img src="images/post/5.jpg" width="200" height="296"  alt=""/></a>
        <div class="filmlist_name"><a href="film?id=5">后会无期</a></div>
      </div>
	</div>
    <br class="clear" />
  </div>
  <div id="side_content">
    <div id="ranklist_area" class="radius_border">
      <div id="rank_title">排行榜</div>
      <div id="rank_list">
      	<ul>
        	<li><a href="#"><span class="rank1">1.</span>星际穿越</a></li>
	     	<li><a href="#"><span class="rank2">2.</span>辩护人</a></li>
    	   	<li><a href="#"><span class="rank3">3.</span>盗梦空间</a></li>
          	<li><a href="#"><span>4.</span>雪国列车</a></li>
          	<li><a href="#"><span>5.</span>一代宗师</a></li>
           	<li><a href="#"><span>6.</span>蝙蝠侠：黑暗骑士崛起</a></li>
           	<li><a href="#"><span>7.</span>后会无期</a></li>
           	<li><a href="#"><span>8.</span>让子弹飞</a></li>
        </ul>
      </div>
    </div>
    <div id="ontheway_area" class="radius_border">
      <div id="ontheway_title">即将上映</div>
      <div id="ontheway_list">
      	<ul>
        	<li><a href="#">冰雪奇缘</a></li>
            <li><a href="#">催眠大师</a></li>
            <li><a href="#">博物馆奇妙夜</a></li>
            <li><a href="#">银河特工队</a></li>
            <li><a href="#">灰姑娘</a></li>
            <li><a href="#">亲爱的</a></li>
          <li><a href="#">匆匆那年</a></li>
        </ul>
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
	$("#filmlist_nav").addClass("active");
});
</script>
</html>