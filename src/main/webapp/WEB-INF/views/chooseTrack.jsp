<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Java In HTML</title>
</head>
<body>
<div>
    Choose Track!

    <core:forEach var="track" items="${requestScope.tracks}">
        <ul><button onclick="window.location.href = '/track?track_id=${track._id}';">${track.title}</button></ul>
    </core:forEach>
    <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
</div>
</body>
</html>