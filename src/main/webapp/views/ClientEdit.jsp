<%-- 
    Document   : clientEdit
    Created on : 28 nov. 2018, 15:17:47
    Author     : pedago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="../css/ClientEdit.css">
        <title>Edition des bon de commandes </title>
    </head>
    <body>
        <h1> Edition des bon de commandes  </h1>
         <div id="box">
       <form method="POST">
           <div class="article">
           <label for ="article "> <span> Nom de l'article :</span> </label>
            
                  <select id ="article" name="article">
                    <c:forEach items="${articles}" var="article" >
                        <option value="${article.productID}" <c:if test="${article.productID=purchaseOrder.productId}" >selected</c:if>>${article.description} </option>  
                    </c:forEach>
                  </select>
                    
           </div>
                   
           <div class =" quantites">
               <label for = quantites> <span> Quantitées : </span> </label>
                <input id="quantites" name="quantites" value="${purchaseOrder.quantity}" style="width:200px;" >
                   
           </div>     
                
            <div class="Frais"> 
                
                <label for="Frais "> <span> Frais de Ports  :  </span> </label>
                <input id="Frais" name="Frais" value="${purchaseOrder.shippingcost}"  style="width:200px;">
                
            </div>
                
            <div class="dateA">
                <label for="dateA"> <span> Date d'achat  : </span>  </label>
                <input  id="dateA" name="dateA" value="${purchaseOrder.salesdate}" style="width:200px;" >
            </div>
            
            <div class="dateE" >
                <label for="dateE"> <span> Date d'envois : </span> </label>
                <input id="dateE" name="dateE" value="${purchaseOrder.shippingdate}" style="width:200px;" >
            </div>
           
            <div class="tel">
                <label for="tel"> <span>Nom de l'entrepise : </span>  </label>
                <input id="tel" name="tel" value="${purchaseOrder.freighcompany}" style="width:200px;" >
                
            </div>    
		<input name="action" value="Modifier/ajout" type="SUBMIT">
               
        </form>
         </div>
                 
                
                <div id=" result">
                <table border="1">
                    <tr><th>Nom de l'article</th><th>Quantitées</th><th> Frais de Ports</th><th>Date d'achat</th><th>Date d'envois</th><th>Nom de l'entrepise</th><th>Action</th></tr>
				<c:forEach var="pur" items="${purchaseOrders}">
					<tr>
						<td>${pur.name}</td>
						<td>${pur.quantity}</td>
                                                <td>${pur.shippingcost}</td>
                                                <td>${pur.salesdate}</td>
                                                <td>${pur.shippingdate}</td>
                                                <td>${pur.freighcompany}</td>
                                                <input type="hidden" name="ordernum" value="${pur.ordernum}">
						<td><input name="sup" value="Supprimmer" type="SUBMIT"></td>
					</tr>	  		    
				</c:forEach>  
			</table>
                
                </div>
                
    <a href="${exitURL}">Se déconnecter</a>            
    </body>
</html>
