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
    <div id="member_detail_area">
      <div id="member_detail_title">
        <h2>查看或修改您的个人信息</h2>
      </div>
      <div id="member_detail_content">
      <div id="member_birthday">生日：
      <input type="date" class="form-control" id="birthday">
      </div>
      <div id="member_gender">性别：
        <input type="radio" name="gender" id="male_radio" value="male">
        <label for="radio">男</label>
        <input type="radio" name="gender" id="female_radio" value="female">
        <label for="radio2">女</label>
      </div>
      <div id="member_location">住址：
      <input type="text" class="form-control" id="location">
      </div>
      <div id="member_bankcard">银行卡：
      <input type="text" class="form-control" id="bankcard">
      </div>
      <div id="member_intersts">
        <p>观影喜好：</p>
        <div id="member_interests_content"> <span>
          <input type="checkbox" name="checkbox" id="checkbox">
          <label for="checkbox2">动作片 </label>
          </span> <span>
            <input type="checkbox" name="checkbox2" id="checkbox2">
            <label for="checkbox2">剧情片 </label>
            </span> <span>
              <input type="checkbox" name="checkbox3" id="checkbox3">
              <label for="checkbox3">科幻片 </label>
              </span> <span>
                <input type="checkbox" name="checkbox4" id="checkbox4">
                <label for="checkbox4">悬疑片 </label>
                </span> <span>
                  <input type="checkbox" name="checkbox5" id="checkbox5">
                  <label for="checkbox5">恐怖片 </label>
                  </span> <span>
                    <input type="checkbox" name="checkbox6" id="checkbox6">
                    <label for="checkbox6">爱情片 </label>
                    </span> <span>
                      <input type="checkbox" name="checkbox7" id="checkbox7">
                      <label for="checkbox7">动画片 </label>
                      </span> <span>
                        <input type="checkbox" name="checkbox8" id="checkbox8">
                        <label for="checkbox8">战争片 </label>
                        </span> <span>
                          <input type="checkbox" name="checkbox9" id="checkbox9">
                          <label for="checkbox9">纪录片 </label>
                          </span> <br class="clear" />
        </div>
      </div>
      <div id="member_info_save">
          <button type="button" id="save_member_info" class="btn btn-primary">保存</button>
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
	$("#member_navigation .active").removeClass("active");
	$("#info_nav").addClass("active");
});
$("#save_member_info").click(function(){
	$.post("saveinfo",
			{
				birthday:$("#birthday").val(),
				location:$("#location").val(),
				bankcard:$("#bankcard").val()
			},
			function(data,status){
				alert("保存成功！");
			  });	
});
</script>
</html>