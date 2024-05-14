<%-- 
    Document   : header
    Created on : 14 mai 2024, 11:02:12
    Author     : Valentina Sarais
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
    <div class="logo">
        <a href="<c:url value="/acceuil"/>">
            Kakarot
        </a>
    </div>
    <ul>
            <a href="<c:url value="/rechercher" />"><li>Rechercher</li></a>
    </ul>
</header>