<%--
  Created by IntelliJ IDEA.
  User: WWWW
  Date: 2017/5/28
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <form action="servlet/kd_RegServlet"  method="post" >
    <table align="center" border="6" cellpadding="10" bgcolor="white"  width="50%">
      <caption>快递录入</caption>
      <tr align="center">
        <td colspan="2"><font size="30" color="yellow">登陆</font></td>
      </tr>
      <tr align="center">
        <td>快件编号:</td>
        <td><input type="text" name="kd_id" value="" /></td>
      </tr>
      <tr align="center">
        <td>收件人:</td>
        <td><input type="text" name="receiver" value="" /></td>
      </tr>
      <tr align="center">
        <td>收件地址:</td>
        <td><input type="text" name="address" value="" /></td>
      </tr>
      <tr align="center">
        <td>电话:</td>
        <td><input type="text" name="tele" value="" /></td>
      </tr>
      <tr align="center">
        <td>派送人:</td>
        <td><input type="text" name="mydate" value="" /></td>
      </tr>
      <%--<tr align="center">--%>
        <%--<td>日期:</td>--%>
        <%--<td><input type="text" name="tele" value="" /></td>--%>
      <%--</tr>--%>
      <tr align="center">
        <td>派送状态: </td>
        <td> <select name="status">
        <option value="">no</option>
        <option value="">yes</option></select></td>
      </tr>
      <tr align="center">
        <td><input type="submit" value="录入" /></td>
        <td><input type="reset" value="重置" /></td>
      </tr>
    </table>
  </form>
  </body>
</html>
