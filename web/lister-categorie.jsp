<%-- 
    Document   : lister-categorie
    Created on : 9 juil. 2018, 16:09:34
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lister avec ForEach</title>
    </head>
    <body>
        <h1>Liste des Catégories</h1>
     
        <c:forEach var="categorie" items="${listeCat}">
            ${categorie.nom}
            <br>
        </c:forEach>
            
        
        
       
        
    </body>
</html>
