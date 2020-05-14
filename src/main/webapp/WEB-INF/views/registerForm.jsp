<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
a{
	text-decoration: none;
}
</style>
</head>
<body>
<h1>게시글 등록</h1>
<form action="insert.kosta" method="post">
	글번호: <input type="text" name="no"/> <!-- list[0]이 맞는지 생각하기 --><p>
	제목: <input type="text" name="subject"/><p>
	내용: <textarea rows="10" cols="20" name="content"></textarea><p>
	날짜: <input type="text" name="date"/><p>
	작성자: <input type="text" name="writer"/><p>
	
	<input type="submit" value="작성완료"/>
</form>

<button><a href="index.html">시작 페이지로</a></button>
</body>
</html>