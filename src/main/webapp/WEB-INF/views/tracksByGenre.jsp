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
    <ul><h1>${genre.genreTitle}</h1></ul>
    <ul><a>${genre.description}</a></ul>
    <core:forEach var="track" items="${requestScope.tracksByGenre}">
    <ul><button onclick="window.location.href = '/track?track_id=${track._id}';">${track.title}</button></ul>
    </core:forEach>
    <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
</div>
</body>
</html>