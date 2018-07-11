<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav id="menu">
    <a class="lien" href="#">Clients</a>
    <a class="lien" href="#">Produits</a>
    <a class="lien" href="#">Catégories</a>
    <a class="lien" href="#">Mon compte</a>
    <a class="lien" href="#">Logout</a>
    <a class="lien" href="#">Inscription</a>
    
    <a class="choixTemplate" href="<c:url value='/theme-template?theme=theme1'/>"><img width="16px" height="16px" src="./image/drapeau_france.png" alt="france"/></a>
    <a class="choixTemplate" href="<c:url value='/theme-template?theme=theme2'/>"><img width="16px" height="16px" src="./image/drapeau allemagne.png" alt="allemagne"/></a>
       
    
</nav>