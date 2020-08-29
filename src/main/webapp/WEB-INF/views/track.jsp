<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%--<%@page contentType="audio/mpeg3" pageEncoding="UTF-8"%>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Java In HTML</title>
</head>
<body>
<div>
    Information about ${requestScope.track.title}
    <core:forEach var="artist" items="${requestScope.artists}">
        <ul><a href="/artist?artist_id=${artist._id}">Artist - ${artist.name}</a></ul>
    </core:forEach>
    <core:forEach var="album" items="${requestScope.albums}">
        <ul><a href="/album?album_id=${album._id}">Album - ${album.title}</a></ul>
    </core:forEach>
    <core:forEach var="genre" items="${requestScope.genres}">
        <ul><a href="/tracksByGenre?genre_id=${genre._id}">Genre - ${genre.genreTitle}</a></ul>
    </core:forEach>
    <ul><a>${requestScope.track.title}.mp3</a></ul>
    <audio src="playTrack/LetsMyPeopleGo.mp3" controls></audio>
    <footer><a href="/index">Main page</a></footer>
</div>
</body>
</html>