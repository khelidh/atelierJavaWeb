<%-- 
    Document   : _TEMPLATE
    Created on : 10 juil. 2018, 16:42:34
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Cache-Control" content="no-cache">
        <title>Template of Centurion</title>
        <link href="https://fonts.googleapis.com/css?family=Fredoka+One" rel="stylesheet"> 
        <link href="https://fonts.googleapis.com/css?family=Boogaloo|Fredoka+One" rel="stylesheet">
        
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <c:import url="HEADER.jsp"/>
        <c:import url="_MENU.jsp"/>
        
        <div id="contenu">      <p>Contenu</p>    </div>
        
        <c:import url="_FOOTER.jsp"/>
        <c:import url="_JAVASCRIPT.jsp"/>
        
            
        
    </body>
</html>
