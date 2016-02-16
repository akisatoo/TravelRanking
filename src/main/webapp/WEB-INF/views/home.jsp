<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page pageEncoding="utf-8" %>
<html>
<head>
	<meta charset="utf-8">
	<link href="<c:url value="/resources/css/stylesheet.css" />" rel="stylesheet">
	<title>IKITAKA</title>
</head>
<body>
	<div id="header-area">
		<p id="title">IKITAKA</p>
		<p id="description">このページでは福岡県出身の高橋明哲による行きたい旅行先ランキングTOP5を発表します</p>
	</div>
	<div id="main-contents">
		<!--<div id="ranking-top"></div>-->
		
		<div id="ranking">
			<c:forEach var="item" items="${rankingList}" varStatus="status">
				<c:out value="${item.ranking}"/>位 : <c:out value="${item.name}"/><br>
			</c:forEach>
		</div>
	</div>
</body>
</html>
