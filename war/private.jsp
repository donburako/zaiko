<%@ page language="java" contentType="text/html; charset=utf8"
        pageEncoding="utf8" %>
<%@ page import="com.google.appengine.api.users.*" %>
<%
User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type"
            content="text/html; charset=utf-8">
        <title>Private Page</title>
    </head>
    <body>
        <h1>ログインに成功しました。</h1>
        <div>※このページは、公開されていないプライベートなページです。</div>
        <div>在庫確認を続けてください。 </div>
        <div style="font-weight: bold;">ユーザー：<%=user.getNickname() %></div>
        <br>
        <div><a href="/index.html">在庫確認へ</a></div>
        <div><a href="/logout">Logout</a></div>
    </body>
</html>
