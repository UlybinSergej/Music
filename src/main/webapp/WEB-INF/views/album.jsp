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
    <ul><h1>${album.title}</h1></ul>
    <ul><img src="${album.picture[0]}" width="${album.picture[1]}" height="${album.picture[2]}"></ul>
    <ul><a>${album.description}</a></ul>
    <ul><a>Genres:</a></ul>
    <core:forEach var="genre" items="${requestScope.genres}">
        <ul><button onclick="window.location.href = '/tracksByGenre?genre_id=${genre._id}';">${genre.genreTitle}</button></ul>
    </core:forEach>
    <ul><a>Artists:</a></ul>
    <core:forEach var="artist" items="${requestScope.artists}">
        <ul><button onclick="window.location.href = '/artist?artist_id=${artist._id}';">${artist.name}</button></ul>
    </core:forEach>
    <ul><a>Tracks:</a></ul>
    <core:forEach var="track" items="${requestScope.tracks}">
        <ul><button onclick="window.location.href = '/track?track_id=${track._id}';">${track.title}</button></ul>
    </core:forEach>
    <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
</div>
</body>
</html>