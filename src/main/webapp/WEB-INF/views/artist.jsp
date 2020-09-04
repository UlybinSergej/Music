<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Java In HTML</title>
</head>
<body>
<div>
    <ul><h1>${artist.name}</h1></ul>
    <ul><img src="${artist.picture[0]}" width="${artist.picture[1]}" height="${artist.picture[2]}"></ul>
    <ul><a>${artist.description}</a></ul>
    <core:forEach var="genre" items="${requestScope.genres}">
        <ul><button onclick="window.location.href = '/tracksByGenre?genre_id=${genre._id}';">Genre - ${genre.genreTitle}</button></ul>
    </core:forEach>
    <core:forEach var="album" items="${requestScope.albums}">
        <ul><button onclick="window.location.href = '/album?album_id=${album._id}';">Album - ${album.title}</button></ul>
    </core:forEach>
    <ul><h>Tracks:</h></ul>
    <core:forEach var="track" items="${requestScope.tracks}">
        <ul><button onclick="window.location.href = '/track?track_id=${track._id}';">${track.title}</button></ul>
    </core:forEach>
    <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
</div>
</body>
</html>