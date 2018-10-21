<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add a Cat</title>
</head>
<body>
<form action="cats" name="add" method="post">
    name: <input type="text" name="name"/>
    <br/>
    race: <input type="text" name="race"/>
    <br/>
    color: <input type="text" name="color"/>
    <br/>
    <input type="submit" name="btn1" value="add"/>
    <br/>
    <input type="submit" name="btn2" value="show"/>
    <br/>
    <br/>

    What color cats would you like to search for?
    <br/>
    <input type="text" name="search"/>
    <input type="submit" name="btn3" value="filter&show"/>
</form>
</body>
</html>