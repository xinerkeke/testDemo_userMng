<%@page pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Auto-Test App</title>
<link type="text/css" rel="stylesheet" media="all"
	href="../styles/global.css" />
<link type="text/css" rel="stylesheet" media="all"
	href="../styles/global_color.css" />
<script type="text/javascript" language="javascript"
	src="../js/jquery-1.4.3.js"></script>
<script language="javascript" type="text/javascript">
	
</script>
</head>
<body>
	<!--Logo区域开始-->
	<div id="header">
		<a href="#">[登录]</a> <a href="#">[退出]</a>
	</div>
	<!--Logo区域结束-->
	<!--导航区域开始-->
	<div id="navi">
		<ul id="menu">
			<li><a href="../index.html" class="index_off"></a></li>
		</ul>
	</div>
	<!--导航区域结束-->
	<!--主要区域开始-->
	<div id="main">
		
		<form action="addUser" method="post" class="main_form">
			<div class="text_info clearfix">
				<span>用户ID：</span>
			</div>
			<div class="input_info">
				<input type="text" class="width300" name="user.id" id="userID"
					onblur=";" /> <span class="required">*</span>
				<div class="validate_msg_short" id="userIDMsg">长度位0-11正整数</div>
			</div>
			<div class="text_info clearfix">
				<span>用户名：</span>
			</div>
			<div class="input_info">
				<input type="text" class="width300" name="user.name" id="userName"
					onblur=";" /> <span class="required">*</span>
				<div class="validate_msg_short" id="userNameMsg">20长度的字母、数字、汉字和下划线的组合</div>
			</div>
			<div class="text_info clearfix">
				<span>性别：</span>
			</div>
			<div class="input_info">
				<input type="text" class="width300" name="user.sex" id="userSex"
					onblur=";" /> <span class="required">*</span>
				<div class="validate_msg_short" id="userSexMsg">10长度的字母、数字、汉字和下划线的组合</div>
			</div>
			<div class="text_info clearfix">
				<span>联系方式：</span>
			</div>
			<div class="input_info">
				<input type="text" name="user.tel" class="width100" id="userTel" />
				<span class="required">*</span>
				<div class="validate_msg_long">11位数字</div>
			</div>
			<div class="text_info clearfix">
				<span>住址：</span>
			</div>
			<div class="input_info">
				<input type="text" name="user.addr" class="width100" id="userAddr" />
				<span class="required">*</span>
				<div class="validate_msg_long">0-255长度的字母、数字、汉字和下划线的组合</div>
			</div>
			<div class="button_info clearfix">
				<input type="button" value="保存" class=""
					onclick="document.forms[0].submit();" /> <input type="button"
					value="取消" class="" />
			</div>
		</form>
	</div>
	<!--主要区域结束-->
	<div id="footer">
		<span></span> <br /> <span></span>
	</div>
</body>
</html>