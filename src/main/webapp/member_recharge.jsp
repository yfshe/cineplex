<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:useBean id="member" type="edu.nju.cineplex.vo.MemberDetailInfoVO" scope="session"></jsp:useBean>
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
    <div id="recharge_area">
      <div id="card_area">
        <div id="card_area_title">
          <h2>银行卡充值</h2>
        </div>
        <div id="card_number">您的银行卡号：<span id="card_No"><jsp:getProperty property="bankcard" name="member"/></span></div>
        <div id="card_change"><a href="#">修改绑定银行卡？</a></div>
        <div id="card_money">
          <label for="textfield">金额:</label>
          <input type="text" size="20" class="form-control" id="bankcard_money" placeholder="请输入转账金额">
        </div>
        <div id="card_password">
          <label for="password">密码:</label>
          <input type="password" size="20" class="form-control" id="password" placeholder="请输入转账密码">
        </div>
        <div id="card_commit">
            <input type="button" name="button" class="btn btn-primary" id="bankcard_submit" value="确认">
        </div>
        <hr/>
      </div>
      <div id="point_area">
        <div id="point_area_title">
          <h2>积分兑换</h2>
        </div>
        <div id="points_available">您的可用积分：<span id="points"><jsp:getProperty property="points" name="member"/></span></div>
        <div id="points_to_change">
          <label for="textfield2">兑换积分:</label>
          <input type="text" size="20" class="form-control" id="points_money" placeholder="请输入要兑换的积分">
        </div>
        <div id="point_commit">
            <input type="button" name="button" class="btn btn-primary" id="points_submit" value="确认">
        </div>
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
	$("#member_navigation .active").removeClass("active");
	$("#recharge_nav").addClass("active");	
});
$("#bankcard_submit").click(function(){
	$.post("rechargeAction",
			{
				type:"bankcard",
				money:$("#bankcard_money").val()
			},
			function(data,status){
				alert("充值成功！");
			  });	
});
$("#points_submit").click(function(){
	$.post("rechargeAction",
			{
				type:"points",
				money:$("#points_money").val()
			},
			function(data,status){
				alert("充值成功！");
			  });	
});
</script>
</html>