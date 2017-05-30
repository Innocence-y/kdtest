<%--
  Created by IntelliJ IDEA.
  User: WWWW
  Date: 2017/5/29
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Operate</title>
</head>
<body>
<form align="center" action="kd_updateServlet" method="post">
    <table >
    <tr>
        <td>ID:</td>
        <td><input type="text" name="id" value=<%=request.getParameter("id") %>></td>
    </tr>
    <tr>
        <td>快递编号：</td>
        <td><input type="text" name="kd_id" value=""></td>
    </tr>
    <tr>
        <td>收件人：</td>
        <td><input type="text" name="receiver" value=""></td>
    </tr>
    <tr>
        <td>地址：</td>
        <td><input type="text" name="address" value=""></td>
    </tr>
    <tr>
        <td>电话：</td>
        <td><input type="text" name="tele" value="" ></td>
    </tr>
    <tr>
        <td>派送人：</td>
        <td><input type="text" name="sender" value=""></td>
    </tr>
        <tr align="center">
        <td>派送状态: </td>
        <td> <select  name="status">
            <option value="">no</option>
            <option value="">yes</option>
        </select>
        </td>
    </tr>

    <tr>
        <td><input type="submit" value="确定"></td>
        <td><input type="reset" value="取消"></td>
    </tr>
    </table>
</form>

</body>
</html>
