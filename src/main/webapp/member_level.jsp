<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:useBean id="level" type="edu.nju.cineplex.vo.LevelVO" scope="session"></jsp:useBean>
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
    <div id="member_level_area">
      <div id="current_level">您当前的会员等级是：<span id="level"><jsp:getProperty property="level" name="level"/></span></div>
      <div id="level_regulars">
        <table width="700" border="1">
          <tr>
            <th width="160" scope="row">会员升级规则</th>
            <td width="524">会员只可以向等级高的级别进行升级，升级所需费用由会员当前等级和会员有效期与会员费进行折算得到，会员余额需要满则要求，否则无法进行会员升级。</td>
          </tr>
        </table>
      </div>
      <div id="level_select">
        <div class="level_select_item" id="level_1">
          <div class="level_title">白银会员</div>
          <div class="level_description">
            <table width="200" border="1">
              <tr>
                <th scope="col">购票优惠</th>
                <th scope="col">积分兑换比例</th>
                <th scope="col">年费</th>
              </tr>
              <tr>
                <td>95折</td>
                <td>10:1</td>
                <td>￥400</td>
              </tr>
            </table>
          </div>
          <div class="level_select_button">
            <input type="button" name="button" class="btn btn-primary" id="level_1_button" value="成为白银会员">
          </div>
          <div class="level_footer"></div>
        </div>
        <div class="level_select_item" id="level_2">
          <div class="level_title">铂金会员</div>
      	  <div class="level_description">
            <table width="200" border="1">
              <tr>
                <th scope="col">购票优惠</th>
                <th scope="col">积分兑换比例</th>
                <th scope="col">年费</th>
              </tr>
              <tr>
                <td>9折</td>
                <td>8:1</td>
                <td>￥600</td>
              </tr>
            </table>
          </div>
          <div class="level_select_button">
            <input type="button" name="button" class="btn btn-danger" id="level_2_button" value="成为铂金会员">
          </div>
          <div class="level_footer"></div>
        </div>
        <div class="level_select_item" id="level_3">
          <div class="level_title">钻石会员</div>
          <div class="level_description">
          <table width="200" border="1">
              <tr>
                <th scope="col">购票优惠</th>
                <th scope="col">积分兑换比例</th>
                <th scope="col">年费</th>
              </tr>
              <tr>
                <td>85折</td>
                <td>6:1</td>
                <td>800</td>
              </tr>
            </table>
          </div>
          <div class="level_select_button">
	          <input type="button" name="button" class="btn btn-success" id="level_3_button" value="成为钻石会员">
          </div>
          <div class="level_footer"></div>
          </div>
        <br class="clear" />
      </div>
    </div>
  </div>
  <br class="clear" />
</div>
<%@ include file="foot.jsp" %>
        
</body>
<script type="text/javascript">
$(document).ready(function(){
	$("#member_navigation .active").removeClass("active");
	$("#level_nav").addClass("active");
});
$("#level_1_button").click(function(){
	$.post("upgradeAction",
			{
				up_level:1
			},
			function(data,status){
				alert("升级成功！");
			  });	
});
$("#level_2_button").click(function(){
	$.post("upgradeAction",
			{
				up_level:2
			},
			function(data,status){
				alert("升级成功！");
			  });	
});
$("#level_3_button").click(function(){
	$.post("upgradeAction",
			{
				up_level:3
			},
			function(data,status){
				alert("升级成功！");
			  });	
});
</script>
</html>