<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="/springhibernate/js/jquery-1.4.min.js"></script>
	<script src="/springhibernate/js/json.min.js"></script>
	<title>SpringHibernate Test Page</title>
</head>

<body>
	<h1>Tester Home page</h1>
	<div>
	
		<div style="border-style: solid; border-width: 1px;">
			<h1>User tests</h1>
			<div>
				<div>Change password</div>
				<form method="post" enctype="multipart/form-data"
					action="/springhibernate/tester/user/chpwd">
					<ul>
						<li><label>login</label><input type="text" id="login" name="login"></input></li>
						<li><label></label><input type="submit" value="Reinit Password" /></li>
					</ul>
				</form>
				<font color="red">&nbsp;&nbsp;&nbsp;&nbsp;<c:out
						value="${newpassword}" /></font>
				<br />
			</div>
		</div>
	
	</div>
</body>
</html>
