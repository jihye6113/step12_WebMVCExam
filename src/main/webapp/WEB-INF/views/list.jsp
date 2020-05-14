<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
  table{width: 800px; border: solid orange 5px;}
  th,td{border: 1px gray solid; text-align: center;}
  a{
	text-decoration: none;
  }
</style>
</head>
<body>
<h3>Board LIST</h3>

<table>
 <tr>
   <th>번호</th>
   <th>제목</th>
   <th>날짜</th>
   <th>작성자</th>
   <th>삭제</th>
 </tr>
 <c:forEach items="${list}" var="board" >
    <tr>
   <th>${board.no}</th>
   <th>${board.subject}</th>
   <th>${board.date}</th>
   <th>${board.writer}</th>
   <th>삭제</th>
 </tr>
 </c:forEach>
</table>
<br>
<button><a href="registerForm.kosta">등록하기</a></button>
<button><a href="index.html">목록으로</a></button>
</body>
</html>




