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
  	<form class="form-inline" role="form">
    <div id="member_id_search" class="form-group">
      <input type="text" class="form-control" id="member_id_text" placeholder="请输入会员号">
      <button type="button" id="membersearch_button" class="btn btn-primary">查询</button>
    </div>
</form>
    <div id="member_info_area">
    	<table class="table table-striped">
           <tbody>
              <tr>
                 <th>姓名</th>
                 <td>佘昀峰</td>
              </tr>
              <tr>
                 <th>等级</th>
                 <td>钻石</td>
              </tr>
              <tr>
                 <th>余额</th>
                 <td>1000</td>
              </tr>
              <tr>
                 <th>积分</th>
                 <td>500</td>
              </tr>
              <tr>
                 <th>有效日期</th>
                 <td>2015-12-12</td>
              </tr>
              <tr>
                 <th>状态</th>
                 <td>正常</td>
              </tr>
              <tr>
                 <th>性别</th>
                 <td>男</td>
              </tr>
              <tr>
                 <th>住址</th>
                 <td>江苏省南京市</td>
              </tr>
              <tr>
                 <th>电影爱好</th>
                 <td>科幻片，动作片，爱情片</td>
              </tr>
           </tbody>
        </table>
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
    $("#info_nav").addClass("active");	
	$("#member_info_area").hide();
});
$("#membersearch_button").click(function () {
	$("#hide_bland_area").hide();
	$("#member_info_area").show();
});
</script>
</html>