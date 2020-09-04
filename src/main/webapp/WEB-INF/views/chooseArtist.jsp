<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <title>Java In HTML</title>
</head>
<body>
<div>
    <core:forEach var="artist" items="${requestScope.artists}">
        <ul><button onclick="window.location.href = '/artist?artist_id=${artist._id}';">${artist.name}</button></ul>
    </core:forEach>
    <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
</div>
</body>
</html>