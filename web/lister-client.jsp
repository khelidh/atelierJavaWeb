<%-- 
    Document   : lister-client
    Created on : 10 juil. 2018, 10:19:37
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Liste des Clients</title>

        <link rel="stylesheet" href="css/styleListeClient.css"/>
        <link href="https://fonts.googleapis.com/css?family=Concert+One" rel="stylesheet"> 
    
    </head>
    <body>
        Bonjour ${cookie.parfum.value}
        <div id="conteneur">   
            <header>
                <h1>BOUTIQUE</h1>
                <h3>Vivez plus heureux en achetant dans notre boubou</h3>
            </header>
            <main>
                <h2>Liste des Clients</h2>
                <p>
                    
                    Ils nous font confiance !
                </p>
                <a class="lien lienInscription" href="<c:url value="/inscription"/>">Inscription</a>
                <ul>
                    
                    <c:forEach items="${clients}" var="client">
                        <li>
                            <p>${client.nom} ${client.prenom}</p>
                            <a class="lien lienSup" href="<c:url value="/supprimer-client"/>?idClient=${client.id}">Supprimer</a>
                        </li>
                        <br>
                    </c:forEach>  
    
                </ul>
            </main> 
        </div>
    </body>
</html>
