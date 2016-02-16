<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
  uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>入力画面</title>
</head>
<body>入力画面

<form:form commandName="example">
  <form:input path="message"/>
  <input type="submit" />
</form:form>

</body>
</html>