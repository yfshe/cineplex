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
    <div id="records_area">
      <div id="records_range">
      <span>
      <label for="date">起始日期:</label>
      <input type="date" name="date" id="start_date">
      </span>
      <span>
      <label for="date2">结束日期:</label>
      <input type="date" name="date2" id="end_date">
      </span>
      <input type="button" name="button" id="record_submit" class="btn btn-primary" value="查询">
      </div>
      <div id="records_table">
        <table class="table table-striped">
          <tr>
            <th width="196" scope="col">时间</th>
            <th width="316" scope="col">描述</th>
            <th width="80" scope="col">金额</th>
            <th width="80" scope="col">余额</th>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
        </table>
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
	$("#records_nav").addClass("active");
	$("#record_submit").click(function(){
		$.ajax({
			type:"post",
			url:"recordAction",
			data:{
				start:$("#start_date").val(),
				end:$("#end_date").val()
			},
			dataType:"json",
			success:function(data){
				var json = eval("(" + data + ")");
				var records = json.records;
				var record_list = records.split(";");
				for(i in record_list){
					var record = record_list[i];
					if(record == "")
						break;
					var item_list = record.split(",");
					$("#records_table table").append("<tr><td>"+item_list[0]+"</td><td>"
							+item_list[1]+"</td><td>"+item_list[2]+"</td><td>"+item_list[3]
							+"</td></tr>");
				}
			}});
	});
});
</script>
</html>