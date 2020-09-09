<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Java In HTML</title>
    <link rel="stylesheet" href="/css?css=bootstrap.css">
    <link rel="stylesheet" href="/css?css=fontawesome.min.css">
    <link rel="stylesheet" href="/css?css=main.css">
    <style>
        #line_block {
            width:49%;
            float:left;
            margin: 0 0 0 0;
            text-align:left;
            padding: 0;
        }
    </style>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/index">My music player</a>
        </div>
        <div class="navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="/chooseGenre">Genres</a></li>
                <li class="active"><a href="/chooseTrack">Tracks</a></li>
                <li class="active"><a href="/chooseArtist">Artists</a></li>
                <li class="active"><a href="/chooseAlbum">Albums</a></li>
                <li class="active"><a href="/info"><i class="fa fa-envelope" aria-hidden="true"></i></a></li>
            </ul>
        </div>
    </div>
</div>
<div id="headerwrap">
    <div class="container">
        <div class="row centered">
            <div id="line_block">
                <ul class="left_side"><h1>${album.title}</h1></ul>
                <ul><h>${album.description}</h></ul>
                <ul><p>Genres:</p></ul>
                <core:forEach var="genre" items="${requestScope.genres}">
                    <ul><a href="/tracksByGenre?genre_id=${genre._id}">${genre.genreTitle}</a></ul>
                </core:forEach>
                <ul><p>Artists:</p></ul>
                <core:forEach var="artist" items="${requestScope.artists}">
                    <ul><a href="/artist?artist_id=${artist._id}">${artist.name}</a></ul>
                </core:forEach>
                <ul><p>Tracks:</p></ul>
                <core:forEach var="track" items="${requestScope.tracks}">
                    <ul><a href="/track?track_id=${track._id}">${track.title}</a></ul>
                </core:forEach>
            </div>
                <div id="line_block">
                <img src="${album.picture[0]}" width="${album.picture[1]}" height="${album.picture[2]}" class="right_side">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>