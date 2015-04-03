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
    <div id="member_content_title">
      <h2>您的基本会员信息</h2>
    </div>
    <div id="member_info_area">
    	<table id="member_info_table" class="table table-striped">
    	<tbody>
    	<tr>
    		<th>用户名</th>
    		<td><jsp:getProperty name="member" property="name"/></td>
        </tr>
        <tr>
        	<th>会员卡号</th>
        	<td><jsp:getProperty name="member" property="id"/></td>
        </tr>
        <tr>
        	<th>会员级别</th>
        	<td><jsp:getProperty name="member" property="level"/></td>
        </tr>
        <tr>
        	<th>注册邮箱</th>
        	<td><jsp:getProperty name="member" property="email"/></td>
        </tr>
        <tr>
        	<th>余额</th>
        	<td><jsp:getProperty name="member" property="balance"/></td>
        </tr>
        <tr>
        	<th>积分</th>
        	<td><jsp:getProperty name="member" property="points"/></td>
        </tr>
        <tr>
        	<th>会员卡状态</th>
        	<td><jsp:getProperty name="member" property="state"/></td>
        </tr>
        <tr>
        	<th>会员有效日期</th>
        	<td><jsp:getProperty name="member" property="valid_date"/></td>
        </tr>
    	</tbody>
    	</table>
    </div>
  </div>
  <br class="clear" />
</div>
<%@ include file="foot.jsp" %>
        
</body>
</html>