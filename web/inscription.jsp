<%-- 
    Document   : inscription
    Created on : 10 juil. 2018, 10:19:22
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscription</title>
        
        <link rel="stylesheet" href="css/styleInscription.css"/>
        
        <link href="https://fonts.googleapis.com/css?family=Satisfy" rel="stylesheet"> 
        
    </head>
    <body>
        <div id="conteneur">
            
            <header>
                
                <h1>BOUTIQUE</h1>
                <h3>Vivez plus heureux en achetant dans notre boubou</h3>
                
            </header>
            <main>
                
                <h2>Inscription</h2>
                <p>
                    Pour commander dans notre boutique et profitez des nombreuses promotions, il faut s'inscrire !
                </p>
                
                <form method="POST">
                    
                    <label>Nom</label>
                    <input class="texte" type="text" name="nom" /> 
                    
                    <label>Prénom</label>
                    <input class="texte" type="text" name="prenom" /> 
                    
                    <label>Rue</label>
                    <input class="texte" type="text" name="rue" /> 
                    
                    <label>Numéro de rue</label>
                    <input class="texte" type="text" name="numero" /> 
                    
                    <label>Code postal</label>
                    <input class="texte" type="text" name="codePostal" /> 
                    
                    
                    <input class="bouton" type="submit" value="Valider l'inscription" /> 
                    
                </form>
     
            </main> 
        </div>
   
    </body>
</html>
