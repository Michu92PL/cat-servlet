<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show all cats</title>
</head>
<body>

<c:forEach var="cat" items="${allcats}" varStatus="loop">

<c:out value= "CAT ${loop.count}:"/>
<br/>
<c:out value="name: ${cat.name}"/>
<br/>
<c:out value="race: ${cat.race}"/>
<br/>
<c:out value="color: ${cat.color}"/>
<br/>
<br/>
</c:forEach>
</body>
</html>