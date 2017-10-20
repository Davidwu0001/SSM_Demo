<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户注册</title>
	
  </head>
  
  <body>
    <fieldset>
    	<legend>注册</legend>
    	<form action="${pageContext.request.contextPath }/user/register.action" method="post">
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
    		</table>
    	</form>
    </fieldset>
  </body>
</html>