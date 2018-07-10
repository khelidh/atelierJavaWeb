<%-- 
    Document   : AjouterCategorie
    Created on : 9 juil. 2018, 12:22:37
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catégories</title>
        
        <link rel="stylesheet" href="css/style.css"/>
        
        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Wendy+One" rel="stylesheet">     
        
    </head>
    <body>
        <main>

            <h1>Ajouter une nouvelle catégorie</h1>

            <form method="POST">
                <label><span class="infobulle" aria-label=" de la catégorie">NOM</span></label>
                <input class="texte" type="text" name="nom"/>
                <input class="bouton" type="submit" name="bouton" value="Ajouter"/>
            </form>




        </main>



    </body>
</html>
