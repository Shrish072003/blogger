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
<s:if test="%{#session['userName'] != null}">
	欢迎：<s:property value="#session['userName']"/>
</s:if>
<s:else>
	<s:url var="loginURL" namespace="/" action="login">
	</s:url>	
	<s:a href="%{loginURL}">
		登陆
	</s:a>
</s:else>

<div id="body" class="center">博客内容</div>

<s:form action="index">
	
	<table border="1">
		<tr>
			<td>标题</td>
			<td>内容</td>
			<td>创建者</td>
			<td>创建时间</td>
		</tr>
		<s:iterator value="bloggerList">
			<tr>
				<td><s:property value="title"/></td>
				<td><s:property value="content"/></td>
				<td><s:property value="creator"/></td>
				<td><s:property value="lastUpdated"/></td>			
			</tr>
		</s:iterator>
	</table>
	
</s:form>

</body>
</html>