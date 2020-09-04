<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Java In HTML</title>
</head>
<body>
<div>
    <core:forEach var="genre" items="${requestScope.genres}">
        <ul><button onclick="window.location.href = '/tracksByGenre?genre_id=${genre._id}';">${genre.genreTitle}</button></ul>
    </core:forEach>
    <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
</div>
</body>
</html>