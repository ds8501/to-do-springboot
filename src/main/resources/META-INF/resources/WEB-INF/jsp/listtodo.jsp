<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %>


<HTML>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<BODY>
<div class="container">
 WELCOME TO your TO-DO LIST PAGE
 ${name}

 <table class="table">
   <thead>
         <tr>
            <th>id</th>
            <th>description</th>
            <th>target date    </th>
            <th>    is done? </th>
         </tr>
    </thead>
    <tbody>
         <c:forEach items="${todos}" var="todo">
         <tr>
           <td>${todo.id}</td>
           <td>${todo.description}</td>
           <td>${todo.targetDate}</td>
           <td>${todo.done}</td>


         </c:forEach>
    </tbody>
 </table>
 <a href="add-todo" class="btn btn-success">Add todo</a>
 </div>
 <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
 <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</BODY>
</HTML>