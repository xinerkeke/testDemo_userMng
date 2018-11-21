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
<script language="javascript" type="text/javascript">
            //排序按钮的点击事件
            function sort(btnObj) {
                if (btnObj.className == "sort_desc")
                    btnObj.className = "sort_asc";
                else
                    btnObj.className = "sort_desc";
            }

           //删除
            function deleteUser(id) {
                var r = window.confirm("确定要删除此用户吗？");
                if(r) {
                	location.href = "delUser?id="+id;
                }
            }
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
	<h1><a href="../user/findUser">用户管理</a></h1>
		<form action="" method="">
			<table id="datalist">
				<tr>
					<th class="width100">用户ID</th>
					<th>用户名</th>
					<th>性别</th>
					<th>联系方式</th>
					<th>住址</th>
					<th>操作</th>
				</tr>
				<s:iterator value="users">
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="name" /></td>
						<td><s:property value="sex" /></td>
						<td><s:property value="tel" /></td>
						<td><s:property value="addr" /></td>
						<td><input type="button" value="修改" class="btn_modify"
							onclick="location.href='fee_modi.html';" /> <input type="button"
							value="删除" class="btn_delete"
							onclick="deleteUser(<s:property value='id'/>)" /></td>
					</tr>
				</s:iterator>
			</table>
			<div class="search_add">
				<input type="button" value="新增" class=""
					onclick="location.href='toAddUser';" />
			</div>
		</form>
	</div>
	<!--主要区域结束-->
	<div id="footer">
		<p></p>
		<p></p>
	</div>
</body>
</html>