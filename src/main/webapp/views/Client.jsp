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
        <title>L'appli</title>
    </head>
    <body>
        <form method="POST">
            <label>Nom : </label>
                <input name="nom" value="${nom}">
                    <p></p>
                <label>Adresse N°1 :  </label>
                <input name="adresse1" value="${adresse1}" >
                   <p></p>
                   
                <label>Adresse N°2 :  </label>
                <input name="adresse2" value="${adresse2}" >
                   <p></p>
                   
                <label>Zip : </label>
                <select name="zip">
                    <c:forEach items="${zip}" var="titre" >
                        <option value="${titre}"> ${titre} </option>  
                    </c:forEach>
                    
                </select>
                   <p></p>
                   
                <label>Ville :  </label>
                <input name="ville" value="${ville}" >
                   <p></p>
                   
                <label>Etat :  </label>
                <input name="etat" value="${etat}" >
                   <p></p>
                   
                <label>N°de téléphone :   </label>
                <input name="tel" value="${tel}" >
                   <p></p>
                   
                <label>Fax : </label>
                <input name="fax" value="${fax}" >
                   <p></p>
                   
                <label>Email :</label>
                <input name="email" value="${email}" type="email" >
                
                
                
		<input name="action" value="Modifier" type="SUBMIT">
               
        </form>
                <p>
                    ${message}
                </p>
                    <form method="GET"> 
                        <input name="action" value="purcharseorder" type="hidden">
                        <input value="Editer ses bons de commandes" type="SUBMIT">
                    </form>
    </body>
</html>
