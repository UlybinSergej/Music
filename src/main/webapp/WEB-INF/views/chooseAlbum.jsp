<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Albums</title>
</head>
<body>
<div>
    Choose Album!

    <core:forEach var="album" items="${requestScope.albums}">
        <ul><button onclick="window.location.href = '/album?album_id=${album._id}';">${album.title}</button></ul>
    </core:forEach>
    <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
</div>
</body>
</html>