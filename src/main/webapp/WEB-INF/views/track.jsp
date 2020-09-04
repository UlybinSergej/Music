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
    <ul><button onclick="window.location.href = '/artist?artist_id=${artist._id}';">Artist - ${artist.name}</button></ul>
     </core:forEach>
     <core:forEach var="album" items="${requestScope.albums}">
         <ul><button onclick="window.location.href = '/album?album_id=${album._id}';">Album - ${album.title}</button></ul>
     </core:forEach>
     <core:forEach var="genre" items="${requestScope.genres}">
         <ul><button onclick="window.location.href = '/tracksByGenre?genre_id=${genre._id}';">Genre - ${genre.genreTitle}</button></ul>
     </core:forEach>
     <audio src="data:audio/mp3;base64,${track.resource}" controls></audio>
     <footer><button onclick="window.location.href = '/index';">Main page</button></footer>
 </div>
 </body>
 </html>