<%-- 
    Document   : client
    Created on : 27 nov. 2018, 16:18:51
    Author     : pedago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edition des données utilisateurs </title>
    </head>
    <body>
        <h1>Edition des données utilisateurs </h1>
        <form method="POST">
            <label>Nom : </label>
                <input name="nom" value="${user.name}">
                    <p></p>
                <label>Adresse N°1 :  </label>
                <input name="adresse1" value="${user.addr1}" >
                   <p></p>
                   
                <label>Adresse N°2 :  </label>
                <input name="adresse2" value="${user.addr2}" >
                   <p></p>
                   
                <label>Zip : </label>
                
                <select name="zip">
                    <c:forEach items="${micromarkets}" var="micromarket" >
                        <option value="${micromarker.zipCode}" <c:if test="${zip.zipCode=user.zip}" >selected</c:if>>${zip.zipCode}</option>  
                    </c:forEach>
                </select>
                   <p></p>
                   
                <label>Ville :  </label>
                <input name="ville" value="${user.city}" >
                   <p></p>
                   
                <label>Etat :  </label>
                <input name="etat" value="${user.state}" >
                   <p></p>
                   
                <label>N°de téléphone :   </label>
                <input name="tel" value="${user.phone}" >
                   <p></p>
                   
                <label>Fax : </label>
                <input name="fax" value="${user.fax}" >
                   <p></p>
                   
                <label>Email :</label>
                <input name="email" value="${user.email}" type="email" >
                
                
                
		<input name="action" value="Modifier" type="SUBMIT">
               
        </form>
                
        <p>${message}</p>
        
        <a href="${editPurchaseOrdersURL}">Editer ses bons de commandes</a>
        <a href="${exitURL}">Se déconnecter</a>
    </body>
</html>
