<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <title>Java In HTML</title>
</head>
<body>
<div>
    <core:forEach var="artist" items="${requestScope.artists}">
        <ul><a href="/artist?artist_id=${artist._id}">${artist.name}</a></ul>
    </core:forEach>
    <footer><a href="/index">Main page</a></footer>
</div>
</body>
</html>