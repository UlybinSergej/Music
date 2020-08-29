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
        <ul><a href="/tracksByGenre?genre_id=${genre._id}">${genre.genreTitle}</a></ul>
    </core:forEach>
    <footer><a href="/index">Main page</a></footer>
</div>
</body>
</html>