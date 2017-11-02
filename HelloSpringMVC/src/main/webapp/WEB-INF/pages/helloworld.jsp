<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC-Hello Spring</title>
</head>
<body>
<h1><%= request.getAttribute("greeting") %></h1>
</body>
</html>