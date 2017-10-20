<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>基于SSM的用戶登陸</title>
	
  </head>
  
  <body>
    <fieldset>
    	<legend>登陸</legend>
    	<form action="${pageContext.request.contextPath }/user/login.action" method="post">
    		<table>
    			<tr>
    				<td>userName</td>
    				<td><input type="text" name="username" ></td>
    			</tr>
    			<tr>
    				<td>password</td>
    				<td><input type="password" name="password"></td>
    			</tr>
    			<tr>
    				<td><input type="submit" value="submit"></td>
    				<td><span style="color: red">${errorMsg }</span></td>
    			</tr>
    			<tr>
    				<td colspan="2"><a href="register.jsp">用户注册</a></td>
    			</tr>
    		</table>
    	</form>
    </fieldset>
  </body>
</html>