<%@page import="java.util.List"%>
<%@page import="byy.bean.User" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<%
	Object obj = request.getAttribute("userList");
	List<User> userList = null;
	if(obj instanceof List){
		userList = (List<User>)obj;
	}
	if(userList!=null){
		for(User user:userList){
			String userinfo = user.getId() + "..." + user.getName();
			%>
			<li><%=userinfo %></li>
			<%
		}
	}
	%>
	</ul>
</body>
</html>
