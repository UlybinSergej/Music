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
        <ul><a href="/tracksByGenre?genre_id=${genre._id}">${genre.genreTitle}</a></ul>
    </core:forEach>
    <ul><a>Artists:</a></ul>
    <core:forEach var="artist" items="${requestScope.artists}">
        <ul><a href="/artist?artist_id=${artist._id}">${artist.name}</a></ul>
    </core:forEach>
    <ul><a>Tracks:</a></ul>
    <core:forEach var="track" items="${requestScope.tracks}">
        <ul><a href="/track?track_id=${track._id}">${track.title}</a></ul>
    </core:forEach>
    <footer><a href="/index">Main page</a></footer>
</div>
</body>
</html>