<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/23
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="updateDept.do" method="post" >
        部门编号 <input type="text" readonly  name="deptno" value="${d.deptno}" >
        部门名称 <input type="text" name="dname" value="${d.dname}" >
              <input type="submit" value="更新">
    </form>


</body>
</html>
