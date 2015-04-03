<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
<link href="styles/main.css" rel="stylesheet" type="text/css">
</head>

<body class="member_body">
<header id="header"><div id="logo"><img src="images/logo1.jpg"  alt="" width="320" height="70"/></div>
  <div id="member_nav">欢迎，tachikoma，进入<a href="#">会员中心</a></div><br class="clear" /></header>

<nav id="navigation">
  <ul>
    <li><a href="#">首页</a></li>
    <li><a href="#">在映电影</a></li>
    <li><a href="#">放映计划</a></li>
    <li><a href="#">购票</a></li>
    <li><a href="#">最新消息</a></li>
    <li><a href="#">了解会员</a></li>
  </ul>
</nav>
<div id="main_content">
	<nav id="member_navigation">
    <div class="member_nav_item">会员中心</div>
    <div class="member_nav_item">个人信息</div>
    <div class="member_nav_item">会员等级</div>
    <div class="member_nav_item">余额充值</div>
    <div class="member_nav_item">电影活动</div>
    <div class="member_nav_item">消费记录</div>
    <div class="member_nav_item">会员注销</div>
  </nav>
  <div id="member_content">
    <div id="member_detail_area">
      <div id="member_detail_title">
        <h2>查看或修改您的个人信息</h2>
      </div>
      <div id="member_detail_content">
      <div id="memeber_birthday">生日：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="date" name="date" id="birth_date">
      </div>
      <div id="member_gender">性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" name="gender" id="male_radio" value="male">
        <label for="radio">男</label>
        <input type="radio" name="gender" id="female_radio" value="female">
        <label for="radio2">女</label>
      </div>
      <div id="member_location">住址：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" name="textfield2" id="location_text">
      </div>
      <div id="member_bankcard">绑定银行卡号：
        <input type="text" name="textfield" id="bankcard_text">
      </div>
      <div id="member_intersts">
        <p>观影喜好：</p>
        <div id="member_intersts_content"> <span>
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
        <p>&nbsp;</p>
      </div>
      <div id="save_area">
        <input type="button" name="button" id="button" value="保存修改">
      </div>
      </div>
    </div>
  </div>
  <br class="clear" />
</div>
<footer id="footer">Content for  id "footer" Goes Here</footer>
        
</body>
</html>
