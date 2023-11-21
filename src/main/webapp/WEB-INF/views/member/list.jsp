<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC -"//W3C//DTD HTML 4.01 Transitional//EN" 
                       "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;" charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <thead>
      <tr>
          <th>이름</th>
          <th>나이</th>
      </tr>
   </thead>

   <c:forEach items="${list}" var="board">
      <tr>
          <td><c:out value="${board.name}" /></td>
          <td><c:out value="${board.age}" /></td>
      </tr>
   </c:forEach>

 
</body>
</html>