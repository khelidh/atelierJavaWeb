<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${cookie.theme ne null}">
    <link rel="stylesheet" href="../cssTemplate/${cookie.theme.value}.css" />
</c:if>


    
<%--<c:if test="${cookie.theme.value == 'theme1'}">
    <link rel="stylesheet" href="../cssTemplate/theme1.css" />
</c:if>
<c:if test="${cookie.theme.value == 'theme2'}">
    <link rel="stylesheet" href="../cssTemplate/theme2.css" />
</c:if>--%>

