<%@ page import="com.bean.Kd" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: WWWW
  Date: 2017/5/29
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Function</title>
</head>
<body>
<%
    List<Kd> listall=new ArrayList<Kd>();
    listall=(List<Kd>)request.getAttribute("list");
%>
<table align="center" border=1 >
    <tr>
        <td>ID</td>
        <td>KD_ID</td>
        <td>Receiver</td>
        <td>Address</td>
        <td>Tele</td>
        <td>Sender</td>
        <%--<td>myDate</td>--%>
        <td>Status</td>
        <td align="center">OPERATE</td>
    </tr>

    <%
        int i=1;
        for(Kd kd:listall ){
    %>

    <tr>
        <td><%= i++ %></td>
        <td><%=kd.getKd_id() %></td>
        <td><%=kd.getReceiver() %></td>
        <td><%=kd.getAddress() %></td>
        <td><%=kd.getTele() %></td>
        <td><%=kd.getSender() %></td>
        <%--<td><%=kd.getMydate() %></td>--%>
        <td><%=kd.getStatus()%></td>
        <td>
            <a href="kd_deleteServlet?id=<%=kd.getId() %>">DELETE</a>
            <a href="kd_update.jsp?id=<%=kd.getId() %>">UPDATE</a>
            <%--<a href="kd_selectById?id=<%=kd.getId() %>">UPDATE</a>--%>
        </td>
    </tr>
    <%
        }
    %>
</table>
    <%


    %>
</body>
</html>
