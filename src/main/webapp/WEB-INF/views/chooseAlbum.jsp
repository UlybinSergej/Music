<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Java In HTML</title>
    <link rel="stylesheet" href="/css?css=bootstrap.css">
    <link rel="stylesheet" href="/css?css=fontawesome.min.css">
    <link rel="stylesheet" href="/css?css=main.css">
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
        <div class="row left_side">
            <div class="col-lg-8 col-lg-offset-2">
                Albums:
                <core:forEach var="album" items="${requestScope.albums}">
                    <ul><a href="/album?album_id=${album._id}">${album.title}</a></ul>
                </core:forEach>
            </div>
        </div>
    </div>
</div>
</body>
</html>