<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人博客</title>
<style>
.center{
	margin-left:auto;
	margin-right:auto;
}
</style>
</head>
<body>
<div id="header" class="center">欢迎！！！</div>

<div id="body" class="center">博客内容</div>

<s:form action="Index">
	<s:textfield name="name" label="name"/>
</s:form>

</body>
</html>